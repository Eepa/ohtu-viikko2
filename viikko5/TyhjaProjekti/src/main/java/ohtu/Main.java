package ohtu;
//
//public class Main {
//
//    public static void main(String[] args) {
//    }
//}
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

public class Main {

    public static void main(String[] args) throws IOException {
        String studentNr = "014152724";
        if ( args.length>0) {
            studentNr = args[0]; // Saa komentoriviltä oppilasnumeron ensimmäisenä argumenttina
        }

        String url = "http://ohtustats.herokuapp.com/students/"+studentNr+"/submissions";

        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        client.executeMethod(method);

        InputStream stream =  method.getResponseBodyAsStream();

        String bodyText = IOUtils.toString(stream);

        System.out.println("json-muotoinen data:");
        System.out.println( bodyText );

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        System.out.println("Oliot:");
        for (Submission submission : subs) {
            System.out.println(submission);
        }
        
        int tehtaviaYhteensa = 0;
        int tuntejaYhteensa = 0;
        
        for(Submission submission : subs){
            tehtaviaYhteensa += submission.getTehtaviaYhteensa();
            tuntejaYhteensa += submission.getHours();
        }
        
        System.out.print("Yhteensä: " + tehtaviaYhteensa + " tehtävää ja " + tuntejaYhteensa + " tuntia");

    }
}
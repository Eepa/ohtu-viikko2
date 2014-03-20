

package ohtu.verkkokauppa;

import java.util.ArrayList;


public interface KirjanpitoRajap {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}

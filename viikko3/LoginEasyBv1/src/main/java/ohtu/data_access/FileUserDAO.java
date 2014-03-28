package ohtu.data_access;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ohtu.domain.User;

public class FileUserDAO implements UserDao {

    private File tiedosto;
    private Scanner lukija;
    private FileWriter kirjoittaja;
    private List<User> users;

    public FileUserDAO(String tiedostopolku) {
        tiedosto = new File(tiedostopolku);
        users = new ArrayList<User>();

        this.avaaLukija();

        this.avaaKirjoittaja();
    }

    @Override
    public List<User> listAll() {
        this.avaaLukija();
        try {
            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();

                String[] osat = rivi.split(" ");

                users.add(new User(osat[0], osat[1]));

            }
            
            lukija.close();

        } catch (Exception e) {
            System.out.println("There has been error while listing users. "
                    + "Error: " + e.getMessage());
            return null;
        }

        return users;
    }

    @Override
    public User findByName(String name) {
        
        this.avaaLukija();
        try {
            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
                if (rivi.contains(name)) {
                    
                    lukija.close();
                    String[] osat = rivi.split(" ");
                    
                    return new User(osat[0], osat[1]);
                }
            }
            lukija.close();

        } catch (Exception e) {
            System.out.println("There has been error while finding the user. "
                    + "Error: " + e.getMessage());
            return null;
        }

        return null;
    }

    @Override
    public void add(User user) {
        String kayttaja = user.getUsername() + " " + user.getPassword() + "\n";
        this.avaaKirjoittaja();
        try {
            kirjoittaja.append(kayttaja);
            kirjoittaja.close();
        } catch (Exception e) {
            System.out.println("There has been error while adding a user. "
                    + "Error: " + e.getMessage());
            return;
        }
    }
    
    private void avaaKirjoittaja(){
        try {
            kirjoittaja = new FileWriter(tiedosto, true);
        } catch (Exception e) {
            System.out.println("There has been error while making the file. "
                    + "Error: " + e.getMessage());
            return;
        }
    }
    
    private void avaaLukija(){
        try {
            lukija = new Scanner(tiedosto);
            
        } catch (Exception e) {
            System.out.println("There has been error while reading the file. "
                    + "Error: " + e.getMessage());
            return;
        }
    }

}

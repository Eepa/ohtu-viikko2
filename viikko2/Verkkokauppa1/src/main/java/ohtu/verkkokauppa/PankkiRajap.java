
package ohtu.verkkokauppa;

public interface PankkiRajap {

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
    
}

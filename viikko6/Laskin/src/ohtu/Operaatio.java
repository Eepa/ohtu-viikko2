package ohtu;

import javax.swing.JTextField;

public abstract class Operaatio implements Komento {

    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Sovelluslogiikka sovellus;
    

    public Operaatio(JTextField tuloskentta, JTextField syotekentta, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.sovellus = sovellus;
        
    }
    
     @Override
    public void suorita() {
        
        int arvo = this.etsiArvo();
        
        this.laske(arvo);
        
        this.paivitaKentat();
    }
    
     @Override
    public void peru() {
        this.peruutaLasku();
        this.paivitaKentat();
    }

     
    public int etsiArvo(){
        int arvo = 0;

        try {
            arvo = Integer.parseInt(this.syotekentta.getText());
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        return arvo;
    }
    
    public void paivitaKentat(){
        int laskunTulos = sovellus.tulos();
        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
    }
    
    protected abstract void laske(int arvo);
    protected abstract void peruutaLasku();

}

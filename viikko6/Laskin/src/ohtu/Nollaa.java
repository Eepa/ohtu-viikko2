package ohtu;

import javax.swing.JTextField;

public class Nollaa extends Operaatio {
    
    private JTextField tuloskentta;
    private Sovelluslogiikka sovellus;
    private int edellinenArvo;

    public Nollaa(JTextField tuloskentta, JTextField syotekentta, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, sovellus);
        this.tuloskentta = tuloskentta;
        this.sovellus = sovellus;
        this.edellinenArvo = 0;
    }


    @Override
    protected void laske(int arvo) {
        this.edellinenArvo = arvo;
        
        this.sovellus.nollaa();
    }

    @Override
    protected void peruutaLasku() {
        this.sovellus.plus(edellinenArvo);
        this.edellinenArvo = 0;
    }
    
    @Override
    public int etsiArvo(){
        int arvo = 0;

        try {
            arvo = Integer.parseInt(this.tuloskentta.getText());
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        return arvo;
    }

}

package ohtu;

import javax.swing.JTextField;

public class Erotus extends Operaatio {

 
    private Sovelluslogiikka sovellus;
    private int edellinenArvo;

    public Erotus(JTextField tuloskentta, JTextField syotekentta, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, sovellus);
        this.sovellus = sovellus;
        this.edellinenArvo = 0;
    }


    @Override
    protected void laske(int arvo) {
        this.sovellus.miinus(arvo);
        this.edellinenArvo = arvo;
    }

    @Override
    protected void peruutaLasku() {
        this.sovellus.plus(this.edellinenArvo);
        this.edellinenArvo = 0;
    }

}


package ohtu;

import javax.swing.JTextField;

public class Summa extends Operaatio{
    

    private Sovelluslogiikka sovellus;
    private int edellinenArvo;
    
    public Summa(JTextField tuloskentta, JTextField syotekentta, Sovelluslogiikka sovellus){
        super(tuloskentta, syotekentta, sovellus);
        this.sovellus = sovellus;
        this.edellinenArvo = 0;
    }




    @Override
    protected void laske(int arvo) {
       this.sovellus.plus(arvo);
        this.edellinenArvo = arvo;
    }

    @Override
    protected void peruutaLasku() {
       this.sovellus.miinus(this.edellinenArvo);
        this.edellinenArvo = 0;
    }
    
    
    
}

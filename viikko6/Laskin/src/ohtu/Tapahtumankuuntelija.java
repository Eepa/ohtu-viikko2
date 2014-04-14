package ohtu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JTextField;
 
public class Tapahtumankuuntelija implements ActionListener {

    private JButton nollaa;
    private JButton undo;
    private Komento edellinen;
    private Sovelluslogiikka sovellus;
    private Map<JButton, Komento> komennot;
 
    public Tapahtumankuuntelija(JButton plus, JButton miinus, JButton nollaa, JButton undo, JTextField tuloskentta, JTextField syotekentta) {
//        this.plus = plus;
//        this.miinus = miinus;
//        this.nollaa = nollaa;
//        this.undo = undo;
//        this.tuloskentta = tuloskentta;
//        this.syotekentta = syotekentta;
//        this.sovellus = new Sovelluslogiikka();
        

        this.nollaa = nollaa;
        this.undo = undo;

        this.sovellus = new Sovelluslogiikka();
        
        this.komennot = new HashMap<>();
        this.komennot.put(plus, new Summa(tuloskentta, syotekentta, sovellus));
        this.komennot.put(miinus, new Erotus(tuloskentta, syotekentta, sovellus));
        this.komennot.put(nollaa, new Nollaa(tuloskentta, syotekentta, sovellus));
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Komento komento = komennot.get(ae.getSource());
        
        if(komento != null){
            komento.suorita();
            this.edellinen = komento;
        } else {
            //toiminto oli undo
            this.edellinen.peru();
            this.edellinen = null;
        }
        
        this.nollaa.setEnabled(sovellus.tulos()!=0);
        this.undo.setEnabled(edellinen!=null);
//        int arvo = 0;
// 
//        try {
//            arvo = Integer.parseInt(syotekentta.getText());
//        } catch (Exception e) {
//        }
// 
//        if (ae.getSource() == plus) {
//            sovellus.plus(arvo);
//        } else if (ae.getSource() == miinus) {
//            sovellus.miinus(arvo);
//        } else if (ae.getSource() == nollaa) {
//            sovellus.nollaa();
//        } else {
//            System.out.println("undo pressed");
//        }
//        
//        int laskunTulos = sovellus.tulos();
//         
//        syotekentta.setText("");
//        tuloskentta.setText("" + laskunTulos);
//        if ( laskunTulos==0) {
//            nollaa.setEnabled(false);
//        } else {
//            nollaa.setEnabled(true);
//        }
//        undo.setEnabled(true);
    }
 
}
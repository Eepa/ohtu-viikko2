package ohtu.intjoukkosovellus;

public class JoukkoOperaatiot {

    public JoukkoOperaatiot() {

    }

    public static IntJoukko muodostaYhdiste(IntJoukko a, IntJoukko b) {
        IntJoukko yhdisteJoukko = new IntJoukko(a.joukonAlkioidenMaara() + b.joukonAlkioidenMaara());

        yhdisteJoukko = lisaaJoukkoon(yhdisteJoukko, a);

        yhdisteJoukko = lisaaJoukkoon(yhdisteJoukko, b);
        return yhdisteJoukko;
    }

    public static IntJoukko lisaaJoukkoon(IntJoukko alkuperainenJoukko, IntJoukko lisattavaJoukko) {
        int[] alkiot = lisattavaJoukko.getJoukonLuvut();

        for (int i = 0; i < lisattavaJoukko.joukonAlkioidenMaara(); i++) {
            alkuperainenJoukko.lisaaJoukkoon(alkiot[i]);
        }

        return alkuperainenJoukko;
    }

    public static IntJoukko muodostaLeikkaus(IntJoukko a, IntJoukko b) {
        IntJoukko yhdiste = new IntJoukko();
        
        int[] aTaulu = a.joukkoTaulukkona();
        int[] bTaulu = b.joukkoTaulukkona();
        
        for (int i = 0; i < aTaulu.length; i++) {
            
            
            for (int j = 0; j < bTaulu.length; j++) {
                if (aTaulu[i] == bTaulu[j]) {
                    yhdiste.lisaaJoukkoon(bTaulu[j]);
                }
            }
        }
        
        
        return yhdiste;

    }

    public static IntJoukko muodostaErotus(IntJoukko a, IntJoukko b) {
        IntJoukko z = new IntJoukko();
        int[] aTaulu = a.joukkoTaulukkona();
        int[] bTaulu = b.joukkoTaulukkona();
        for (int i = 0; i < aTaulu.length; i++) {
            z.lisaaJoukkoon(aTaulu[i]);
        }
        for (int i = 0; i < bTaulu.length; i++) {
            z.poistaJoukosta(i);
        }

        return z;
    }
}

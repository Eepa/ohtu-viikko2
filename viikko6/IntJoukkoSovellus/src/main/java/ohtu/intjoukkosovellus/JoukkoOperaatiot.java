package ohtu.intjoukkosovellus;

public class JoukkoOperaatiot {


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

        for (int i = 0; i < aTaulu.length; i++) {
            if (b.kuuluukoLukuJoukkoon(aTaulu[i])) {
                yhdiste.lisaaJoukkoon(aTaulu[i]);
            }
        }

        return yhdiste;

    }

    public static IntJoukko muodostaErotus(IntJoukko a, IntJoukko b) {
        IntJoukko erotus = new IntJoukko();

        int[] aTaulu = a.joukkoTaulukkona();

        for (int i = 0; i < aTaulu.length; i++) {
            if (!b.kuuluukoLukuJoukkoon(aTaulu[i])) {
                erotus.lisaaJoukkoon(aTaulu[i]);
            }
        }

        return erotus;
    }
}

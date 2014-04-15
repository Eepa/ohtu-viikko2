package ohtu.intjoukkosovellus;

public class IntJoukko {

    public final static int ALKUPERAINENKAPASITEETTI = 5, // aloitustalukon koko
            OLETUSTAULUKONKASVATUSMAARA = 5;  // luotava uusi taulukko on 
    // näin paljon isompi kuin vanha
    private int taulukonKasvatusmaara;     // Uusi taulukko on tämän verran vanhaa suurempi.
    private int[] joukonLuvut;      // Joukon luvut säilytetään taulukon alkupäässä. 
    private int joukonAlkioidenMaara;    // Tyhjässä joukossa alkioiden_määrä on nolla. 
    private static JoukkoOperaatiot joukkoOperaatiot;

    public IntJoukko() {
        joukonLuvut = new int[ALKUPERAINENKAPASITEETTI];
        for (int i = 0; i < joukonLuvut.length; i++) {
            joukonLuvut[i] = 0;
        }
        joukonAlkioidenMaara = 0;
        this.taulukonKasvatusmaara = OLETUSTAULUKONKASVATUSMAARA;
        this.joukkoOperaatiot = new JoukkoOperaatiot();

    }

    public IntJoukko(int kapasiteetti) {
        if (kapasiteetti < 0) {
            throw new IndexOutOfBoundsException("Kapasitteetti ei voi olla pienempi kuin 0.");
        }

        joukonLuvut = new int[kapasiteetti];
        for (int i = 0; i < joukonLuvut.length; i++) {
            joukonLuvut[i] = 0;
        }
        joukonAlkioidenMaara = 0;
        this.taulukonKasvatusmaara = OLETUSTAULUKONKASVATUSMAARA;

    }

    public IntJoukko(int kapasiteetti, int taulukonKasvatusmaara) {
        if (kapasiteetti < 0) {
            throw new IndexOutOfBoundsException("Kapasitteetti ei voi olla pienempi kuin 0.");
        }
        if (taulukonKasvatusmaara < 0) {
            throw new IndexOutOfBoundsException("Taulukkoa ei voi kasvattaa vähemmän kuin 0.");
        }
        joukonLuvut = new int[kapasiteetti];
        for (int i = 0; i < joukonLuvut.length; i++) {
            joukonLuvut[i] = 0;
        }
        joukonAlkioidenMaara = 0;
        this.taulukonKasvatusmaara = taulukonKasvatusmaara;

    }

    public boolean lisaaJoukkoon(int lisattavaLuku) {
        if (!kokeileLisataTyhjaanJoukkoon(lisattavaLuku)) {

            if (!kuuluukoLukuJoJoukkoon(lisattavaLuku)) {
                lisaaLukuJoukkoon(lisattavaLuku);

                kasvataJoukkoaJosSeOnTaysi();
                return true;
            }
        }

        return false;
    }

    public void lisaaLukuJoukkoon(int lisattavaLuku) {
        joukonLuvut[joukonAlkioidenMaara] = lisattavaLuku;
        joukonAlkioidenMaara++;
    }

    public boolean kokeileLisataTyhjaanJoukkoon(int lisattavaLuku) {
        if (joukkoTyhja()) {
            joukonLuvut[0] = lisattavaLuku;
            joukonAlkioidenMaara++;
            return true;
        }

        return false;
    }

    public void kasvataJoukkoaJosSeOnTaysi() {
        if (joukkoTaysi()) {
            kasvataJoukkoTaulukkoa();
        }
    }

    public void kasvataJoukkoTaulukkoa() {
        int[] vanhaTaulukko = joukonLuvut;

        joukonLuvut = new int[joukonAlkioidenMaara + taulukonKasvatusmaara];
        kopioiTaulukko(vanhaTaulukko, joukonLuvut);
    }

    public boolean joukkoTyhja() {
        return joukonAlkioidenMaara == 0;
    }

    public boolean joukkoTaysi() {
        return joukonAlkioidenMaara % joukonLuvut.length == 0;
    }

    public boolean kuuluukoLukuJoJoukkoon(int luku) {

        for (int i = 0; i < joukonAlkioidenMaara; i++) {
            if (luku == joukonLuvut[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean poistaJoukosta(int poistettavaLuku) {

        for (int i = 0; i < joukonAlkioidenMaara; i++) {
            if (poistettavaLuku == joukonLuvut[i]) {

                joukonLuvut[i] = joukonLuvut[joukonAlkioidenMaara - 1];
                joukonAlkioidenMaara--;

                return true;
            }
        }

        return false;
    }

    private void kopioiTaulukko(int[] vanha, int[] uusi) {
        for (int i = 0; i < vanha.length; i++) {
            uusi[i] = vanha[i];
        }
        
    }

    public int joukonAlkioidenMaara() {
        return joukonAlkioidenMaara;
    }

    @Override
    public String toString() {

        return "{" + lisaaJoukonLuvutEsitykseen() + "}";

    }

    public String lisaaJoukonLuvutEsitykseen() {
        String luvut = "";

        for (int i = 0; i < joukonAlkioidenMaara - 1; i++) {
            luvut += joukonLuvut[i] + ", ";
        }
        
        return luvut + joukonLuvut[joukonAlkioidenMaara - 1];
    }

    public int[] joukkoTaulukkona() {
        int[] palautettavaJoukko = new int[joukonAlkioidenMaara];
        
        for (int i = 0; i < palautettavaJoukko.length; i++) {
            palautettavaJoukko[i] = joukonLuvut[i];
        }
        return palautettavaJoukko;
    }
    
    public int[] getJoukonLuvut(){
        return this.joukonLuvut;
    }

    public static IntJoukko yhdiste(IntJoukko a, IntJoukko b) {
        return joukkoOperaatiot.muodostaYhdiste(a, b);
    }

    public static IntJoukko leikkaus(IntJoukko a, IntJoukko b) {
        return joukkoOperaatiot.muodostaLeikkaus(a, b);

    }

    public static IntJoukko erotus(IntJoukko a, IntJoukko b) {
        return joukkoOperaatiot.muodostaErotus(a, b);
    }

}

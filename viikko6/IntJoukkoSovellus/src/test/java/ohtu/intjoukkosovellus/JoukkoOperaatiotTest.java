package ohtu.intjoukkosovellus;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JoukkoOperaatiotTest {

    @Test
    public void toimiikoYhdisteTest() {
        IntJoukko eka = teeJoukko(1, 2);
        IntJoukko toka = teeJoukko(3, 4);

        IntJoukko tulos = JoukkoOperaatiot.muodostaYhdiste(eka, toka);
        int[] vastauksenLuvut = tulos.joukkoTaulukkona();
        Arrays.sort(vastauksenLuvut);

        int[] odotettu = {1, 2, 3, 4};

        assertArrayEquals(odotettu, vastauksenLuvut);
    }

    @Test
    public void toimiikoLeikkausTest() {
        IntJoukko eka = teeJoukko(1, 2, 4, 5);
        IntJoukko toka = teeJoukko(3, 4, 5);

        IntJoukko tulos = JoukkoOperaatiot.muodostaLeikkaus(eka, toka);
        int[] vastauksenLuvut = tulos.joukkoTaulukkona();
        Arrays.sort(vastauksenLuvut);

        int[] odotettu = {4, 5};

        assertArrayEquals(odotettu, vastauksenLuvut);
    }
    
     @Test
    public void toimiikoErotusTest() {
        IntJoukko eka = teeJoukko(1, 2, 3, 4);
        IntJoukko toka = teeJoukko(3, 4, 5);

        IntJoukko tulos = JoukkoOperaatiot.muodostaErotus(eka, toka);
        int[] vastauksenLuvut = tulos.joukkoTaulukkona();
        Arrays.sort(vastauksenLuvut);

        int[] odotettu = {1, 2};
         for(int i = 0; i < odotettu.length; i++){
            System.out.print(odotettu[i]);
        }
         System.out.println("");
         for(int i = 0; i < vastauksenLuvut.length; i++){
            System.out.print(vastauksenLuvut[i]);
        }

        assertArrayEquals(odotettu, vastauksenLuvut);
    }

    private IntJoukko teeJoukko(int... luvut) {
        IntJoukko joukko = new IntJoukko();

        for (int luku : luvut) {
            joukko.lisaaJoukkoon(luku);
        }

        return joukko;
    }
}

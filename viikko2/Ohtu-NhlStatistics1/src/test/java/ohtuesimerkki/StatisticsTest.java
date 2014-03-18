package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatisticsTest {

    public StatisticsTest() {
    }

    Statistics statistics;

    Reader readerStub = new Reader() {
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }

    };

    @Before
    public void setUp() {
        this.statistics = new Statistics(readerStub);
    }

    @Test
    public void pelaajanHakuToimiiJosPelaajaLoytyy() {
        Player pelaaja = this.statistics.search("Kurri");
        assertEquals("Kurri", pelaaja.getName());

    }

    @Test
    public void pelaajanHakuToimiiJosPelaajaaEiLoydy() {
        Player pelaaja = this.statistics.search("Jesse");
        assertEquals(null, pelaaja);

    }

    @Test
    public void joukkueenpelaajienHakuToimiiJosJoukkueLoytyy() {
        List<Player> pelaajat = this.statistics.team("EDM");
        assertEquals("Semenko", pelaajat.get(0).getName());
        assertEquals("Kurri", pelaajat.get(1).getName());
        assertEquals("Gretzky", pelaajat.get(2).getName());
    }
    
    @Test
    public void parhaidenLaukojienHakuToimiiTietyllaMaaralla() {
        List<Player> pelaajat = this.statistics.topScorers(2);
        assertEquals("Gretzky", pelaajat.get(0).getName());
        assertEquals("Lemieux", pelaajat.get(1).getName());
        
    }
}

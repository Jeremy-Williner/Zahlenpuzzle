package ch.bbbaden.m426.la8015.spiel;

import ch.bbbaden.m426.la8010.spiel.Spiel;
import ch.bbbaden.m426.la8010.loader.HardcodedPositionen;
import ch.bbbaden.m426.m426.la8015.loader.HardcodedPositionenGewonnen;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manuel Bachofner
 */
public class SpielTest {

    @Before
    public void setUp() {

    }

    /**
     * Test of hatGewonnen method, of class Spiel.
     */
    @Test
    public void testHatGewonnen() {

        Spiel spiel = new SpielImpl(new HardcodedPositionenGewonnen().getPositionen(0, 0));
        assertTrue("Spiel gewonnen", spiel.hatGewonnen());
    }

    /*
    Test ob Spieler nicht gewonnen hat
     */
    @Test
    public void testHatNichtGewonnen() {

        int[][] positionen = {{9, 1, 2, 3}, {4, 5, 6, 7}, {8, -1, 10, 11}};
        Spiel spiel = new SpielImpl(positionen);
        assertFalse("Spiel nicht gewonnen", spiel.hatGewonnen());
    }

    /**
     * Test geladenen Positionen
     *
     */
    @Test
    public void testLadePositionen() {
        HardcodedPositionen hardcodedPositionen = new HardcodedPositionen();
        int[][] positionen = hardcodedPositionen.getPositionen(4, 4);
        Spiel spiel = new SpielImpl(hardcodedPositionen.getPositionen(4, 4));
        assertArrayEquals(positionen, spiel.gibPositionen());
    }



   

    public class SpielImpl extends Spiel {

        public SpielImpl(int[][] postionen) {
            super(postionen);
        }

        @Override
        public void verschiebeWert(int value) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

    }
}

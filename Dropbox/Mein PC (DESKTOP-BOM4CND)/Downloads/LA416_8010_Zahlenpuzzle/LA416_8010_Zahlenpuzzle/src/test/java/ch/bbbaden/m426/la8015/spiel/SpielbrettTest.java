package ch.bbbaden.m426.la8015.spiel;

import ch.bbbaden.m426.la8010.spiel.Spiel;
import ch.bbbaden.m426.la8010.spiel.Spielbrett;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manuel Bachofner
 */


public class SpielbrettTest {
    
    public SpielbrettTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of verschiebeWert method, of class Spielbrett.
     */
    @Test
    public void testVerschiebeWert() {
        int[][] initialePositionen = {{1, 2, 3, 12, 16}, {4, 5, 6, 13, 17}, {7, 8, 10, 14, 18}, {9, -1, 11, 15, 19}};
        int[][] erwartetePositionen = {{1, 2, 3, 12, 16}, {4, 5, 6, 13, 17}, {7, -1, 10, 14, 18}, {9, 8, 11, 15, 19}};
        Spiel spiel = new Spielbrett(initialePositionen);
        spiel.verschiebeWert(8);
        assertArrayEquals("Wert verschoben", erwartetePositionen, spiel.gibPositionen());
    }
    
    /**
     * Test of verschiebeWert method, of class Spielbrett. Keine Wirkung
     */
    @Test
    public void testVerschiebeWertOhneWirkung() {
        int[][] initialePositionen = {{1, 2, 3, 12, 16}, {4, 5, 6, 13, 17}, {7, 8, 10, 14, 18}, {9, -1, 11, 15, 19}};
        int[][] erwartetePositionen = {{1, 2, 3, 12, 16}, {4, 5, 6, 13, 17}, {7, 8, 10, 14, 18}, {9, -1, 11, 15, 19}};
        Spiel spiel = new Spielbrett(initialePositionen);
        spiel.verschiebeWert(4);
        assertArrayEquals("Wert kann nciht verschoben werden", erwartetePositionen, spiel.gibPositionen());
    }
    
    /**
     * Test of verschiebeWert method, of class Spielbrett. Horizontaler test
     */
    @Test
    public void testVerschiebeWertHorizontal() {
        int[][] initialePositionen = {{1, 2, 3, 12, 16}, {4, 5, 6, 13, 17}, {7, 8, 10, 14, 18}, {9, -1, 11, 15, 19}};
        int[][] erwartetePositionen = {{1, 2, 3, 12, 16}, {4, 5, 6, 13, 17}, {7, 8, 10, 14, 18}, {9, 11, -1, 15, 19}};
        Spiel spiel = new Spielbrett(initialePositionen);
        spiel.verschiebeWert(11);
        assertArrayEquals("Wert wurde horizontal verschoben", erwartetePositionen, spiel.gibPositionen());
    }
    
    /**
     * Test of verschiebeWert method, of class Spielbrett. Vertikaler test
     */
    @Test
    public void testVerschiebeWertVertikal() {
        int[][] initialePositionen = {{1, 2, 3, 12, 16}, {4, 5, 6, 13, 17}, {7,-1, 10, 14, 18}, {9, 8, 11, 15, 19}};
        int[][] erwartetePositionen = {{1, 2, 3, 12, 16}, {4, -1, 6, 13, 17}, {7,5, 10, 14, 18}, {9, 8, 11, 15, 19}};
        Spiel spiel = new Spielbrett(initialePositionen);
        spiel.verschiebeWert(5);
        assertArrayEquals("Wert wurde vertikal verschoben", erwartetePositionen, spiel.gibPositionen());
    }
    
}

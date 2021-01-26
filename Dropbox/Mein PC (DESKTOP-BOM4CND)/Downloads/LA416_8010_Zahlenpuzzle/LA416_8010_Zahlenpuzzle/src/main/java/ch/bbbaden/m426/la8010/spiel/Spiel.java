package ch.bbbaden.m426.la8010.spiel;

import ch.bbbaden.m426.la8010.loader.PositionenLoader;

/**
 *
 * @author Manuel Bachofner
 */
public abstract class Spiel {
    protected final int LEER = -1;

    protected int[][] positionen;

    public Spiel(int[][] positionen) {
        this.positionen = positionen;
    }
    
    public abstract void verschiebeWert(int value);

    public boolean hatGewonnen() {
        int prevVal = 0;
        for (int[] row : positionen) {
            for (int val : row) {
                if (val != -1) {
                    if (prevVal >= val) {
                        return false;
                    }
                    prevVal = val;
                }
            }
        }
        return true;
    }

    public int[][] gibPositionen() {
        return positionen;
    }

    public void ladePositionen(PositionenLoader loader) {
        positionen = loader.getPositionen(positionen.length, positionen[0].length);

    }


    protected void verschiebeEinenStein(int startX, int startY, int endX, int endY) {
        int startWert = positionen[startY][startX];
        int endWert = positionen[endY][endX];

        positionen[startY][startX] = endWert;
        positionen[endY][endX] = startWert;

    }
   
}

package ch.bbbaden.m426.la8010.spiel;

/**
 *
 * @author Manuel Bachofner Dieses Spielbrett erlaubt nur das Verschieben
 * einzelner Steine
 */
public class Spielbrett extends Spiel {

    /**
     *
     * @param positionen
     */
    public Spielbrett(int[][] positionen) {
        super(positionen);
    }

    /**
     *
     * @param value
     */
    @Override
    public void verschiebeWert(int value) {
        for (int y = 0; y < positionen.length; y++) {
            for (int x = 0; x < positionen[y].length; x++) {
                if (positionen[y][x] == value) {
                    verschiebeNachLeer(x, y);
                    return;
                }
            }
        }
    }

    private void verschiebeNachLeer(int x, int y) {
        if (hatLinksPlatz(x, y)) {
            verschiebeEinenStein(x, y, x - 1, y);
            return;
        }
        if (hatRechtsPlatz(x, y)) {
            verschiebeEinenStein(x, y, x + 1, y);
            return;
        }

        if (hatObenPlatz(x, y)) {
            verschiebeEinenStein(x, y, x, y - 1);
            return;
        }
        
        if (hatUntenPlatz(x, y)) {
            verschiebeEinenStein(x, y, x, y + 1);
        }
    }

    private boolean hatObenPlatz(int x, int y) {
        return y!=0 && istLeer(positionen[y - 1][x]);
    }

    private boolean hatUntenPlatz(int x, int y) {
        return y + 1 < positionen.length && istLeer(positionen[y + 1][x]);
    }

    private boolean hatLinksPlatz(int x, int y) {
        return x!=0 && istLeer(positionen[y][x - 1]);
    }

    private boolean hatRechtsPlatz(int x, int y) {
        return x + 1 < positionen[0].length && istLeer(positionen[y][x + 1]);
    }

    private boolean istLeer(int wert) {
        return wert == LEER;

    }
}

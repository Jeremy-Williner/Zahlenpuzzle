package ch.bbbaden.m426.la8010.view;

import ch.bbbaden.m426.la8010.spiel.Spiel;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel Bachofner
 */
public class ConsoleGui implements Gui {

    boolean stop = false;

    @Override
    public void spiele(Spiel spiel) {
        zeichne(spiel.gibPositionen());
        while (!stop) {
            try {
                spiel.verschiebeWert(leseWert());
                zeichne(spiel.gibPositionen());
                stop = hatGestoppt() || spiel.hatGewonnen();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsoleGui.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println("spiel beendet");
    }

    @Override
    public void ziehe(int wert) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    private void zeichne(int[][] positionen) {

        System.out.println("___________________________________________");
        for (int i = 0; i < positionen.length; i++) {
            StringBuffer line = new StringBuffer();
            for (int j = 0; j < positionen[i].length; j++) {
                line.append(String.format("%2d |", positionen[i][j]));
            }
            System.out.println(line);
        }
        System.out.println("___________________________________________");

    }

    public int leseWert() throws IllegalArgumentException {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        final int input = Integer.parseInt(str);
        if (input > 0) {
            return input;
        } else if (input == 0) {
            stop = true;
        } else {
            System.out.println("User Input ist nicht valide");
        }
        return 0;

    }

    private boolean hatGestoppt() {
        return stop;
    }

}

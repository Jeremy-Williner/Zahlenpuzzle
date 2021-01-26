package ch.bbbaden.m426.la8010;

import ch.bbbaden.m426.la8010.loader.HardcodedPositionen;
import ch.bbbaden.m426.la8010.loader.PositionenLoader;
import ch.bbbaden.m426.la8010.spiel.Spiel;
import ch.bbbaden.m426.la8010.spiel.Spielbrett;
import ch.bbbaden.m426.la8010.view.Gui;
import ch.bbbaden.m426.la8010.view.ConsoleGui;

/**
 *
 * @author Manuel Bachofner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final PositionenLoader loader = new HardcodedPositionen();
       
        final Spiel spiel = new Spielbrett(loader.getPositionen(4,4));
        final Gui gui = new ConsoleGui();
        gui.spiele(spiel);
    }
}

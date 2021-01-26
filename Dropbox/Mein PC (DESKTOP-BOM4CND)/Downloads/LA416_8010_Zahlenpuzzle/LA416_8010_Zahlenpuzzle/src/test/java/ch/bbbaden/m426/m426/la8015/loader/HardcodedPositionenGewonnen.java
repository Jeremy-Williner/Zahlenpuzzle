package ch.bbbaden.m426.m426.la8015.loader;

import ch.bbbaden.m426.la8010.loader.PositionenLoader;





/**
 *
 * @author Manuel Bachofner
 */
public class HardcodedPositionenGewonnen implements PositionenLoader{

    @Override
    public int[][] getPositionen(int zeilen, int spalten) {
        int[][] positionen =  {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,-1}};
        return positionen;  
        
    }

}

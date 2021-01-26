package ch.bbbaden.m426.la8010.loader;



/**
 *
 * @author Manuel Bachofner
 */
public class HardcodedPositionen implements PositionenLoader{

    @Override
    public int[][] getPositionen(int zeilen, int spalten) {
        assert zeilen == 4;
        assert spalten == 4;
        int[][] positionen =  {{1,2,3,12,16},{4,5,6,13,17},{7,8,10,14,18},{9,-1,11,15,19}};
        return positionen;  
        
    }

}

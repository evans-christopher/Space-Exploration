/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.control;

import byui.cit260.spaceExploration.Exceptions.MapControlException;
import byui.cit260.spaceExploration.model.Map;
import byui.cit260.spaceExploration.model.Player;
import java.awt.Point;
import static java.lang.Math.abs;
import spaceexploration.SpaceExploration;

/**
 *
 * @author ibdch
 */
public class MapControl {
    public static Map createMap() throws MapControlException {
        //create the map
        Map map = null;
        
        System.out.println("\n createMap() called");
        return map;
    }

    static void placeCharacters(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public static void movePlayersLocation(Player player, Point coordinates) throws MapControlException {
                
       Map map = SpaceExploration.getCurrentGame().getMap();
       int newRow = coordinates.x-1;
       int newCol = coordinates.y-1;
       
       if(newRow < 0 || newRow >= map.getRowCount() ||
               newCol < 0 || newCol >= map.getColumnCount()){
           throw new MapControlException("Player cannot move here"
                    + coordinates.x + ", " + coordinates.y 
                    + ", because the location does not exist on the map.");
       }
       
   }
}


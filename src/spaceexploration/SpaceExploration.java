/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceexploration;

import byui.cit260.spaceExploration.model.Player;
import byui.cit260.spaceExploration.model.Ship;

/**
 *
 * @author ibdch
 */
public class SpaceExploration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Ship ship = new Ship();
        
        ship.setDamageAmount(67);
        
        String shipInfo = ship.toString();
        System.out.println(shipInfo);
    }
   
}

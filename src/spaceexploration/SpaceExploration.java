/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceexploration;

import byui.cit260.spaceExploration.model.Game;
import byui.cit260.spaceExploration.model.Player;
import citbyui.cit260.SpaceExploration.view.StartProgramView;


/**
 *
 * @author ibdch
 */
public class SpaceExploration {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SpaceExploration.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SpaceExploration.player = player;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }
   
}

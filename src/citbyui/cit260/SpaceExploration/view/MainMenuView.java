/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import byui.cit260.spaceExploration.control.GameControl;
import citbyui.cit260.SpaceExploration.view.ViewInterface.View;
import spaceexploration.SpaceExploration;

/**
 *
 * @author ibdch
 */
public class MainMenuView extends View{
    
   
    
    
    public MainMenuView() {
             super("\n"
                  + "\n--------------------------------------"
                  + "\n| Main Menu                           "
                  + "\n--------------------------------------"
                  + "\nN - Start New Game"
                  + "\nL - Load Saved Game"
                  + "\nH - Open Help Menu"
                  + "\nE - Exit"
                  + "\n--------------------------------------");
    }
    @Override
    public boolean doAction(String value) {
        //System.out.println("\n*** doAction() funcion called");
        
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "N": // create and start new game
                this.startNewGame();
                break;
            case "L": //Load saved game
                this.startExistingGame();
                break;
            case "H": //Open Help Menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
   
    private void startNewGame() {
        
        InGameView InGameView = new InGameView();
        InGameView.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu() {
         // Create HelpMenuView object
        HelpMenuView HelpMenuView = new HelpMenuView();
                
        //Display the help menu view
        HelpMenuView.display();
    }

}
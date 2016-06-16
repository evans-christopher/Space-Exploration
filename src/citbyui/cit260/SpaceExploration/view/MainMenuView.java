/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import citbyui.cit260.SpaceExploration.view.ViewInterface.View;

/**
 *
 * @author ibdch
 */
public class MainMenuView extends View{
    
    private String menu;
    private String choice;
    private String menuOption;
    
    
    
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

    public boolean doAction(String choice) {
        //System.out.println("\n*** doAction() funcion called");
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
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
        InGameView inGameView = new InGameView();
        
        inGameView.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu() {
         // Create HelpMenuView object
        HelpMenuView HelpMenuView = new HelpMenuView();
                
        //Display the help menu view
        HelpMenuView.displayHelpMenuView();
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    private static class choice {

        public choice() {
        }
    }
}

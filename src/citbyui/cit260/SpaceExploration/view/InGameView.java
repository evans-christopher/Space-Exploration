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
public class InGameView extends View {

    private String menuOption;
    private String choice;

    
    
    public InGameView() {
              super("\n"
                  + "\n--------------------------------------"
                  + "\n|In Game Menu                         "
                  + "\n--------------------------------------"
                  + "\nMAP - View Game Map"
                  + "\nMOVE - Input Coordinates for New Destination"
                  + "\nI - Talk to the Locals or Interact with the Area"
                  + "\nL - View Index of Visited Planets and Known Aliens"
                  + "\nR - Return Home"
                  + "\nS - Save Current Game"
                  + "\nH - Open Help Menu"
                  + "\nE - Exit"
                  + "\n--------------------------------------");
    }
    
    public boolean doAction(String choice) {
        //System.out.println("\n*** doAction() funcion called");
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "MAP": // View In-Game Map
                this.mapView();
                break;
            case "MOVE": //Open Movement Options
                this.movementView();
                break;
            case "I": //Open Interact
                this.interactView();
                break;
            case "L": //Open Index
                this.indexView();
                break;
            case "R": //End/Win the Game
                this.endGameView();
                break;
            case "S": //Open Interact
                this.saveView();
                break;
            case "H": //Open Interact
                this.helpMenuView();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void mapView() {
         System.out.println("*** mapView function called ***");
    }

    private void movementView() {
         // Create MainMenuView object
        MovementView movementView = new MovementView();
                
        //Display the main menu view
        movementView.displayMovementView();
    }

    private void interactView() {
         System.out.println("*** interactView function called ***");
    }

    private void indexView() {
         System.out.println("*** indexView function called ***");
    }

    private void endGameView() {
         System.out.println("*** endGameView function called ***");
    }

    private void saveView() {
         System.out.println("*** saveView function called ***");
    }

    private void helpMenuView() {
        // Create HelpMenuView object
        HelpMenuView HelpMenuView = new HelpMenuView();
                
        //Display the help menu view
        HelpMenuView.display();
    }

    @Override
    public boolean doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

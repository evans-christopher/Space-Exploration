/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import java.util.Scanner;

/**
 *
 * @author ibdch
 */
class InGameView {

    private String menuOption;
    private String choice;

    public void displayInGameView() {
         boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) //user wants to exit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }
    
    public InGameView() {
        this.menuOption = "\n"
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
                  + "\n--------------------------------------";
    }
    
    private String getMenuOption() {
        /*System.out.println("\n*** getMenuOption() function called ***");
        return "N";*/
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to  be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.menuOption);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return vaule entered
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
        HelpMenuView.displayHelpMenuView();
    }
    
}

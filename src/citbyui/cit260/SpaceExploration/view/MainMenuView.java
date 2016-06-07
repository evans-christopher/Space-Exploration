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
public class MainMenuView {
    
    private String menu;
    private String choice;
    private String menuOption;
    
    public void displayMainMenuView() {
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
    
    public MainMenuView() {
        this.menuOption = "\n"
                  + "\n--------------------------------------"
                  + "\n| Main Menu                           "
                  + "\n--------------------------------------"
                  + "\nN - Start New Game"
                  + "\nL - Load Saved Game"
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
        System.out.println("*** startNewGame function called ***");
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



    private static class choice {

        public choice() {
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class HelpMenuView {
    
   
    private String menu;
    private final String menuHelp;
    
    public void displayHelpMenuView() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("E")) //user wants to exit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(helpMenuOption);
        } while (!done);
    }
    
    public HelpMenuView() {
        this.menuHelp = "\n"
                  + "\n--------------------------------------"
                  + "\n| Help Menu                          |"
                  + "\n--------------------------------------"
                  + "\nW - Whats the objective"
                  + "\nH - How to move/Navigate"
                  + "\nG - Gathering/using resources"
                  + "\nR - Repairing Ship for voyage home"
                  + "\nE - Exit"
                  + "\n--------------------------------------";
    }
  private String getHelpMenuOption() {
        /*System.out.println("\n*** getHelpMenuOption() function called ***");
        return "N";*/
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to  be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.menuHelp);
            
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

 
public boolean doAction(String choice){
    
   choice = choice.toUpperCase(); //convert choice to upper case
   switch (choice) {
   //return true;
   case "W": //Objectives description
   this.objectHelp();
   break;
   case "H": // Moving and Navigating
   this.navigateHelp();
   break;
   case "G": //Obtaining and gathering resources
   this.gatherHelp();
   break;
   case "R": // Help for repairing ship
   this.repairShip();
   break;
   default:
   System.out.println("\n*** Invalid selection *** Please try again");
   break;
        
        }
    
    return false;
    
}

    private void objectHelp() {
      System.out.println("Objective Help function called");
    }

    private void navigateHelp() {
      System.out.println("Objective Navigate Help function called");
    }

    private void gatherHelp() {
      System.out.println("Objective Gather Help function called");
    }

    private void repairShip() {
      System.out.println("Objective Repair Ship function called");
      
      
    }
    }
    
    

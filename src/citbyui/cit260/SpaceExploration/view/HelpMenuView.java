/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

/**
 *
 * @author Erik
 */
public class HelpMenuView {
    
   
    private String menu;
    
    public void displayHelpMenuView() {
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
    
    public HelpMenuView() {
        this.menu = "\n"
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

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }

public boolean doAction(String choice){
System.out.println("\n*** doAction() function called ***");
        return true;
    }
    
   choice = choice.toUpperCase(); //convert choice to upper case
   switch (choice) {
   //return true;
   case "W": //Objectives description
   this.objectivehelp();
   break;
   case "H": // Moving and Navigating
   this.navigatehelp();
   break;
   case "G": //Obtaining and gathering resources
   this.gatherhelp();
   break;
   case "R": // Help for repairing ship
   this.repairship();
   break;
   default:
   System.out.println("\n*** Invalid selection *** Please try again");
   break;
        
        }
    
    return false;
    
}
    

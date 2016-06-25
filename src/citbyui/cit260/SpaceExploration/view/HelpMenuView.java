/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import citbyui.cit260.SpaceExploration.view.ViewInterface.View;

/**
 *
 * @author Erik
 */
public class HelpMenuView extends View {
    
   
    private String menu;
    
    
    public HelpMenuView(){
             super ("\n"
                  + "\n--------------------------------------"
                  + "\n| Help Menu                          |"
                  + "\n--------------------------------------"
                  + "\nW - Whats the objective"
                  + "\nH - How to move/Navigate"
                  + "\nG - Gathering/using resources"
                  + "\nR - Repairing Ship for voyage home"
                  + "\nE - Exit"
                  + "\n--------------------------------------");
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

    void displayHelpMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    }
    
    

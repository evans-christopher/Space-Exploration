/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import byui.cit260.spaceExploration.control.GameControl;
import byui.cit260.spaceExploration.model.Player;
import java.util.Scanner;

/**
 *
 * @author ibdch
 */
public class StartProgramView {
    
   
    
    private String promptMessage;
    
    public StartProgramView() {
        // prompMessage = "Please enter your name"
        
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when the view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                 "\n****************************************************"
                +"\n* Hello World!                                     *"
                +"\n****************************************************"
        );
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to  be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
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
    
 public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do {
            //Prompt for and get the players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            //do the requested action and display the next view
            done = this.doAction(playersName);
        
        }while (!done);
        
    }
 
    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
    }
    
}

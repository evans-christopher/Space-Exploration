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
public interface ViewInterface {
    
    public void display();
    public String getInput();
    public boolean doAction();
    
   
 
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do {
            //Prompt for and get the players name
            String value = this.getInput();
            if (value.toUpperCase().equals("E")) //user wants to quit
                return; //exit the game
            //do the requested action and display the next view
            done = this.doAction(value);
        } while (!done); //exit the view when done == true
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = null; //value to  be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nYou must enter a value.");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return vaule entered
    }

        private boolean doAction(String value) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    
}
}
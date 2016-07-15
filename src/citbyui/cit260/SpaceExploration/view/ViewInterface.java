/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import byui.cit260.spaceExploration.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ibdch
 */
public interface ViewInterface {
    
    public void display();
    public String getInput();
    public boolean doAction(String value);
    
   
 
public abstract class View implements ViewInterface {
    
    private String message;
    
    protected final BufferedReader keyboard = Game.getInFile();
    protected final PrintWriter console = Game.getOutFile();
    
    public View() {
    }
    
    protected String displayMessage;
    
    
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
        
        // get infile for keyboard
        String value = null; //value to  be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);
            
            try {
                value = this.keyboard.readLine(); // get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(ViewInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); // trim off leading and trailing blanks
        try{    
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                        "You must enter a value.");
                continue;
            }
            
            break; //end the loop
        }catch (Exception e) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading input: " + e.getMessage());
                return null;
                }
        }
        return value; //return vaule entered
    }
        
}
}
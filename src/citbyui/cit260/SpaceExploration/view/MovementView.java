/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import byui.cit260.spaceExploration.control.MapControl;
import java.util.Scanner;

/**
 *
 * @author ibdch
 */
public class MovementView {

    private int row;
    private int col;
    public int currentRow = 1;
    public int currentCol = 1;
    private String promptRowMessage;
    private String promptColMessage;
    
    public MovementView() {
        // prompMessage = "Please enter your name"
        
        this.promptRowMessage = "\nPlease enter the row number you wish to move to:";
        this.promptColMessage = "\nPlease enter the column number you wish to move to:";
        // display the banner when the view is created
        this.displayBanner();
    }
    
    private void displayBanner() {
        System.out.println(
                 "\n****************************************************"
                +"\n*Your Current Location: " + currentRow + "," + currentCol
        );
    }

    void displayMovementView() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String newRow = this.getRow() ;
            if (newRow.toUpperCase().equals("E")) //user wants to exit
                return; // exit the game
            String newCol = this.getCol() ;
            
            // do the requested action and display the next view
            done = this.doAction(newRow, newCol);
            
        } while (!done);
    }
    private String getRow() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to  be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptRowMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; //end the loop
        }
        return value;
    }
    
        
    private String getCol() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to  be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptColMessage);
            
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

    private boolean doAction(String newRow, String newCol) {
        
        double location = MapControl.calcDistance(currentRow, currentCol, row, col);
       
        
        this.displayNextView(location);
        return true;
    }


    private void displayNextView(String location) {
        currentRow = row;
        currentCol = col;
    
        System.out.println("\n========================================="
                          + "\nTotal distance traveled: " 
                          + location + " units"
                          + "\nYour new location is: " + currentRow + ", "
                          + currentCol
                          );
    }

    private void displayNextView(double location) {
        
    }

    
}

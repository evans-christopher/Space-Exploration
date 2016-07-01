/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import byui.cit260.spaceExploration.control.MapControl;
import citbyui.cit260.SpaceExploration.view.ViewInterface.View;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class MovementView extends View {
    
    public MovementView() {
        super("\nWelcome to the Starmap."
                + "\nPlease enter the location you would like to go."
                + "\n *********************************************"
                + "\n First enter the row you want to be in:");
    }
    
    @Override
    public boolean doAction(String row, String col) {
        int row = parseInt.Input();
        display.promptMessage("Now enter the desired column number:");
        int col = parseInt.Input();
        int currentRow = 1;
        int currentCol = 1;
        int distance = MapControl.calcDistance(row, currentRow, col, currentCol);
        /*System.out.println("doAction funtion called");
        String location = null;*
        
        this.displayNextView(location);
        
        return true;
    }


    private void displayNextView(int location) {
        currentRow = row;
        currentCol = col;
    
        System.out.println("\n========================================="
                          + "\nTotal distance traveled: " 
                          + location + " units"
                          + "\nYour new location is: " + currentRow + ","
                          + currentCol
                          );
    }

    private void displayNextView(double location) {
        
    }*/

    
}

    void displayMovementView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import byui.cit260.spaceExploration.control.MapControl;
import static citbyui.cit260.SpaceExploration.view.ErrorView.display;
import citbyui.cit260.SpaceExploration.view.ViewInterface.View;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class MovementView extends View {
    
    public MovementView() {
        super("\nWelcome to the Starmap."
                + "\nPlease enter the location you would like to go."
                + "\n *********************************************"
                + "\n First enter the row you want to be in:");
    }
    
    public boolean doAction(String row, String col) {
       
        System.out.println("doAction funtion called");
        /*String location = null;*
        
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

    return true;
}

    void displayMovementView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

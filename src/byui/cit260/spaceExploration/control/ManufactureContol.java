/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.control;

import byui.cit260.spaceExploration.Exceptions.ManufactureControlException;
import java.util.Scanner;

/**
 *
 * @author ibdch
 */
public class ManufactureContol {

    private String displayMessage;
    public Double getTemp() {
         Double temp = null;
        while (temp == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();
            if (value.equals("E"))
                break;
            temp = Double.parseDouble(value);
        }
        return temp;
    }
    
    public double refineItem(int temp, double weight) 
            throws ManufactureControlException {
        if (weight < 5 || weight > 50) {
            throw new ManufactureControlException("Incorrect weight inputed."
                        + " Weight must be within 5 and 50.");
        }
        if (temp < 2500 || temp > 3500) {
            throw new ManufactureControlException("Incorrect temperature inputed."
                        + " Please inpute a new temperature. (Hint: It is"
                        + " higher than 2000 and lower than 4000.)");
        }
        double volume = temp*weight/100;
        double percent = volume/3500*100;
        
        return percent;
    }

    private String getInput() {
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
}

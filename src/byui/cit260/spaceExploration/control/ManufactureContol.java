/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.control;

/**
 *
 * @author ibdch
 */
public class ManufactureContol {
    public double refineItem(int temp, double weight) {
        if (weight < 5 || weight > 50) {
            return -1;
        }
        if (temp < 2500 || temp > 3500) {
            return -1;
        }
        double volume = temp*weight/100;
        double percent = volume/3500*100;
        
        return percent;
    }
}

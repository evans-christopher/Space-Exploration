/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.model;

import java.io.Serializable;

/**
 *
 * @author Erik
 */
public class Pirate implements Serializable{
    
    //class instance variables
    private int choice;
    private double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Pirate() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.result) ^ (Double.doubleToLongBits(this.result) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pirate other = (Pirate) obj;
        if (Double.doubleToLongBits(this.result) != Double.doubleToLongBits(other.result)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pirate{" + "result=" + result + '}';
    }
    
    
    
}

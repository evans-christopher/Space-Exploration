/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.model;

/**
 *
 * @author Erik
 */
public class Location {
    
    //class instance variables
    private int row;
    private int column;
    private int visited;
    private double amountRemaining;
    private double displaySymbol;

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public double getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(double displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public Location() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.displaySymbol) ^ (Double.doubleToLongBits(this.displaySymbol) >>> 32));
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        if (Double.doubleToLongBits(this.displaySymbol) != Double.doubleToLongBits(other.displaySymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "amountRemaining=" + amountRemaining + ", displaySymbol=" + displaySymbol + '}';
    }
    
}

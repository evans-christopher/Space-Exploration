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
public class Scene implements Serializable{ 
    //class instance variables
    private String description;
    private double blockedLocation;

    public double getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(double blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public Scene() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.blockedLocation) ^ (Double.doubleToLongBits(this.blockedLocation) >>> 32));
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.blockedLocation) != Double.doubleToLongBits(other.blockedLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "blockedLocation=" + blockedLocation + '}';
    }
    
    
    
}

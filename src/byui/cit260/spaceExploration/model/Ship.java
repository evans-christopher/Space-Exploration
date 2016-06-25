/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.model;

import java.util.Objects;

/**
 *
 * @author ibdch
 */
public class Ship {
    
    private String description;
    private double fuelAmount;
    private double damageAmount;
    private double limitMove;
    private boolean repair;
    private double makeFuel;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getDamageAmount() {
        return damageAmount;
    }

    public void setDamageAmount(double damageAmount) {
        this.damageAmount = damageAmount;
    }

    public double getLimitMove() {
        return limitMove;
    }

    public void setLimitMove(double limitMove) {
        this.limitMove = limitMove;
    }

    public boolean isRepair() {
        return repair;
    }

    public void setRepair(boolean repair) {
        this.repair = repair;
    }

    public double getMakeFuel() {
        return makeFuel;
    }

    public void setMakeFuel(double makeFuel) {
        this.makeFuel = makeFuel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.fuelAmount) ^ (Double.doubleToLongBits(this.fuelAmount) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.damageAmount) ^ (Double.doubleToLongBits(this.damageAmount) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.limitMove) ^ (Double.doubleToLongBits(this.limitMove) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.repair);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.makeFuel) ^ (Double.doubleToLongBits(this.makeFuel) >>> 32));
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
        final Ship other = (Ship) obj;
        if (Double.doubleToLongBits(this.fuelAmount) != Double.doubleToLongBits(other.fuelAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.damageAmount) != Double.doubleToLongBits(other.damageAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.limitMove) != Double.doubleToLongBits(other.limitMove)) {
            return false;
        }
        if (Double.doubleToLongBits(this.makeFuel) != Double.doubleToLongBits(other.makeFuel)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.repair, other.repair)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ship{" + "description=" + description + ", fuelAmount=" + fuelAmount + ", damageAmount=" + damageAmount + ", limitMove=" + limitMove + ", repair=" + repair + ", makeFuel=" + makeFuel + '}';
    }

    public Ship() {
        this.description = "\nYour now damaged base of operations,"
                + " Repair this, and you can go home.";
        this.fuelAmount = 0;
        this.damageAmount = 100;
        this.limitMove = 5;
        this.repair = false;
        this.makeFuel = 0;
    }

    

        
    
}

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
public class Item {
    
    private String type;
    private double quantity;
    private double requiredAmount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public Item() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "type=" + type + ", quantity=" + quantity + ", requiredAmount=" + requiredAmount + '}';
    }
    public enum Inventory{
            battery,
            coolantSystem,
            magnodrive,
            converter,
            fuelInjector,
            wrench,
            hammer,
            torch,
            superCharger,
            coolant;
        }
        
    public static Item[] createItemList() {
        
        //create array list of items
        
        Item[] item = new Item[10];
        
        Item battery = new Item();
        battery.setType("Warp Drive Battery");
        battery.setQuantity(0);
        battery.setRequiredAmount(1);
        item[Inventory.battery.ordinal()] = battery;
        
        Item coolantSystem = new Item();
        coolantSystem.setType("Coolant System");
        coolantSystem.setQuantity(0);
        coolantSystem.setRequiredAmount(1);
        item[Inventory.coolantSystem.ordinal()] = coolantSystem;
        
        Item magnodrive = new Item();
        magnodrive.setType("Magnodrive");
        magnodrive.setQuantity(0);
        magnodrive.setRequiredAmount(1);
        item[Inventory.magnodrive.ordinal()] = magnodrive;
        
        Item converter = new Item();
        converter.setType("Energy Converter Module");
        converter.setQuantity(0);
        converter.setRequiredAmount(1);
        item[Inventory.converter.ordinal()] = converter;
        
        Item fuelInjector = new Item();
        fuelInjector.setType("Fuel Injector");
        fuelInjector.setQuantity(0);
        fuelInjector.setRequiredAmount(1);
        item[Inventory.fuelInjector.ordinal()] = fuelInjector;
        
        Item wrench = new Item();
        wrench.setType("Monkey Wrench");
        wrench.setQuantity(0);
        wrench.setRequiredAmount(1);
        item[Inventory.wrench.ordinal()] = wrench;
        
        Item hammer = new Item();
        hammer.setType("Quadplex Hammer");
        hammer.setQuantity(0);
        hammer.setRequiredAmount(1);
        item[Inventory.hammer.ordinal()] = hammer;
        
        Item torch = new Item();
        torch.setType("Blow Torch");
        torch.setQuantity(0);
        torch.setRequiredAmount(1);
        item[Inventory.torch.ordinal()] = torch;
        
        Item superCharger = new Item();
        superCharger.setType("Supercharger");
        superCharger.setQuantity(0);
        superCharger.setRequiredAmount(1);
        item[Inventory.superCharger.ordinal()] = superCharger;
        
        Item coolant = new Item();
        coolant.setType("Warp Drive Battery");
        coolant.setQuantity(0);
        coolant.setRequiredAmount(1);
        item[Inventory.coolant.ordinal()] = coolant;
        
        return item;
        
    }
    
}

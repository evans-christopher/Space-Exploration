/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
            coolantSystem,
            converter,
            fuelInjector,
            wrench,
            hammer,
            coolant,
            superCharger;    
        }
        
    public static Item[] createItemList() {
        
        //create array list of items
        
        Item[] item = new Item[7];
        
        
        
        Item coolantSystem = new Item();
        coolantSystem.setType("Coolant System");
        coolantSystem.setQuantity(0);
        coolantSystem.setRequiredAmount(1);
        item[Inventory.coolantSystem.ordinal()] = coolantSystem;
        
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
    
    public void saveInventory() {
        
        FileWriter outFile = null; //define a variable for a file stream
        
        //Specify the file location of the file
        String fileLocation = "items.txt";
        
        try {
            //Create and open a new file stream for the output file
            outFile = new FileWriter(fileLocation);
            
            //Write each name to the file plus a new line character
            outFile.write("Coolant System\n");
            outFile.write("Converter\n");
            outFile.write("Fuel Injector\n");
            outFile.write("Wrench\n");
            outFile.write("Hammer\n");
            outFile.write("Super Charger\n");
            outFile.write("Coolant\n");
            
            outFile.flush(); //flush out any data left in the file stream
            
        } catch (IOException ex) {
            System.out.println("Error saving inventory to file");
        } finally {
            if (outFile != null) {
                //if the file was created successfully
              try {
                outFile.close();
              } catch (IOException ex2) {
                  System.out.println("Error closing file.");
              }    
            }
        }
    }
    
    public void printInventory (ArrayList<Item> inventoryItems, 
                                String outputLocation) {
       //Create a BufferReader object for the input file
       try (PrintWriter out = new PrintWriter(outputLocation)) {
           
           //Print the title and column headings
           out.println("\n\n               Inventory            ");
           out.printf("%n%-20s%10s%10s", "Description", "Quantity", "Required");
           out.printf("%n%-20s%10s%10s", "-----------", "--------", "--------");
           
           // print the description, quantity, and Required Amout of each item
           for (Item item: inventoryItems) {
               out.printf("%n%-20s%7d%13.2f", item.getType()
                                            , item.getQuantity()
                                            , item.getRequiredAmount());
           }
       } catch (IOException ex) {
           System.out.println("I/O Error: " + ex.getMessage());
       }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Erik
 */
public class Scene implements Serializable{ 
    //class instance variables
    private String description;
    private double blockedLocation;
    
    
    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startScene = new Scene();
        startScene.setDescription(
                "Lost deep in an unknown galaxy, (add players name) has come to"
                + "explore the new territory for potential colonization for"
                + "humanity, but this brave pilot was attacked by space pirates"
                + "and left stranded, far from home and in need of new parts"
                + "and fuel to go into warpspace and return home.");
        startScene.setMapSymbol("*S*");
        startScene.setTravelTime(0);
        scenes[SceneType.start.ordinal()] = startScene;
        
        Scene planetScene = new Scene();
        planetScene.setDescription("You have reached an inhabited planet where"
                + "there may be an alien that has the parts you"
                + "need.");
        planetScene.setMapSymbol("O");
        planetScene.setTravelTime(0);
        scenes[SceneType.planet.ordinal()] = planetScene;
        
        Scene fuelScene = new Scene();
        fuelScene.setDescription("You've just found a planet that has the navi"
                + "crystals. Here you can mine the crystals you need to refine"
                + "into fuel for the warpdrive.");
        fuelScene.setMapSymbol("F");
        fuelScene.setTravelTime(0);
        scenes[SceneType.fuel.ordinal()] = fuelScene;
        
        Scene pirateScene = new Scene();
        pirateScene.setDescription("Warning! Warning! Know space pirate's"
                + "ships approaching our coordinates. What do you want to do?");
        pirateScene.setMapSymbol("OX");
        pirateScene.setTravelTime(0);
        scenes[SceneType.pirate.ordinal()] = pirateScene;
        
        Scene asteroidScene = new Scene();
        asteroidScene.setDescription("Warning! Entering asteroid field."
                + "What course of action do you want to take?");
        asteroidScene.setMapSymbol("A");
        asteroidScene.setTravelTime(0);
        scenes[SceneType.asteroid.ordinal()] = asteroidScene;
        
        return scenes;
    }
    
    private static void scenesLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.fuel.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.planet.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.fuel.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.pirate.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.planet.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.fuel.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.planet.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.planet.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.asteroid.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.pirate.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.planet.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.fuel.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.fuel.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.planet.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.planet.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.asteroid.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.planet.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.planet.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.fuel.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.fuel.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.pirate.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.fuel.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.asteroid.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.planet.ordinal()]);
    }
    
    public void saveLocation() {
        
        FileWriter outFile = null; //define a variable for a file stream
        
        //Specify the file location of the file
        String fileLocation = "locations.txt";
        
        try {
            //Create and open a new file stream for the output file
            outFile = new FileWriter(fileLocation);
            
            //Write each name to the file plus a new line character
            outFile.write("Location(0,0)- start\n");
            outFile.write("Location(0,1)- fuel\n");
            outFile.write("Location(0,2)- planet\n");
            outFile.write("Location(0,3)- fuel\n");
            outFile.write("Location(0,4)- pirate\n");
            outFile.write("Location(1,0)- planet\n");
            outFile.write("Location(1,1)- fuel\n");
            outFile.write("Location(1,2)- planet\n");
            outFile.write("Location(1,3)- planet\n");
            outFile.write("Location(1,4)- asteroid\n");
            outFile.write("Location(2,0)- pirate\n");
            outFile.write("Location(2,1)- planet\n");
            outFile.write("Location(2,2)- fuel\n");
            outFile.write("Location(2,3)- fuel\n");
            outFile.write("Location(2,4)- planet\n");
            outFile.write("Location(3,0)- planet\n");
            outFile.write("Location(3,1)- asteroid\n");
            outFile.write("Location(3,2)- planet\n");
            outFile.write("Location(3,3)- planet\n");
            outFile.write("Location(3,4)- fuel\n");
            outFile.write("Location(4,0)- fuel\n");
            outFile.write("Location(4,1)- pirate\n");
            outFile.write("Location(4,2)- fuel\n");
            outFile.write("Location(4,3)- asteroid\n");
            outFile.write("Location(4,4)- planet\n");
            
            
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

    private void setDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMapSymbol(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTravelTime(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum SceneType {
        start,
        planet,
        fuel,
        pirate,
        asteroid;
    }

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

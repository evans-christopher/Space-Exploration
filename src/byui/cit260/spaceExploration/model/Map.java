/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.model;

import byui.cit260.spaceExploration.control.GameControl;
import java.util.Objects;

/**
 *
 * @author ibdch
 */
public class Map {

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Locations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private double rowCount;
    private double columnCount;
    private String describePlanets;
    private Location[][] locations;
    private int rowNumber;
    private int colNumber;

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    public String getDescribePlanets() {
        return describePlanets;
    }

    public void setDescribePlanets(String describePlanets) {
        this.describePlanets = describePlanets;
    }
    
    private static Map createMap() {
        //create the map
        Map map = new Map(5, 5);
        //create the scenes for the game
        Scene[] scenes = createScenes();
        //assign scenes to locations
        GameControl.assignScenes = Locations(map, scenes);
        
        return map;
    }

    public Map() {
    }
    
    public Map(int rowNumber, int colNumber) {
        
        if (rowNumber < 1 || colNumber < 1) {
            System.out.println("The number of rows and columns" 
                               + " must be greater than 0");
            return;
        }
        
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        
        // create 2D array for location objects
        this.locations = new Location[rowNumber][colNumber];
        
        for (int row = 0; row < rowNumber; row++) {
            for (int col = 0; col < colNumber; col++) {
                //create and initialize new Location object instance
                Location location = new Location();
                location.setCol(col);
                location.setRow(row);
                location.setVisited(false);
                
                //assign the Location object to the current position in array
                locations[row][col] = location;
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.describePlanets);
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        if (!Objects.equals(this.describePlanets, other.describePlanets)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", describePlanets=" + describePlanets + '}';
    }

    Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

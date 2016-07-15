/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.model;

import java.awt.Point;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Erik
 */
public enum Character implements Serializable{
    
    Ji("Alien with coolant system"),
    Urien("Alien location for three parts"),
    Jack("Human with spare energy converter"),
    Ran("Alien with fuel injector."),
    Hugh("Human with fuel locations and monkey wrench."),
    Dewby("Human with fuel locations and hammer"),
    Slre("Alien with supercharger."),
    Tolwe("Alien with coolant"),
    Tulwe("Alien with coolant"),
    Rudnimq("Human with alien name.");
    
    private final String description;
    private final Point coordinates;
    private boolean options;
    private Object getGame;
    private Object Game;
    private Object scene;

    public void savePlayersNames() {
        
        FileWriter outFile = null; //define a variable for a file stream
        
        //Specify the file location of the file
        String fileLocation = "characters.txt";
        
        try {
            //Create and open a new file stream for the output file
            outFile = new FileWriter(fileLocation);
            
            //Write each name to the file plus a new line character
            outFile.write("Ji\n");
            outFile.write("Urien\n");
            outFile.write("Jack\n");
            outFile.write("Ran\n");
            outFile.write("Hugh\n");
            outFile.write("Dewby\n");
            outFile.write("Slre\n");
            outFile.write("Tolwe\n");
            outFile.write("Tulwe\n");
            outFile.write("Rudnimq\n");
            
            outFile.flush(); //flush out any data left in the file stream
            
        } catch (IOException ex) {
            System.out.println("Error saving characters names to file");
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
    
    @Override
    public String toString() {
        return "Character{" + "coordinates=" + coordinates + '}';
    }

    

    Character(String description) {
        this.description =  description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    
    
}

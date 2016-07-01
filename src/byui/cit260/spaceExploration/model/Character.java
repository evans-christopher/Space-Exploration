/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.model;

import java.awt.Point;
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

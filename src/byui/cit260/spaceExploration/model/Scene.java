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
    
    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startScene = new Scene();
        startScene.setDescription(
                "Lost deep in an unknown galaxy, (add players name) has come to"
                + "explor the new territory for potential colonization for"
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
        asteroidScene.setTimeTravel(0);
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
        locations[1][2].setScene(scenes[SceneType.pirate.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.asteroid.ordinal()]);
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

    private void setDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMapSymbol(String s) {
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

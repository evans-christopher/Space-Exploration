/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.control;

import byui.cit260.spaceExploration.Exceptions.GameControlException;
import byui.cit260.spaceExploration.Exceptions.MapControlException;
import byui.cit260.spaceExploration.model.Game;
import byui.cit260.spaceExploration.model.Item;
import byui.cit260.spaceExploration.model.Map;
import byui.cit260.spaceExploration.model.Player;
import byui.cit260.spaceExploration.model.Ship;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import spaceexploration.SpaceExploration;

/**
 *
 * @author ibdch
 */
public class GameControl {
    
    public static void createNewGame(Player player) throws MapControlException {
        
        Game game = new Game(); //Create new game
        SpaceExploration.setCurrentGame(game); //save in SpaceExploration
        
        game.setPlayer(player); //save player in game
        
        //create the item list and save in the game
        Item[] itemList = GameControl.createItemList();
        game.setItem(itemList);
        
        Ship ship = new Ship(); //create new ship
        game.setShip(ship); //save ship in game
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //Put characters in their location
        MapControl.placeCharacters(map);
    }
    
    public static Item[] createItemList() {
        System.out.println("*** called createItemList() in Game Control ***");
        return null;
    }

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        SpaceExploration.setPlayer(player); //save the player
        
        return player;
    }

    
    public static void saveView(Game currentGame, String filePath, String filepath, Object game) {
        
        
        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game object out to the file
        }catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    
    }

    public static void getSavedGame(String filePath) {
        
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filepath)) {
             ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        Game.setCurrentGame(game);
    
    }

    public static void saveView(Game currentGame, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class assignScenes {

        public assignScenes() {
        }
    }
    
}

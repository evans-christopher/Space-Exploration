/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.model;

import citbyui.cit260.SpaceExploration.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ibdch
 */
public class Game {
    
    private double totalTime;
    
    private static Game currentGame;
    private Character[] character;
    private Ship ship;
    private Player player;
    private Item[] item;
    private Map map;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        try {
            Game.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            Game.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            Game.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return;
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                    "\nCause: " + e.getCause() + "\nMessage: " 
                    + e.getMessage());
            e.printStackTrace();;
        }
        finally {
            try {
                if(Game.inFile != null)
                    Game.inFile.close();
                if(Game.outFile != null)
                    Game.outFile.close();
                if(Game.logFile != null)
                    Game.logFile.close();
            } catch (IOException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Game.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Game.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Game.logFile = logFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Game.currentGame = currentGame;
    }

    
    
    
}

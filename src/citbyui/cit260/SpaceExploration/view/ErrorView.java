/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.SpaceExploration.view;

import byui.cit260.spaceExploration.model.Game;
import java.io.PrintWriter;

/**
 *
 * @author ibdch
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Game.getOutFile();
    private static final PrintWriter logFile = Game.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
                        + "\n--ERROR!--" + errorMessage
                        + "\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        logFile.println(className + " - " + errorMessage);
    }
}

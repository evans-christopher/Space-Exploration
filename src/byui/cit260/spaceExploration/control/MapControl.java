/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.control;

import static java.lang.Math.abs;

/**
 *
 * @author ibdch
 */
public class MapControl {

   public double calcDistance(int currentRow, int currentCol, int row, int col) {
       if (row<1 || row>5) {
           return -1;
       }
       if (col<1 || col>5) {
           return -1;
       }
       int distance = abs(row - currentRow) + abs(col - currentCol);
       if (distance<1 || distance>5) {
           return -1;
       }
       return distance;
   }
   
}

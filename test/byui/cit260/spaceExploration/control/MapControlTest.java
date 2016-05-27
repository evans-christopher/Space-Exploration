/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.spaceExploration.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ibdch
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcDistance method, of class MapControl.
     */
    @Test
    public void testCalcDistance() {
        System.out.println("calcDistance");
        System.out.println("Test #1");
        int currentRow = 1;
        int currentCol = 3;
        int row = 3;
        int col = 5;
        MapControl instance = new MapControl();
        double expResult = 4.0;
        double result = instance.calcDistance(currentRow, currentCol, row, col);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test #2");
        currentRow = 1;
        currentCol = 4;
        row = 5;
        col = 2;
        expResult = -1;
        result = instance.calcDistance(currentRow, currentCol, row, col);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test #3");
        currentRow = 4;
        currentCol = 3;
        row = 4;
        col = 3;
        expResult = -1;
        result = instance.calcDistance(currentRow, currentCol, row, col);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test #4");
        currentRow = 3;
        currentCol = 5;
        row = 3;
        col = 6;
        expResult = -1;
        result = instance.calcDistance(currentRow, currentCol, row, col);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test #5");
        currentRow = 4;
        currentCol = 2;
        row = 8;
        col = 3;
        expResult = -1;
        result = instance.calcDistance(currentRow, currentCol, row, col);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test #6");
        currentRow = 1;
        currentCol = 1;
        row = 1;
        col = 2;
        expResult = 1.0;
        result = instance.calcDistance(currentRow, currentCol, row, col);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test #7");
        currentRow = 1;
        currentCol = 1;
        row = 2;
        col = 5;
        expResult = 5.0;
        result = instance.calcDistance(currentRow, currentCol, row, col);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

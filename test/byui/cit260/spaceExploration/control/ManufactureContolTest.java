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
public class ManufactureContolTest {
    
    public ManufactureContolTest() {
    }

    /**
     * Test of refineItem method, of class ManufactureContol.
     */
    @Test
    public void testRefineItem() {
        System.out.println("refineItem");
        System.out.println("tTest case #1");
        int temp = 2500;
        double weight = 10.0;
        ManufactureContol instance = new ManufactureContol();
        double expResult = 7.14;
        double result = instance.refineItem(temp, weight);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
   
        System.out.println("tTest case #2");
        temp = 3600;
        weight = 10.0;
        expResult = -1;
        result = instance.refineItem(temp, weight);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("tTest case #3");
        temp = 3200;
        weight = 55.0;
        expResult = -1;
        result = instance.refineItem(temp, weight);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("tTest case #4");
        temp = -250;
        weight = 15.0;
        expResult = -1;
        result = instance.refineItem(temp, weight);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("tTest case #5");
        temp = 2500;
        weight = -1.0;
        expResult = -1;
        result = instance.refineItem(temp, weight);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("tTest case #6");
        temp = 2500;
        weight = 25.0;
        expResult = 17.85;
        result = instance.refineItem(temp, weight);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("tTest case #7");
        temp = 3000;
        weight = 10.0;
        expResult = 8.57;
        result = instance.refineItem(temp, weight);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("tTest case #8");
        temp = 3500;
        weight = 50.0;
        expResult = 50;
        result = instance.refineItem(temp, weight);
        assertEquals(expResult, result, 0.01);
    }
}

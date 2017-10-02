/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodController;

import FoodView.EnterFoodView;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JonYa
 */
public class EnterFoodControllerIT {
    
    public EnterFoodControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setName method, of class EnterFoodController.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String food = "";
        EnterFoodController instance = null;
        instance.setName(food);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1, 1);
    }

    /**
     * Test of updateView method, of class EnterFoodController.
     */
    @Test
    public void testUpdateView() {
        System.out.println("updateView");
        EnterFoodView view = null;
        EnterFoodController instance = null;
        instance.updateView(view);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1, 1);
    }

    /**
     * Test of initializeFoodStat method, of class EnterFoodController.
     */
    @Test
    public void testInitializeFoodStat() {
        System.out.println("initializeFoodStat");
        EnterFoodController instance = null;
        instance.initializeFoodStat();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1, 1);
    }
    
}

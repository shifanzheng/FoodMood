/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodController;

import FoodView.FoodStatsView;
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
public class FoodStatsControllerIT {
    
    public FoodStatsControllerIT() {
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
     * Test of getStats method, of class FoodStatsController.
     */
    @Test
    public void testGetStats() {
        System.out.println("getStats");
        FoodStatsController instance = null;
        instance.getStats();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of updateView method, of class FoodStatsController.
     */
    @Test
    public void testUpdateView() {
        System.out.println("updateView");
        FoodStatsView view = null;
        FoodStatsController instance = null;
        instance.updateView(view);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of initilizeMood method, of class FoodStatsController.
     */
    @Test
    public void testInitilizeMood() {
        System.out.println("initilizeMood");
        FoodStatsController instance = null;
        instance.initilizeMood();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

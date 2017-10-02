/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodController;

import MoodView.MoodStatsView;
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
public class MoodStatsControllerIT {
    
    public MoodStatsControllerIT() {
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
     * Test of getMood method, of class MoodStatsController.
     */
    @Test
    public void testGetMood() {
        System.out.println("getMood");
        MoodStatsController instance = null;
        instance.getMood();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateView method, of class MoodStatsController.
     */
    @Test
    public void testUpdateView() {
        System.out.println("updateView");
        MoodStatsView view = null;
        MoodStatsController instance = null;
        instance.updateView(view);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

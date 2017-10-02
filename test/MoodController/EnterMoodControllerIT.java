/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodController;

import MoodView.EnterMoodView;
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
public class EnterMoodControllerIT {
    
    public EnterMoodControllerIT() {
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
     * Test of setMood method, of class EnterMoodController.
     */
    @Test
    public void testSetMood() {
        System.out.println("setMood");
        String mood = "";
        EnterMoodController instance = null;
        instance.setMood(mood);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateView method, of class EnterMoodController.
     */
    @Test
    public void testUpdateView() {
        System.out.println("updateView");
        EnterMoodView view = null;
        EnterMoodController instance = null;
        instance.updateView(view);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeNutrition method, of class EnterMoodController.
     */
    @Test
    public void testInitializeNutrition() {
        System.out.println("initializeNutrition");
        EnterMoodController instance = null;
        instance.initializeNutrition();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of intializePersonal method, of class EnterMoodController.
     */
    @Test
    public void testIntializePersonal() {
        System.out.println("intializePersonal");
        EnterMoodController instance = null;
        instance.intializePersonal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

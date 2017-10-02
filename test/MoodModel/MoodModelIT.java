/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodModel;

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
public class MoodModelIT {
    
    public MoodModelIT() {
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
     * Test of getMood method, of class MoodModel.
     */
    @Test
    public void testGetMood() {
        System.out.println("getMood");
        MoodModel instance = new MoodModel();
        String expResult = "";
        String result = instance.getMood();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMood method, of class MoodModel.
     */
    @Test
    public void testSetMood() {
        System.out.println("setMood");
        String mood = "";
        MoodModel instance = new MoodModel();
        instance.setMood(mood);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonalAnalysisController;

import PersonalAnalysisView.MicroView;
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
public class MicroControllerIT {
    
    public MicroControllerIT() {
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
     * Test of getTime method, of class MicroController.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        MicroController instance = null;
        int expResult = 0;
        int result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTime method, of class MicroController.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int time = 0;
        MicroController instance = null;
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of updateView method, of class MicroController.
     */
    @Test
    public void testUpdateView() {
        System.out.println("updateView");
        MicroView view = null;
        MicroController instance = null;
        instance.updateView(view);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

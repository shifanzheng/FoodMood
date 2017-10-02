/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonalAnalysisModel;

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
public class MicroModelIT {
    
    public MicroModelIT() {
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
     * Test of getTime method, of class MicroModel.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        MicroModel instance = new MicroModel();
        int expResult = 0;
        int result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTime method, of class MicroModel.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int time = 0;
        MicroModel instance = new MicroModel();
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

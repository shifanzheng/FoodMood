/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodModel;

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
public class FoodModelIT {
    
    public FoodModelIT() {
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
     * Test of getName method, of class FoodModel.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        FoodModel instance = new FoodModel();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class FoodModel.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        FoodModel instance = new FoodModel();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getType method, of class FoodModel.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        FoodModel instance = new FoodModel();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setType method, of class FoodModel.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        FoodModel instance = new FoodModel();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPrice method, of class FoodModel.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        FoodModel instance = new FoodModel();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPrice method, of class FoodModel.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        FoodModel instance = new FoodModel();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getQuantity method, of class FoodModel.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        FoodModel instance = new FoodModel();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setQuantity method, of class FoodModel.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        FoodModel instance = new FoodModel();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

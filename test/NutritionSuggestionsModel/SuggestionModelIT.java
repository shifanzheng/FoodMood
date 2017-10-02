/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NutritionSuggestionsModel;

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
public class SuggestionModelIT {
    
    public SuggestionModelIT() {
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
     * Test of getCalories method, of class SuggestionModel.
     */
    @Test
    public void testGetCalories() {
        System.out.println("getCalories");
        SuggestionModel instance = new SuggestionModel();
        int expResult = 0;
        int result = instance.getCalories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalories method, of class SuggestionModel.
     */
    @Test
    public void testSetCalories() {
        System.out.println("setCalories");
        int calories = 0;
        SuggestionModel instance = new SuggestionModel();
        instance.setCalories(calories);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProtein method, of class SuggestionModel.
     */
    @Test
    public void testGetProtein() {
        System.out.println("getProtein");
        SuggestionModel instance = new SuggestionModel();
        int expResult = 0;
        int result = instance.getProtein();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProtein method, of class SuggestionModel.
     */
    @Test
    public void testSetProtein() {
        System.out.println("setProtein");
        int protein = 0;
        SuggestionModel instance = new SuggestionModel();
        instance.setProtein(protein);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSodium method, of class SuggestionModel.
     */
    @Test
    public void testGetSodium() {
        System.out.println("getSodium");
        SuggestionModel instance = new SuggestionModel();
        int expResult = 0;
        int result = instance.getSodium();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSodium method, of class SuggestionModel.
     */
    @Test
    public void testSetSodium() {
        System.out.println("setSodium");
        int sodium = 0;
        SuggestionModel instance = new SuggestionModel();
        instance.setSodium(sodium);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

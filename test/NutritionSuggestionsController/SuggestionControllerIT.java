/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NutritionSuggestionsController;

import NutritionSuggestionView.SuggestionView;
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
public class SuggestionControllerIT {
    
    public SuggestionControllerIT() {
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
     * Test of updateView method, of class SuggestionController.
     */
    @Test
    public void testUpdateView() {
        System.out.println("updateView");
        SuggestionView view = null;
        SuggestionController instance = null;
        instance.updateView(view);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of suggestFood method, of class SuggestionController.
     */
    @Test
    public void testSuggestFood() {
        System.out.println("suggestFood");
        SuggestionController instance = null;
        instance.suggestFood();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

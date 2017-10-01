/*
 */
package NutritionSuggestionsController;

import NutritionSuggestionView.SuggestionView;
import NutritionSuggestionsModel.SuggestionModel;

/**
 *
 * @author Shifan
 */
public class SuggestionController {
    private SuggestionModel model = new SuggestionModel();
    private SuggestionView view = new SuggestionView();
    
    
    /**
     * Default constructor for SuggestionController class.
     */
    public SuggestionController(SuggestionModel model, SuggestionView view){
        
    }
    
    /**
     * Method to update the view
     */
    public void updateView(SuggestionView view){
        view.setVisible(true);
    }
    
    
    /**
     * Method used to suggest food for the user.
     */
    public void suggestFood(){
        
    }
}

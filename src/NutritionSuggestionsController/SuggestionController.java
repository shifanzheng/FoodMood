/*
 */
package NutritionSuggestionsController;

import NutritionSuggestionView.SuggestionView;
import NutritionSuggestionsModel.SuggestionModel;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class SuggestionController {
    private SuggestionModel model;
    private SuggestionView view;
    
    
    /**
     * Default constructor for SuggestionController class.
     */
    public SuggestionController(SuggestionModel model, SuggestionView view, Stage primaryStage){
        model = new SuggestionModel();
        view = new SuggestionView(primaryStage);
    }
    
    /**
     * Method to update the view
     */
    public void updateView(SuggestionView view){
        //view.setVisible(true);
    }
    
    
    /**
     * Method used to suggest food for the user.
     */
    public void suggestFood(){
        
    }
}

/*
 */
package MoodController;

import MoodModel.MoodModel;
import MoodView.EnterMoodView;
import NutritionSuggestionView.SuggestionView;
import NutritionSuggestionsController.SuggestionController;
import NutritionSuggestions.SuggestionModel;
import PersonalAnalysisController.MicroController;
import PersonalAnalysisModel.MicroModel;
import PersonalAnalysisView.MicroView;

/**
 *
 * @author Shifan
 */
public class EnterMoodController {
    private MoodModel model;
    private EnterMoodView view;
    
    /**
     * Default constructor for EnterMoodController class
     * @param model
     * @param view
     */
    public EnterMoodController(MoodModel model, EnterMoodView view){
        this.model = new MoodModel();
        this.view = new EnterMoodView();
    }
    
    /**
     * Method to set the mood. 
     * @param mood
     */
    public void setMood(String mood){
        model.setMood(mood);
    }
    
    
    /**
     * Method to update the view.
     */
    public void updateView(){
        
    }
    
    public void initializeNutrition(){
    SuggestionModel sugModel = new SuggestionModel();
    SuggestionView view = new SuggestionView(); 
    SuggestionController sugCntl = new SuggestionController(sugModel, view);
    view.displayView();
    }
    
    public void intializePersonal(){
    MicroModel micromodel = new MicroModel();
    MicroView microview = new MicroView();
    MicroController microcntl = new MicroController(micromodel,microview); 
    microview.displayView();
    
    }
}

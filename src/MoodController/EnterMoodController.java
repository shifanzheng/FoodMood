/*
 */
package MoodController;

import MoodModel.MoodModel;
import MoodView.EnterMoodView;
import NutritionSuggestionView.SuggestionView;
import NutritionSuggestionsController.SuggestionController;
import NutritionSuggestionsModel.SuggestionModel;
import PersonalAnalysisController.MicroController;
import PersonalAnalysisModel.MicroModel;
import PersonalAnalysisView.MicroView;
import javafx.stage.Stage;

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
    public EnterMoodController(MoodModel model, EnterMoodView view, Stage primaryStage){
       // this.model;
        this.view = new EnterMoodView(primaryStage);
    }
    
    /**
     * Method to set the mood. 
     * @param mood
     */
    public void setMood(String mood){
      //  model.setMood(mood);
    }
    
    
    /**
     * Method to update the view.
     */
    public void updateView(EnterMoodView view){
        //view.setVisible(true);
    }
    
    public void initializeNutrition(){
    SuggestionModel sugModel = new SuggestionModel();
    //SuggestionView view = new SuggestionView(); 
    //SuggestionController sugCntl = new SuggestionController(sugModel, view);
    view.displayView();
    }
    
    public void intializePersonal(){
    MicroModel micromodel = new MicroModel();
    //MicroView microview = new MicroView();
    //MicroController microcntl = new MicroController(micromodel,microview); 
    //microview.displayView();
    
    }
}

/*
 */
package MoodController;

import FoodView.EnterFoodView;
import MoodModel.MoodModel;
import MoodView.EnterMoodView;
import NutritionSuggestionView.SuggestionView;
import NutritionSuggestionsController.SuggestionController;
import NutritionSuggestionsModel.SuggestionModel;
import PersonalAnalysisController.MicroController;
import PersonalAnalysisModel.MicroModel;
import PersonalAnalysisView.MicroView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;
import javax.swing.JButton;

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
     * @param primaryStage
     */
    public EnterMoodController(MoodModel model, EnterMoodView view, Stage primaryStage){
       // this.model;
        this.model = model;
        this.view = view;
        
        setBehaviors();
        
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
     * @param view
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
    
    public EnterMoodView getView(){
        return view;
    }

    private void setBehaviors() {
       
    }
    
    public void setToolBar(ToolBar toolBar){
        view.setToolBar(toolBar);
    }
    
}


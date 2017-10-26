
package foodmood;

import FoodController.EnterFoodController;
import FoodController.FoodStatsController;
import FoodModel.FoodModel;
import FoodView.EnterFoodView;
import FoodView.FoodStatsView;
import MoodController.EnterMoodController;
import MoodController.MoodStatsController;
import MoodModel.MoodModel;
import MoodView.EnterMoodView;
import MoodView.MoodStatsView;
import NutritionSuggestionView.SuggestionView;
import NutritionSuggestionsController.SuggestionController;
import NutritionSuggestionsModel.SuggestionModel;
import PersonalAnalysisController.MicroController;
import PersonalAnalysisModel.MicroModel;
import PersonalAnalysisView.MicroView;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 *
 * @author Shifan
 */
public class FoodMood extends Application{

    
    Stage primaryStage = new Stage();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        launch(args);
        
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Food Mood");
        
        /*I set up each view, but not the navigation tabs yet.
            For sake of testing, call a method to create the window you need.
            Example: Enter food window -> enterFood();
            Make sure you call only the method you need, otherwise multiple windows will pop up.
            I labeled each view to make it clear which one is appearing.
            
            I held off on the navigation tabs since I have a few questions about how we should structure the program.
            But for now, the skeleton of the project is ready.
        */
        enterFood();
        
    }
    
    public void enterFood(){
        FoodModel model = new FoodModel();
        EnterFoodView view = new EnterFoodView(primaryStage);
        EnterFoodController foodcntl = new EnterFoodController(model, view, primaryStage);
        view.displayView();
    }
    
    public void foodStats(){
        FoodModel model = new FoodModel();
        FoodStatsView view = new FoodStatsView(primaryStage);
        FoodStatsController foodStatsController = new FoodStatsController(model, view, primaryStage);
        view.displayView();
    }
    
    public void enterMood(){
        MoodModel model = new MoodModel();
        EnterMoodView view = new EnterMoodView(primaryStage);
        EnterMoodController foodStatsController = new EnterMoodController(model, view, primaryStage);
        view.displayView();
    }
    
    public void moodStats(){
        MoodModel model = new MoodModel();
        MoodStatsView view = new MoodStatsView(primaryStage);
        MoodStatsController foodStatsController = new MoodStatsController(model, view, primaryStage);
        view.displayView();
    }
    
    public void analysis(){
        MicroModel model = new MicroModel();
        MicroView view = new MicroView(primaryStage);
        MicroController foodStatsController = new MicroController(model, view, primaryStage);
        view.displayView();
    }
    
    public void suggestion(){
        SuggestionModel model = new SuggestionModel();
        SuggestionView view = new SuggestionView(primaryStage);
        SuggestionController foodStatsController = new SuggestionController(model, view, primaryStage);
        view.displayView();
    } 
   
}

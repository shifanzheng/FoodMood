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
import UserProfile.UserProfileModel;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class FoodMood extends Application {

    private Stage primaryStage = new Stage();
    private UserProfileModel defaultProfile = new UserProfileModel();
    
    List<Scene> sceneList = new ArrayList<Scene>();
    
    EnterFoodController foodcntl;
    FoodStatsController foodStatsController;
    EnterMoodController enterMoodController;
    MoodStatsController moodStatsController;
    MicroController microController;
    SuggestionController suggestionsController;
    
    FoodModel foodModel;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;
        primaryStage.setTitle("Food Mood");

        createGUI();
        
        primaryStage.setScene(sceneList.get(0));
        primaryStage.show();
        
    }
    
    private void createGUI(){
        
        enterFood();
        foodStats();
        enterMood();
        moodStats();
        analysis();
        suggestion();
        
        foodcntl.setToolBar(navigation());
        foodStatsController.setToolBar(navigation());
        enterMoodController.setToolBar(navigation());
        moodStatsController.setToolBar(navigation());
        microController.setToolBar(navigation());
        suggestionsController.setToolBar(navigation());
        
    }

    private void enterFood() {
        foodModel = new FoodModel();
        EnterFoodView view1 = new EnterFoodView(primaryStage);
        foodcntl = new EnterFoodController(foodModel, view1, primaryStage);
        sceneList.add(foodcntl.getView().getScene());
        System.out.println(foodcntl.getView().getScene().getX());
    }

    private void foodStats() {
        FoodModel model = new FoodModel();
        FoodStatsView view2 = new FoodStatsView(primaryStage);
        foodStatsController = new FoodStatsController(foodModel, view2, primaryStage);
        sceneList.add(foodStatsController.getView().getScene());
    }

    private void enterMood() {
        MoodModel model = new MoodModel();
        EnterMoodView view3 = new EnterMoodView(primaryStage);
        enterMoodController = new EnterMoodController(model, view3, primaryStage);
        sceneList.add(enterMoodController.getView().getScene());
    }

    private void moodStats() {
        MoodModel model = new MoodModel();
        MoodStatsView view4 = new MoodStatsView(primaryStage);
        moodStatsController = new MoodStatsController(model, view4, primaryStage);
        sceneList.add(moodStatsController.getView().getScene());
    }
    
    private void analysis() {
        MicroModel model = new MicroModel();
        MicroView view5 = new MicroView(primaryStage);
        microController = new MicroController(model, view5, primaryStage);
        sceneList.add(microController.getView().getScene());
    }

    private void suggestion() {
        SuggestionModel model = new SuggestionModel();
        SuggestionView view6 = new SuggestionView(primaryStage);
        suggestionsController = new SuggestionController(model, view6, primaryStage);
        sceneList.add(suggestionsController.getView().getScene());
    }
    
    private ToolBar navigation(){
        TabbedView navTabs = new TabbedView(primaryStage, sceneList);
        return navTabs.toolBar();
    }

}

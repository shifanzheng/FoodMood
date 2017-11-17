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
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class FoodMood extends Application {

    private Stage primaryStage = new Stage();
    private UserProfileModel defaultProfile = new UserProfileModel();
    
    List<Scene> sceneList = new ArrayList<Scene>();
    

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

        //TabbedView tabbedView = new TabbedView();
        
        /*
        ToolBar toolBar = tabbedView.toolBar(primaryStage);

        view2.setToolBar(toolBar);
        view3.setToolBar(toolBar);
        view4.setToolBar(toolBar);
        view5.setToolBar(toolBar);
        view6.setToolBar(toolBar);

        view1.setToolBar(toolBar);
        */

        //LoginScreen lgs = new LoginScreen(primaryStage, view1, defaultProfile);

        createGUI();
        
        primaryStage.setScene(sceneList.get(0));
        primaryStage.show();
        //primaryStage.setScene(foodcntl.getView().getScene());
        //primaryStage.show();
    }
    
    private void createGUI(){
        enterFood();
        foodStats();
        enterMood();
        moodStats();
        analysis();
        suggestion();
    }

    private void enterFood() {
        FoodModel model = new FoodModel();
        EnterFoodView view1 = new EnterFoodView(primaryStage);
        EnterFoodController foodcntl = new EnterFoodController(model, view1, primaryStage);
        sceneList.add(foodcntl.getView().getScene());
        System.out.println(foodcntl.getView().getScene().getX());
    }

    private void foodStats() {
        FoodModel model = new FoodModel();
        FoodStatsView view2 = new FoodStatsView(primaryStage);
        FoodStatsController foodStatsController = new FoodStatsController(model, view2, primaryStage);
        sceneList.add(foodStatsController.getView().getScene());
    }

    private void enterMood() {
        MoodModel model = new MoodModel();
        EnterMoodView view3 = new EnterMoodView(primaryStage);
        EnterMoodController foodStatsController = new EnterMoodController(model, view3, primaryStage);
        sceneList.add(foodStatsController.getView().getScene());
    }

    private void moodStats() {
        MoodModel model = new MoodModel();
        MoodStatsView view4 = new MoodStatsView(primaryStage);
        MoodStatsController foodStatsController = new MoodStatsController(model, view4, primaryStage);
        sceneList.add(foodStatsController.getView().getScene());
    }
    
    private void analysis() {
        MicroModel model = new MicroModel();
        MicroView view5 = new MicroView(primaryStage);
        MicroController foodStatsController = new MicroController(model, view5, primaryStage);
        sceneList.add(foodStatsController.getView().getScene());
    }

    private void suggestion() {
        SuggestionModel model = new SuggestionModel();
        SuggestionView view6 = new SuggestionView(primaryStage);
        SuggestionController foodStatsController = new SuggestionController(model, view6, primaryStage);
        sceneList.add(foodStatsController.getView().getScene());
    }

    //SCENE MAP CONSTRUCTION
}

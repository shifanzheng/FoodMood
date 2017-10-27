
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;


/**
 *
 * @author Shifan
 */
public class FoodMood extends Application{

    
    Stage primaryStage = new Stage();
    ArrayList<Scene> sceneList;
    //ArrayList<Scene> sceneList;
    
    EnterFoodView view1;
    FoodStatsView view2;
    EnterMoodView view3;
    MoodStatsView view4;
    MicroView view5;
    SuggestionView view6;
    
    
    public static Map<Scene, String> sceneMap = new HashMap<>();
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        launch(args);
        
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        this.primaryStage = primaryStage;
        
        sceneMap = this.constructViews();
        //sceneMap = this.constructViews(sceneMap);
        
        primaryStage.setTitle("Food Mood");
        
        /*I set up each view, but not the navigation tabs yet.
            For sake of testing, call a method to create the window you need.
            Example: Enter food window -> enterFood();
            Make sure you call only the method you need, otherwise multiple windows will pop up.
            I labeled each view to make it clear which one is appearing.
            
            I held off on the navigation tabs since I have a few questions about how we should structure the program.
            But for now, the skeleton of the project is ready.
        */
//        enterFood();
        //startApp();
        
        //TabbedView tabbedView = new TabbedView(sceneMap);
        
        
        //sceneList.addAll(sceneMap.values());
        
        System.out.println(sceneMap.size());
        
        TabbedView tabbedView = new TabbedView(sceneMap);
        ToolBar toolBar = tabbedView.toolBar(primaryStage);
        
        view1.setToolBar(toolBar);
        view2.setToolBar(toolBar);
        view3.setToolBar(toolBar);
        view4.setToolBar(toolBar);
        view5.setToolBar(toolBar);
        view6.setToolBar(toolBar);
        
        primaryStage.setScene(view6.getScene());
        primaryStage.show();
        
        //TabbedView tabbedView = new TabbedView(primaryStage);
    }
    public void startApp(){
        LoginScreen lgs = new LoginScreen();
    }
    
    public static Map getSceneMap(){
        return sceneMap;
    }
    
    private Map constructViews(){
        
        Map<Scene, String> tempMap = new HashMap<>();
        
        tempMap.put(enterFood(), EnterFoodView.getSceneName());
        tempMap.put(foodStats(), FoodStatsView.getSceneName());
        tempMap.put(enterMood(), EnterMoodView.getSceneName());
        tempMap.put(moodStats(), MoodStatsView.getSceneName());
        tempMap.put(analysis(), MicroView.getSceneName());
        tempMap.put(suggestion(), SuggestionView.getSceneName());
        
        return tempMap;
        
    }
    
    
    private Scene enterFood(){
        FoodModel model = new FoodModel();
        view1 = new EnterFoodView(primaryStage);
        EnterFoodController foodcntl = new EnterFoodController(model, view1, primaryStage);
        return view1.getScene();
    }
    
    private Scene foodStats(){
        FoodModel model = new FoodModel();
        view2 = new FoodStatsView(primaryStage);
        FoodStatsController foodStatsController = new FoodStatsController(model, view2, primaryStage);
        return view2.getScene();
    }
    
    private Scene enterMood(){
        MoodModel model = new MoodModel();
        view3 = new EnterMoodView(primaryStage);
        EnterMoodController foodStatsController = new EnterMoodController(model, view3, primaryStage);
        return view3.getScene();
    }
    
    private Scene moodStats(){
        MoodModel model = new MoodModel();
        view4 = new MoodStatsView(primaryStage);
        MoodStatsController foodStatsController = new MoodStatsController(model, view4, primaryStage);
        return view4.getScene();
    }
    
    private Scene analysis(){
        MicroModel model = new MicroModel();
        view5 = new MicroView(primaryStage);
        MicroController foodStatsController = new MicroController(model, view5, primaryStage);
        return view5.getScene();
    }
    
    private Scene suggestion(){
        SuggestionModel model = new SuggestionModel();
        view6 = new SuggestionView(primaryStage);
        SuggestionController foodStatsController = new SuggestionController(model, view6, primaryStage);
        return view6.getScene();
    }
    
    //SCENE MAP CONSTRUCTION
    
  
   
}

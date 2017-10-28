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
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class FoodMood extends Application {

    Stage primaryStage = new Stage();
    ArrayList<Scene> sceneList;
    //ArrayList<Scene> sceneList;

    static EnterFoodView view1;
    static FoodStatsView view2;
    static EnterMoodView view3;
    static MoodStatsView view4;
    static MicroView view5;
    static SuggestionView view6;

    Map<Scene, String> sceneMap = new HashMap<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
        LoginScreen lgs = new LoginScreen(primaryStage);

        //TabbedView tabbedView = new TabbedView(sceneMap);
        //sceneList.addAll(sceneMap.values());
        System.out.println(sceneMap.size());

        TabbedView tabbedView = new TabbedView(sceneMap);
        ToolBar toolBar = tabbedView.toolBar(primaryStage, enterFood(), foodStats(), enterMood(), moodStats(), analysis(), suggestion());

        ToolBar toolBar2 = new ToolBar();

        Button button1 = new Button();
        button1.setFocusTraversable(false);
        button1.setText("Enter Food");
        button1.setOnAction(e -> {
            primaryStage.setScene(view1.getScene());
            view1.setToolBar(toolBar2);
            System.out.println("asdfasdf");
        });

        Button button2 = new Button();
        button2.setFocusTraversable(false);
        button2.setText("Food Stats");
        button2.setOnAction(e -> {
            primaryStage.setScene(view2.getScene());
            view2.setToolBar(toolBar2);
        });

        Button button3 = new Button();
        button3.setFocusTraversable(false);
        button3.setText("Enter Mood");
        button3.setOnAction(e -> {
            primaryStage.setScene(view3.getScene());
            view3.setToolBar(toolBar2);
        });

        Button button4 = new Button();
        button4.setFocusTraversable(false);
        button4.setText("Mood Stats");
        button4.setOnAction(e -> {
            primaryStage.setScene(view4.getScene());
            view4.setToolBar(toolBar2);
        });

        Button button5 = new Button();
        button5.setFocusTraversable(false);
        button5.setText("Analysis");
        button5.setOnAction(e -> {
            primaryStage.setScene(view5.getScene());
            view5.setToolBar(toolBar2);
        });

        Button button6 = new Button();
        button6.setFocusTraversable(false);
        button6.setText("Suggestions");
        button6.setOnAction(e -> {
            primaryStage.setScene(view6.getScene());
            view6.setToolBar(toolBar2);
        });

        //Label label = new Label("Hello");
        toolBar2.getItems().addAll(button1, button2, button3, button4, button5, button6);

        view1.setToolBar(toolBar2);
        view2.setToolBar(toolBar2);
        view3.setToolBar(toolBar2);
        view4.setToolBar(toolBar2);
        view5.setToolBar(toolBar2);
        view6.setToolBar(toolBar2);


        //TabbedView tabbedView = new TabbedView(primaryStage);
    }
    
//    public void tabView(Stage primaryStage){
//                primaryStage.setScene(view6.getScene());
//        primaryStage.show();
//    }

    public Map getSceneMap() {
        return sceneMap;
    }

    private Map constructViews() {

        Map<Scene, String> tempMap = new HashMap<>();

        //Stage primaryStage, EnterFoodView view1, FoodStatsView view2, EnterMoodView view3, MoodStatsView view4, MicroView view5, SuggestionView view6
        return tempMap;

    }

    private EnterFoodView enterFood() {
        FoodModel model = new FoodModel();
        view1 = new EnterFoodView(primaryStage);
        EnterFoodController foodcntl = new EnterFoodController(model, view1, primaryStage);
        return view1;
    }

    private FoodStatsView foodStats() {
        FoodModel model = new FoodModel();
        view2 = new FoodStatsView(primaryStage);
        FoodStatsController foodStatsController = new FoodStatsController(model, view2, primaryStage);
        return view2;
    }

    private EnterMoodView enterMood() {
        MoodModel model = new MoodModel();
        view3 = new EnterMoodView(primaryStage);
        EnterMoodController foodStatsController = new EnterMoodController(model, view3, primaryStage);
        return view3;
    }

    private MoodStatsView moodStats() {
        MoodModel model = new MoodModel();
        view4 = new MoodStatsView(primaryStage);
        MoodStatsController foodStatsController = new MoodStatsController(model, view4, primaryStage);
        return view4;
    }

    private MicroView analysis() {
        MicroModel model = new MicroModel();
        view5 = new MicroView(primaryStage);
        MicroController foodStatsController = new MicroController(model, view5, primaryStage);
        return view5;
    }

    private SuggestionView suggestion() {
        SuggestionModel model = new SuggestionModel();
        view6 = new SuggestionView(primaryStage);
        SuggestionController foodStatsController = new SuggestionController(model, view6, primaryStage);
        return view6;
    }

    //SCENE MAP CONSTRUCTION
}

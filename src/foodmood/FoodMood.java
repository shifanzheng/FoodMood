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
import javafx.application.Application;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class FoodMood extends Application {

    private Stage primaryStage = new Stage();
    UserProfileModel defaultProfile = new UserProfileModel();
    private static EnterFoodView view1;
    private static FoodStatsView view2;
    private static EnterMoodView view3;
    private static MoodStatsView view4;
    private static MicroView view5;
    private static SuggestionView view6;

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

        TabbedView tabbedView = new TabbedView();
        ToolBar toolBar = tabbedView.toolBar(primaryStage, enterFood(), foodStats(), enterMood(), moodStats(), analysis(), suggestion());

        view2.setToolBar(toolBar);
        view3.setToolBar(toolBar);
        view4.setToolBar(toolBar);
        view5.setToolBar(toolBar);
        view6.setToolBar(toolBar);

        view1.setToolBar(toolBar);

        LoginScreen lgs = new LoginScreen(primaryStage, view1, defaultProfile);

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
        MoodModel model = new MoodModel("test", "test", 0);
        view3 = new EnterMoodView(primaryStage);
        EnterMoodController foodStatsController = new EnterMoodController(model, view3, primaryStage);
        return view3;
    }

    private MoodStatsView moodStats() {
        MoodModel model = new MoodModel("test", "test", 0);
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

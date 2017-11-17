/*
 */
package FoodController;

import FoodModel.FoodModel;
import FoodView.EnterFoodView;
import FoodView.FoodStatsView;
import MoodController.EnterMoodController;
import MoodModel.MoodModel;
import MoodView.EnterMoodView;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class FoodStatsController {

    Stage primaryStage;
    private FoodModel model;
    private FoodStatsView view;

    /**
     * Default constructor for FoodStatsController class
     *
     * @param model
     * @param view
     */
    public FoodStatsController(FoodModel model, FoodStatsView view, Stage primaryStage) {
        this.primaryStage = new Stage();
        this.model = model;
        this.view = view;
    }

    /**
     * Method to get statistics on food.
     */
    public void getStats() {
        model.getName();
        model.getType();

    }

    public void updateView(FoodStatsView view) {
        view.setVisible(true);
    }

    public void initilizeMood() {
        //EnterMoodView moodView = new EnterMoodView();
        //MoodModel moodmodel = new MoodModel();
        //EnterMoodController moodCntl = new EnterMoodController(moodmodel, moodView);
        //moodView.displayView();

    }
    
    public FoodStatsView getView(){
        return view;
    }
    
    public void setToolBar(ToolBar toolBar){
        view.setToolBar(toolBar);
    }
    
}

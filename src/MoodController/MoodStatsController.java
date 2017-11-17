/*
 */
package MoodController;

import FoodView.EnterFoodView;
import MoodModel.MoodModel;
import MoodView.MoodStatsView;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class MoodStatsController {

    private MoodModel model;
    private MoodStatsView view;

    /**
     * Default constructor for MoodStatsController class.
     */
    public MoodStatsController(MoodModel model, MoodStatsView view, Stage primaryStage) {
        
        this.model = model;
        this.view = view;
        
    }

    /**
     * Method to get the mood
     */
    public void getMood() {
        model.getMood();
    }
    
    public MoodStatsView getView(){
        return view;
    }
    
    public void setToolBar(ToolBar toolBar){
        view.setToolBar(toolBar);
    }

    
    /**
     * Method to update the view.
//     */
//    public void updateView(MoodStatsView view) {
//        view.setVisible(true);
//    }
}

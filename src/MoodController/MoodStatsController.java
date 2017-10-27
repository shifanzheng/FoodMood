/*
 */
package MoodController;

import MoodModel.MoodModel;
import MoodView.MoodStatsView;
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
        model = new MoodModel();
        view = new MoodStatsView(primaryStage);
    }

    /**
     * Method to get the mood
     */
    public void getMood() {
        model.getMood();
    }

    
    /**
     * Method to update the view.
//     */
//    public void updateView(MoodStatsView view) {
//        view.setVisible(true);
//    }
}

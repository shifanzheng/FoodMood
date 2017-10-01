/*
 */
package MoodController;

import MoodModel.MoodModel;
import MoodView.MoodStatsView;

/**
 *
 * @author Shifan
 */
public class MoodStatsController {

    private MoodModel model = new MoodModel();
    private MoodStatsView view = new MoodStatsView();

    /**
     * Default constructor for MoodStatsController class.
     */
    public MoodStatsController(MoodModel model, MoodStatsView view) {

    }

    /**
     * Method to get the mood
     */
    public void getMood() {
        model.getMood();
    }

    
    /**
     * Method to update the view.
     */
    public void updateView(MoodStatsView view) {
        view.setVisible(true);
    }
}

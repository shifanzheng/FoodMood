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

    public MoodStatsController(MoodModel model, MoodStatsView view) {

    }

    public void getMood() {
        model.getMood();
    }

    public void updateView() {

    }
}

/*
 */
package FoodController;

import FoodModel.FoodModel;
import FoodView.FoodStatsView;
import MoodController.EnterMoodController;
import MoodModel.MoodModel;
import MoodView.EnterMoodView;

/**
 *
 * @author Shifan
 */
public class FoodStatsController {

    private FoodModel model = new FoodModel();
    private FoodStatsView view = new FoodStatsView();

    
    /**
     * Default constructor for FoodStatsController class
     * @param model
     * @param view
     */
    public FoodStatsController(FoodModel model, FoodStatsView view) {
        
    }

    /**
     * Method to get statistics on food.
     */
    public void getStats() {
        model.getName();
        model.getType();
        
    }
    
    public void initilizeMood(){
        EnterMoodView moodView = new EnterMoodView();
        MoodModel moodmodel = new MoodModel();
        EnterMoodController moodCntl = new EnterMoodController(moodmodel, moodView);
        moodView.displayView();
 
    }
}

/*
 */
package MoodController;

import MoodModel.MoodModel;
import MoodView.EnterMoodView;

/**
 *
 * @author Shifan
 */
public class EnterMoodController {
    private MoodModel model = new MoodModel();
    private EnterMoodView view = new EnterMoodView();
    
    /**
     * Default constructor for EnterMoodController class
     * @param model
     * @param view 
     */
    public EnterMoodController(MoodModel model, EnterMoodView view){
        
    }
    
    /**
     * Method to set the mood.
     * @param mood 
     */
    public void setMood(String mood){
        model.setMood(mood);
    }
    
    
    /**
     * Method to update the view.
     */
    public void updateView(){
        
    }
}

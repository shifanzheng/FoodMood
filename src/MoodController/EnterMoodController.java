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
     */
    public EnterMoodController(MoodModel model, EnterMoodView view){
        
    }
    
    /**
     * Method to set the mood. 
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

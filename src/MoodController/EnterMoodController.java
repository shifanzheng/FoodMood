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
    
    public EnterMoodController(MoodModel model, EnterMoodView view){
        
    }
    
    public void setMood(String mood){
        model.setMood(mood);
    }
    
    public void updateView(){
        
    }
}

/*
 */
package PersonalAnalysisController;

import PersonalAnalysisModel.MicroModel;
import PersonalAnalysisView.MicroView;

/**
 *
 * @author Shifan
 */
public class MicroController {
    private MicroModel model = new MicroModel();
    private MicroView view = new MicroView();
    
    
    /**
     * Default constructor for MicroController class
     */
    public MicroController(MicroModel model, MicroView view){
        
    }
    
        /**
     * Method to return time value.
     */
    public int getTime() {
        return model.getTime();
    }

    /**
     * Method to set time.
     */
    public void setTime(int time) {
        model.setTime(time);
    }
    
}

/*
 */
package PersonalAnalysisController;

import FoodView.EnterFoodView;
import PersonalAnalysisModel.MicroModel;
import PersonalAnalysisView.MicroView;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class MicroController {

    private MicroModel model;
    private MicroView view;

    /**
     * Default constructor for MicroController class
     */
    public MicroController(MicroModel model, MicroView view, Stage primaryStage) {
        model = new MicroModel();
        view = new MicroView(primaryStage);
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

    public void updateView(MicroView view) {
        //view.setVisible(true);
    }
    
    public MicroView getView(){
        return view;
    }
    
}

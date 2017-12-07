/*
 */
package MoodController;

import MoodModel.MoodModel;
import MoodView.EnterMoodView;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;
/**
 *
 * @author Shifan
 */
public class EnterMoodController {
    private MoodModel model;
    private EnterMoodView view;
    
    /**
     * Default constructor for EnterMoodController class
     * @param model
     * @param view
     * @param primaryStage
     */
    public EnterMoodController(MoodModel model, EnterMoodView view, Stage primaryStage){
       // this.model;
        this.model = model;
        this.view = view;
        
        setBehaviors();
        
    }
    
    /**
     * Method to set the mood. 
     * @param mood
     */
    public void setMood(String mood){
      //  model.setMood(mood);
    }
    
    /**
     * Method to update the view.
     * @param view
     */
    public EnterMoodView getView(){
        return view;
    }

    private void setBehaviors() {
       submitButton();
    }
    private void submitButton(){
        view.getSubmitButton().setOnAction(e ->{
            model.setMood(view.getMoodSlider());
            model.setFood(view.getFood());
            MoodDataType moodData = new MoodDataType(model.getFood(),model.getMood());
            model.getMoodList().add(moodData);
        
            view.getTable().getItems().add(moodData);
        
            view.clearTextFields();
        
            System.out.println(model.getMoodList().size());
        });
    }
    
    public void setToolBar(ToolBar toolBar){
        view.setToolBar(toolBar);
    }
    
}


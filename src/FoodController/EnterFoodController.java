/*
 */
package FoodController;

import FoodModel.FoodModel;
import FoodView.EnterFoodView;
import java.util.Random;
import java.util.Stack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class EnterFoodController {

    private FoodModel model;
    private EnterFoodView view;


    /**
     * Default constructor for the EnterFoodController class
     * @param model
     * @param view
     */
    public EnterFoodController(FoodModel model, EnterFoodView view, Stage primaryStage) {
        
        this.model = model;
        this.view = view;
        
        setBehaviors();
        
    }
    
    public void setBehaviors(){
        //addFoodButton();
    }

    public EnterFoodView getView(){
        return view;
    }
    
    
    
    public void setToolBar(ToolBar toolBar){
        view.setToolBar(toolBar);
    }
    
    
    
}

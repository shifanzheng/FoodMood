/*
 */
package FoodController;

import FoodModel.FoodModel;
import FoodController.FoodDataType;
import FoodView.EnterFoodView;
import java.util.Random;
import java.util.Stack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;
import DataStorage.Serialization;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        submitButton();
    }

    public EnterFoodView getView(){
        return view;
    }
        
    public void setToolBar(ToolBar toolBar){
        view.setToolBar(toolBar);
    }
    
    public void submitButton(){
        
        view.getSubmitButton().setOnAction(e -> {
            
            model.setFoodName(view.getFoodNameText());
            model.setCalories(view.getCaloriesText());
            model.setProtein(view.getProteinText());
            model.setCarbs(view.getCarbsText());
            model.setFats(view.getFatsText());
            
            FoodDataType foodData = new FoodDataType(model.getFoodName(), model.getCalories(), 
                    model.getProtein(), model.getCarbs(), model.getFats());
            
            model.getFoodList().add(foodData);
            
            view.getTable().getItems().add(foodData);
            
            view.clearTextFields();
            try {
                Serialization serial = new Serialization(view.getTable());
            } catch (IOException ex) {
                Logger.getLogger(EnterFoodController.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(model.getFoodList().size());
            
        });
    }        
}

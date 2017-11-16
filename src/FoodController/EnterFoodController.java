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
        addFoodButton();
    }

    public EnterFoodView getView(){
        return view;
    }
    
    public Button addFoodButton(){
        
        Button button = view.getAddFoodButton();
        
        Stack foodAddHistory = new Stack();
        Random rand = new Random();
        ObservableList<String> items = FXCollections.observableArrayList ();
        
        button.setOnAction(e -> {
            
            String foodAdded = "Food #" + rand.nextInt(1000000);
            items.add(foodAdded);
            foodAddHistory.add(foodAdded);
            System.out.println(foodAdded);
            System.out.println("hello");
            
        });

        return button;
        
    }
    
    
    
}

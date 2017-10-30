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

    private static FoodModel model;
    private static EnterFoodView view;


    /**
     * Default constructor for the EnterFoodController class
     * @param model
     * @param view
     */
    public EnterFoodController(FoodModel model, EnterFoodView view, Stage primaryStage) {
        EnterFoodController.model = new FoodModel();
        EnterFoodController.view = new EnterFoodView(primaryStage);
        
        Button addFoodButton = new Button("Add Food");
        addFoodButton.setOnAction(e -> {
            
        });
        
        Button undoActionButton = new Button("Add Food");

        
        
        Stack foodAddHistory = new Stack();
        
        Random rand = new Random();
        
        ObservableList<String> items =FXCollections.observableArrayList ();
        
        
        addFoodButton.setOnAction(e -> {
            
            String foodAdded = "Food #" + rand.nextInt(1000000);
            items.add(foodAdded);
            foodAddHistory.add(foodAdded);
            //listView.setItems(items);
            
        });
        
        view.setAddFoodButton(addFoodButton);
        
        undoActionButton.setOnAction(e ->{
            
            if(items.size() > 0){
                foodAddHistory.pop();
                items.setAll(foodAddHistory);
            }
            
        });
        
    }

    /**
     * Setter for name of food.
     * @param food
     */
    public void setName(String food) {
        model.setName(food);
    }

    /**
     * Method to update view
     */
    public void updateView(EnterFoodView view) {
        //view.setVisible(true);
    }
    
    public void initializeFoodStat(){
        //FoodStatsView statsview = new FoodStatsView();
        //FoodStatsController foodstatcntl = new FoodStatsController(model, statsview);
        //statsview.setVisible(true);
    
    }
}

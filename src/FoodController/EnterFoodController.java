/*
 */
package FoodController;

import FoodModel.FoodModel;
import FoodView.EnterFoodView;
import FoodView.FoodStatsView;

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
    public EnterFoodController(FoodModel model, EnterFoodView view) {
        EnterFoodController.model = new FoodModel();
        EnterFoodController.view = new EnterFoodView();
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
        view.setVisible(true);
    }
    
    public void initializeFoodStat(){
        FoodStatsView statsview = new FoodStatsView();
        FoodStatsController foodstatcntl = new FoodStatsController(model, statsview);
        statsview.setVisible(true);
    
    }
}

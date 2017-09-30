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

    private FoodModel model = new FoodModel();
    private EnterFoodView view = new EnterFoodView();


    /**
     * Default constructor for the EnterFoodController class
     */
    public EnterFoodController(FoodModel model, EnterFoodView view) {

    }

    /**
     * Setter for name of food.
     */
    public void setName(String food) {
        model.setName(food);
    }

    /**
     * Method to update view
     */
    public void updateView() {
        
    }
    public void initializeFoodStat(){
        FoodStatsView statsview = new FoodStatsView();
        FoodStatsController foodstatcntl = new FoodStatsController(model, statsview);
    
    }
}

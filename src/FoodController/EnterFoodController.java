/*
 */
package FoodController;

import FoodModel.FoodModel;
import FoodView.EnterFoodView;

/**
 *
 * @author Shifan
 */
public class EnterFoodController {

    private FoodModel model = new FoodModel();
    private EnterFoodView view = new EnterFoodView();


    /**
     * Default constructor for the EnterFoodController class
     * @param model
     * @param view 
     */
    public EnterFoodController(FoodModel model, EnterFoodView view) {

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
    public void updateView() {

    }
}

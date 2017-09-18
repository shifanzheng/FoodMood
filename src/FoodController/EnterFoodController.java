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

    public EnterFoodController(FoodModel model, EnterFoodView view) {

    }

    public void setName(String food) {
        model.setName(food);
    }

    public void updateView() {

    }
}

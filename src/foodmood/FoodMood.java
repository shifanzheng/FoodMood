
package foodmood;

import FoodController.EnterFoodController;
import FoodModel.FoodModel;
import FoodView.EnterFoodView;

/**
 *
 * @author Shifan
 */
public class FoodMood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FoodModel model = new FoodModel();
        EnterFoodView view = new EnterFoodView();
        EnterFoodController foodcntl = new EnterFoodController(model, view);
        view.displayView();
        
        
    }
    
}

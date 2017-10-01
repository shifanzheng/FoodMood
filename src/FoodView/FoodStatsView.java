/*
 */
package FoodView;

import FoodModel.FoodModel;
import javax.swing.JFrame;

/**
 *
 * @author Shifan
 */
public class FoodStatsView extends JFrame{

    /**
     * Default constructor for FoodStatView class
     */
    
    public FoodStatsView(){
        FoodModel model = new FoodModel();
    }
    
    /**
     * Method to display the view
     */
    public void displayView() {
        this.setVisible(true);
    }
}

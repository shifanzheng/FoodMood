/*
 */
package FoodView;

import FoodModel.FoodModel;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javax.swing.JFrame;

/**
 *
 * @author Shifan
 */
public class FoodStatsView extends JFrame{

    
    Stage primaryStage;
    Scene scene;
    /**
     * Default constructor for FoodStatView class
     */
    
    public FoodStatsView(Stage primaryStage){
        BorderPane root = new BorderPane();
        scene = new Scene(root, 500, 700);
        this.primaryStage = primaryStage;
    }
    
    /**
     * Method to display the view
     */
    public void displayView() {
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}

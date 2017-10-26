/*
 */
package FoodView;

import FoodModel.FoodModel;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
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
        
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Food Stats View");
        layout.getChildren().addAll(label);
        
        BorderPane root = new BorderPane(layout);
        scene = new Scene(root, 500, 700);
        
    }
    
    /**
     * Method to display the view
     */
    public void displayView() {
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}

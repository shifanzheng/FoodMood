/*
 */
package MoodView;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javax.swing.JFrame;

/**
 *
 * @author Shifan
 */
public class MoodStatsView extends JFrame{
    
    Stage primaryStage = new Stage();
    Scene scene;
    /**
     * Default constructor for MoodStatView class.
     */
    public MoodStatsView(Stage primaryStage){
        this.primaryStage = primaryStage;
        BorderPane root = new BorderPane();
        scene = new Scene(root, 500, 700);
    }
    
    /**
     * Method to display view.
     */
    public void displayView(){
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

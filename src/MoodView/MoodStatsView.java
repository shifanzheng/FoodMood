/*
 */
package MoodView;

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
public class MoodStatsView{
    
    Stage primaryStage = new Stage();
    Scene scene;
    /**
     * Default constructor for MoodStatView class.
     */
    public MoodStatsView(Stage primaryStage){
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Mood Stats View");
        layout.getChildren().addAll(label);
        
        BorderPane root = new BorderPane(layout);
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

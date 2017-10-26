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
public class EnterMoodView{
    
    Stage primaryStage = new Stage();
    Scene scene;
    /**
     * Default constructor for EnterMoodView class.
     */
    public EnterMoodView(Stage primaryStage){
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Enter Mood View");
        layout.getChildren().addAll(label);
        
        BorderPane root = new BorderPane(layout);
        scene = new Scene(root, 500, 700);
    }
    
    /**
     * Method to display the view.
     */
    public void displayView(){
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

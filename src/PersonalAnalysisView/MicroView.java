/*
 */
package PersonalAnalysisView;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class MicroView{
    
    private Stage primaryStage;
    private Scene scene;
    /**
     * Default constructor for MicroView class.
     */
    public MicroView(Stage primaryStage){
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Analysis View");
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

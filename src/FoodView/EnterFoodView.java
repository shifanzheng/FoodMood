
package FoodView;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class EnterFoodView{
    
    Stage primaryStage = new Stage();
    Scene scene;
    /**
     * Default constructor for EnterFoodView Class
     */
    public EnterFoodView(Stage primaryStage){
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Enter Food View");
        layout.getChildren().addAll(label);
        
        BorderPane root = new BorderPane(layout);
        scene = new Scene(root, 500, 700);
    }
    
    /**
     * Method to display view
     */
    public void displayView() {
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public Scene getScene(){
        return scene;
    }
    
}

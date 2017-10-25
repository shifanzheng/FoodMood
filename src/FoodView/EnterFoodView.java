
package FoodView;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
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
        BorderPane root = new BorderPane();
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

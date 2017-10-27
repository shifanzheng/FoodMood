/*
 */
package foodmood;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class HomeScreen {

    Scene scene;
    Stage primaryStage = new Stage();

    public HomeScreen() {
        GridPane grid = new GridPane();
        
        Label welcomeLabel = new Label("Welcome to the Home Screen");
        grid.add(welcomeLabel, 0, 0);
        
        Button bt = new Button();
        bt.setText("Go to Next Step");
        grid.add(bt,0,1);

        scene = new Scene(grid, 500, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

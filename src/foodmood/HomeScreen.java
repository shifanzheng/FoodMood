/*
 */
package foodmood;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class HomeScreen {

    Scene scene;
//    Stage primaryStage = new Stage();

    public HomeScreen(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(25);

        scene = new Scene(grid, 500, 700);

        Label welcomeLabel = new Label("Welcome to the Home Screen");
        grid.add(welcomeLabel, 0, 0);

        Button homeBt = new Button();
        homeBt.setText("Return to Login");
        grid.add(homeBt, 0, 1);

        Button tabViewBt = new Button();
        tabViewBt.setText("Go to tab view");
        grid.add(tabViewBt, 0, 2);

        primaryStage.setScene(scene);
        primaryStage.show();

        homeBt.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                LoginScreen lgs = new LoginScreen(primaryStage);

            }
        });

        tabViewBt.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                //code to go to tab view        
            }
        });
    }

    public Scene getScene() {
        return scene;
    }
}

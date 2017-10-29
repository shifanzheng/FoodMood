/*
 */
package foodmood;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class CreateAccount {

    public CreateAccount(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(25);
        grid.setHgap(25);

        Scene scene = new Scene(grid, 500, 700);

        Label usernameLabel = new Label("Enter your new username");
        grid.add(usernameLabel, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label passwordLabel = new Label("Enter your new password");
        grid.add(passwordLabel, 0, 2);

        TextField passwordTextField = new TextField();
        grid.add(passwordTextField, 1, 2);

        Button submitBt = new Button("Submit");
        grid.add(submitBt, 2, 3);

        submitBt.setOnAction((ActionEvent e) -> {
            LoginScreen lgs = new LoginScreen(primaryStage);
            lgs.setUserPass(userTextField.getText(), passwordTextField.getText());
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

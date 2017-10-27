/*
 */
package foodmood;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class LoginScreen {

//    HomeScreen hs = new HomeScreen();
    
    public LoginScreen() {
        Stage primaryStage = new Stage();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(30);
        grid.setVgap(25);

        Scene scene = new Scene(grid, 500, 700);

        Text welcomeMessage = new Text("Welcome to Food Mood");
        welcomeMessage.setFont(Font.font("Calibri", 30));
        grid.add(welcomeMessage, 0, 0, 2, 1);

        Label username = new Label("Username:");
        grid.add(username, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label password = new Label("Password:");
        grid.add(password, 0, 2);

        PasswordField passwordTextField = new PasswordField();
        grid.add(passwordTextField, 1, 2);

        Button bt = new Button("Sign in");
        grid.add(bt, 1, 4);

        final Text errorMessage = new Text();
        grid.add(errorMessage, 1, 5);

        primaryStage.setScene(scene);
        primaryStage.show();

        bt.setOnAction(new EventHandler<ActionEvent>() {
            
            //Commented out to skip the hassle of logging in each time
//            @Override
//            public void handle(ActionEvent e) {
//                if (userTextField.getText().equals("admin") && passwordTextField.getText().equals("password")) {
//                    primaryStage.close();
//                    HomeScreen hs = new HomeScreen();
//                } else {
//                    errorMessage.setFill(Color.RED);
//                    errorMessage.setText("Incorrect Username or Password");
//                }
//            }
            
            @Override
            public void handle(ActionEvent e) {
                    HomeScreen hs = new HomeScreen();
                    primaryStage.close();
            }
        });
    }
}

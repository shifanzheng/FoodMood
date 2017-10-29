/*
 */
package foodmood;

import javafx.event.ActionEvent;
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

    static String userName;
    static String password;

    private Scene scene;

    public LoginScreen(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(30);
        grid.setVgap(25);

        scene = new Scene(grid, 500, 700);

        Text welcomeMessage = new Text("Welcome to Food Mood");
        welcomeMessage.setFont(Font.font("Calibri", 30));
        grid.add(welcomeMessage, 0, 0, 2, 1);

        Label usernameLabel = new Label("Username:");
        grid.add(usernameLabel, 0, 1);

        TextField userTextField = new TextField();

        grid.add(userTextField, 1, 1);

        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 2);

        PasswordField passwordTextField = new PasswordField();
        grid.add(passwordTextField, 1, 2);
        passwordTextField.setText(password);

        Button loginBt = new Button("Sign in");
        grid.add(loginBt, 1, 4);

        final Text errorMessage = new Text();
        grid.add(errorMessage, 1, 6);

        Button createAccountBt = new Button("Create Account");
        grid.add(createAccountBt, 1, 5);

        loginBt.setOnAction((ActionEvent e) -> {
            if (userTextField.getText() == null || passwordTextField.getText() == null) {
                errorMessage.setFill(Color.RED);
                errorMessage.setText("You did not enter a username or password");
            }
            else if (userTextField.getText().equals(userName) && passwordTextField.getText().equals(password)){
                HomeScreen hs = new HomeScreen(primaryStage);
            }
            else {
                errorMessage.setFill(Color.RED);
                errorMessage.setText("Incorrect Username or Password");
            }
        });

        createAccountBt.setOnAction((ActionEvent e) -> {
            CreateAccount ca = new CreateAccount(primaryStage);
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setUserPass(String user, String pass) {
        userName = user;
        password = pass;
    }
}

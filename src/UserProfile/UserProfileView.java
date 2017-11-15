/*
 */
package UserProfile;

import FoodView.EnterFoodView;
import foodmood.HomeScreen;
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
public class UserProfileView {

    public UserProfileView(Stage primaryStage, EnterFoodView view1, UserProfileModel upm) {
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

        Label foodLabel = new Label("Enter your new favorite food");
        grid.add(foodLabel, 0, 3);

        TextField foodTextField = new TextField();
        grid.add(foodTextField, 1, 3);

        Label moodLabel = new Label("Enter your current mood");
        grid.add(moodLabel, 0, 4);

        TextField moodTextField = new TextField();
        grid.add(moodTextField, 1, 4);

        Button submitBt = new Button("Submit Changes");
        grid.add(submitBt, 0, 5);

        submitBt.setOnAction((ActionEvent e) -> {
            upm.setUserName(userTextField.getText());
            upm.setPassword(passwordTextField.getText());
            upm.setFavoriteFood(foodTextField.getText());
            upm.setCurrentMood(moodTextField.getText());
            HomeScreen hs = new HomeScreen(primaryStage, view1, upm);

        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

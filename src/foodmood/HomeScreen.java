/*
 */
package foodmood;

import UserProfile.UserProfileView;
import UserProfile.UserProfileModel;
import javafx.event.ActionEvent;
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

    public HomeScreen(Stage primaryStage, Scene view1, UserProfileModel upm) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(25);

        Scene scene = new Scene(grid, 500, 700);
        String css = this.getClass().getResource("/CSS/Theme1.css").toExternalForm(); 
        scene.getStylesheets().add(css);

        Label welcomeLabel = new Label("Welcome to the Home Screen " + upm.getUserName() + " !");
        grid.add(welcomeLabel, 0, 0);

        Label foodLabel = new Label("Your favorite food is: " + upm.getFavoriteFood());
        grid.add(foodLabel, 0, 1);

        Label moodLabel = new Label("Your current mood is: " + upm.getCurrentMood());
        grid.add(moodLabel, 0, 2);

        Button homeBt = new Button();
        homeBt.setText("Return to Login");
        grid.add(homeBt, 0, 3);

        Button editBt = new Button();
        editBt.setText("Edit Profile");
        grid.add(editBt, 0, 4);

        Button tabViewBt = new Button();
        tabViewBt.setText("Go to tab view");
        grid.add(tabViewBt, 0, 5);

        primaryStage.setScene(scene);
        primaryStage.show();

        homeBt.setOnAction((ActionEvent e) -> {
            LoginScreen lgs = new LoginScreen(primaryStage, view1, upm);
        });

        editBt.setOnAction((ActionEvent e) -> {
            UserProfileView up = new UserProfileView(primaryStage, view1, upm);
        });

        tabViewBt.setOnAction((ActionEvent e) -> {
            primaryStage.setScene(view1);
            
        });
    }
}

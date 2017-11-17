
package FoodView;

import java.util.Random;
import java.util.Stack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
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
    BorderPane root;
        
    ToolBar toolBar;
    
    /**
     * Default constructor for EnterFoodView Class
     */
    public EnterFoodView(Stage primaryStage){
        
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Enter Food View");
        
        Label foodName = new Label("Food:");
        Label calories = new Label("Calories:");
        Label protein = new Label("Protein:");
        Label carbs = new Label("Carbs:");
        Label fats = new Label("Fats:");
        
        TextField foodNameText = new TextField();
        TextField caloriesText = new TextField();
        TextField proteinText = new TextField();
        TextField carbsText = new TextField();
        TextField fatsText = new TextField();
        
        foodNameText.setMaxWidth(160);
        caloriesText.setMaxWidth(160);
        proteinText.setMaxWidth(160);
        carbsText.setMaxWidth(160);
        fatsText.setMaxWidth(160);
        
        Button submitFood = new Button("Submit");
        
        layout.getChildren().addAll(label, foodName, foodNameText, calories, caloriesText, protein, proteinText, carbs, carbsText, fats, fatsText, submitFood);
        
        Stack foodAddHistory = new Stack();
        
        Random rand = new Random();
        
        ObservableList<String> items = FXCollections.observableArrayList ();
        
        
        
        root = new BorderPane(layout);
        
        
        
        
        
        //TabbedView tabbedView = new TabbedView(FoodMood.getSceneMap());
        //System.out.println(toolBar.getChildrenUnmodifiable().size() + " Tool bar elements.");
        root.setTop(toolBar);
        
        
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
    
    public static String getSceneName(){
        return "Enter Food";
    }
    
    public ToolBar getToolBar(){
        return toolBar;
    }
    
    public void setToolBar(ToolBar toolBar){
        this.toolBar = toolBar;
        root.setTop(toolBar);
    }
        
}

/*
 */
package NutritionSuggestionView;

import FoodController.FoodDataType;
import foodmood.FoodMood;
import foodmood.TabbedView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class SuggestionView{
    
    private Stage primaryStage;
    ToolBar toolBar;
    private Scene scene;
    BorderPane root;
    TextField calorieLimitText;
    TextField dietaryConstraintsText;
    
    /**
     * Default constructor for SuggestionView class
     */
    public SuggestionView(Stage primaryStage){
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Suggestions View");       
        Label calorieLimit = new Label ("Enter Calorie Limit");
        Label dietaryConstraints = new Label ("Other Dietary Constraints");
        
        calorieLimitText = new TextField();
        dietaryConstraintsText = new TextField();
        TextArea instructions = new TextArea("If you have any special dietary needs, or are watching calories check your suggestions \nfor foods to improve your mood"
                + " that aren't just healthy, but will make you happy too! \nSimply enter a calorie limit, then type anything you can't eat in the \n'other dietary constraints' box"
                + " seperated by commas, then hit refresh ");
        instructions.setEditable(false);
        instructions.setFocusTraversable(false);
        instructions.setMouseTransparent(true);
        
        calorieLimitText.setMaxWidth(160);
        dietaryConstraintsText.setMaxWidth(160);
        
        TableView table = new TableView();
        
        table.setEditable(true);
 
        TableColumn foodCol = new TableColumn("Food");
        TableColumn caloriesCol = new TableColumn("Calories");
        TableColumn proteinCol = new TableColumn("Protein");
        TableColumn carbsCol = new TableColumn("Carbs");
        TableColumn fatsCol = new TableColumn("Fats");
        
        foodCol.setCellValueFactory(new PropertyValueFactory<>("foodName"));
        caloriesCol.setCellValueFactory(new PropertyValueFactory<>("calories"));
        proteinCol.setCellValueFactory(new PropertyValueFactory<>("protein"));
        carbsCol.setCellValueFactory(new PropertyValueFactory<>("carbs"));
        fatsCol.setCellValueFactory(new PropertyValueFactory<>("fat"));
        
        table.getColumns().addAll(foodCol, caloriesCol, proteinCol, carbsCol, fatsCol);
        
        Button refresh = new Button("Refresh");
        
      
      
        layout.getChildren().addAll(label,calorieLimit,calorieLimitText,dietaryConstraints,dietaryConstraintsText,instructions,refresh,table);
        
        root = new BorderPane(layout);
        
        //TabbedView tabbedView = new TabbedView(FoodMood.getSceneMap());
        //root.setTop(toolBar);
        
        scene = new Scene(root, 500, 700);
    }

    /**
     * Method to display the view.
     */
    public void displayView() {
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Scene getScene(){
        return scene;
    }
    
    public static String getSceneName(){
        return "Suggestions";
    }
    
    public void setToolBar(ToolBar toolBar){
        this.toolBar = toolBar;
        root.setTop(toolBar);
    }
    
}

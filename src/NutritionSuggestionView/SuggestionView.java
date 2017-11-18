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

        TextArea instructions = new TextArea("Thank you for using FoodMood! If you clicked on this tab that means you're looking"+
        "\nfor some suggestions on what to eat. Lucky for you we have a couple suggestions to"+
        "\nhelp you make up your mind. If you're looking for something to make you happy"+
        "\nhow about a nice piece of cake, you've earned it after all. Maybe you want some"+
        "\nenergy after a workout. In that case we suggest eating something with protein"+
        "\nand carbs to help you get your energy back, so how about a nice sandwich?"+
        "\nif you want something to help you relax, might I suggest some pepermint tea?");
        
        instructions.setEditable(false);
        instructions.setFocusTraversable(false);
        instructions.setMouseTransparent(true);
        
        layout.getChildren().addAll(label,instructions);
        
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

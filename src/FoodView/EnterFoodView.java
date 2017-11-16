
package FoodView;

import java.util.Random;
import java.util.Stack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
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
    
    ListView<String> listView;
    Button addFoodButton;
    Button undoActionButton;
    
    ToolBar toolBar;
    
    /**
     * Default constructor for EnterFoodView Class
     */
    public EnterFoodView(Stage primaryStage){
        
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Enter Food View");
        
        listView = new ListView();
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
        addFoodButton = new Button("Add Food");
        undoActionButton = new Button("Undo Action");
        
        layout.getChildren().addAll(label, listView, addFoodButton, undoActionButton);
        
        Stack foodAddHistory = new Stack();
        
        Random rand = new Random();
        
        ObservableList<String> items = FXCollections.observableArrayList ();
        
        addFoodButton.setOnAction(e -> {
            
            String foodAdded = "Food #" + rand.nextInt(1000000);
            items.add(foodAdded);
            foodAddHistory.add(foodAdded);
            listView.setItems(items);
            
        });
        
        undoActionButton.setOnAction(e ->{
            
            if(items.size() > 0){
                foodAddHistory.pop();
                items.setAll(foodAddHistory);
            }
            
        });
        
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
    
    public void setAddFoodButton(Button addFoodButton){
        this.addFoodButton = addFoodButton;
    }
    
    public void setUndoActionButton(Button undoActionButton){
        this.undoActionButton = undoActionButton;
    }
    
    public Button getAddFoodButton(){
        return addFoodButton;
    }
    
    public Button getUndoActionButton(){
        return undoActionButton;
    }
    
}

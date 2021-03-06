/*
 */
package MoodView;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class MoodStatsView{
    
    Stage primaryStage = new Stage();
    ToolBar toolBar;
    Scene scene;
    BorderPane root;
    /**
     * Default constructor for MoodStatView class.
     */
    public MoodStatsView(Stage primaryStage){
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Mood Stats View");
        layout.getChildren().addAll(label);
        
        root = new BorderPane(layout);
        
        //TabbedView tabbedView = new TabbedView(FoodMood.getSceneMap());
        //root.setTop(toolBar);
        
        scene = new Scene(root, 500, 700);
    }
    
    /**
     * Method to display view.
     */
    public void displayView(){
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Scene getScene(){
        return scene;
    }
    
    public static String getSceneName(){
        return "Mood Stats";
    }
    
    public void setToolBar(ToolBar toolBar){
        this.toolBar = toolBar;
        root.setTop(toolBar);
        String css = this.getClass().getResource("/CSS/Theme1.css").toExternalForm(); 
        scene.getStylesheets().add(css);
    }
    
}

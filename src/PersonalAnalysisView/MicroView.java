/*
 */
package PersonalAnalysisView;

import foodmood.FoodMood;
import foodmood.TabbedView;
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
public class MicroView{
    
    private Stage primaryStage;
    ToolBar toolBar;
    private Scene scene;
    BorderPane root;
    /**
     * Default constructor for MicroView class.
     */
    public MicroView(Stage primaryStage){
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Analysis View");
        layout.getChildren().addAll(label);
        
        root = new BorderPane(layout);
        
        //TabbedView tabbedView = new TabbedView(FoodMood.getSceneMap());
        //root.setTop(toolBar);
        
        scene = new Scene(root, 500, 700);
    }
    
    /**
     * Method to display the view.
     */
    public void displayView(){
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Scene getScene(){
        return scene;
    }
    
    public static String getSceneName(){
        return "Analysis";
    }
    
    public void setToolBar(ToolBar toolBar){
        this.toolBar = toolBar;
        root.setTop(toolBar);
    }
    
}

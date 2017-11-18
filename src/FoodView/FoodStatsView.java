/*
 */
package FoodView;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JFrame;

/**
 *
 * @author Shifan
 */
public class FoodStatsView extends JFrame{

    
    Stage primaryStage;
    ToolBar toolBar;
    Scene scene;
    BorderPane root;
    /**
     * Default constructor for FoodStatView class
     */
    
    public FoodStatsView(Stage primaryStage){
        
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Food Stats View");
        
        
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Protein", 13),
                new PieChart.Data("Carbs", 25),
                new PieChart.Data("Fat", 10));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Macronutrient Distribution");
        
        
        layout.getChildren().addAll(label, chart);
        
        root = new BorderPane(layout);
        
        scene = new Scene(root, 500, 700);
        String css = this.getClass().getResource("/CSS/Theme1.css").toExternalForm(); 
        scene.getStylesheets().add(css);
        
    }
    
    /**
     * Method to display the view
     */
    public void displayView() {
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public Scene getScene(){
        return scene;
    }
    
    public static String getSceneName(){
        return "Food Stats";
    }
    
    public void setToolBar(ToolBar toolBar){
        this.toolBar = toolBar;
        root.setTop(toolBar);
    }
    
}

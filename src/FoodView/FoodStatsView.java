/*
 */
package FoodView;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
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

    
    private Stage primaryStage;
    private ToolBar toolBar;
    private Scene scene;
    private BorderPane root;
    private Button refreshButton;
    private Label label;
    
    
    private ObservableList<PieChart.Data> pieChartData;
    private PieChart chart;
    /**
     * Default constructor for FoodStatView class
     */
    
    public FoodStatsView(Stage primaryStage){
        
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        
        refreshButton = new Button("Refresh");
        label = new Label("0 Calories");
        label.setMaxWidth(Double.MAX_VALUE);
        label.setAlignment(Pos.CENTER);
        
        pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Protein", 1),
                new PieChart.Data("Carbs", 1),
                new PieChart.Data("Fat", 1));
        chart = new PieChart(pieChartData);
        chart.setTitle("Macronutrient Distribution");
        
        /*
        pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Protein", 103),
                new PieChart.Data("Carbs", 25),
                new PieChart.Data("Fat", 10));
        chart = new PieChart(pieChartData);
        */
        
        layout.getChildren().addAll(refreshButton, label, chart);
        
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

    public ObservableList<PieChart.Data> getPieChartData() {
        return pieChartData;
    }

    public void setPieChartData(ObservableList<PieChart.Data> pieChartData) {
        this.pieChartData = pieChartData;
    }

    public PieChart getChart() {
        return chart;
    }

    public void setChart(ObservableList<PieChart.Data> pieChartData) {
        this.chart = new PieChart(pieChartData);
    }

    public Button getRefreshButton() {
        return refreshButton;
    }

    public void setRefreshButton(Button refreshButton) {
        this.refreshButton = refreshButton;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
    
}

/*
 */
package PersonalAnalysisView;

import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class MicroView {

    private Stage primaryStage;
    private ToolBar toolBar;
    private Scene scene;
    private BorderPane root;

    private Label analysisInfo;
    private Button analysisBt;
    private Label nutrientInfo;
    
    private Label suggestions;
    
    private StackedBarChart<String, Number> sbc;

    /**
     * Default constructor for MicroView class.
     */
    public MicroView(Stage primaryStage) {
        this.primaryStage = primaryStage;

        //GridPane grid = new GridPane();
        VBox vbox = new VBox();

        vbox.setAlignment(Pos.TOP_LEFT);

        Label analysisLabel = new Label("Analysis View\n");
        analysisBt = new Button("Give Analysis");
        analysisInfo = new Label("");
        nutrientInfo = new Label("");
        suggestions = new Label("");
        
        
        

        root = new BorderPane(vbox);
        
        //TEST CODE
        
        final String proteins = "Proteins";
        final String carbs = "Carbs";
        final String fats = "Fats";

        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        sbc = new StackedBarChart<String, Number>(xAxis, yAxis);
        final XYChart.Series<String, Number> series1 =
                new XYChart.Series<String, Number>();
        final XYChart.Series<String, Number> series2 =
                new XYChart.Series<String, Number>();
        final XYChart.Series<String, Number> series3 =
                new XYChart.Series<String, Number>();
        
        yAxis.setAutoRanging(false);
        xAxis.setAutoRanging(false);
        yAxis.setUpperBound(100);
        yAxis.setLowerBound(0);
 
        sbc.setTitle("Macronutrients by Percent Mood Increase");
        xAxis.setCategories(FXCollections.<String>observableArrayList(
                Arrays.asList(proteins, carbs, fats)));
        yAxis.setLabel("Value");
        sbc.setLegendVisible(false);
        
        series1.getData().add(new XYChart.Data<String, Number>(proteins, 0));
        series2.getData().add(new XYChart.Data<String, Number>(carbs, 0));
        series3.getData().add(new XYChart.Data<String, Number>(fats, 0));
        
        sbc.setVisible(false);

        sbc.getData().addAll(series1, series2, series3);
        
        vbox.getChildren().addAll(analysisLabel, analysisBt, analysisInfo, nutrientInfo, sbc, suggestions);
        
        //END TEST CODE

        scene = new Scene(root, 500, 700);
        String css = this.getClass().getResource("/CSS/Theme1.css").toExternalForm();
        scene.getStylesheets().add(css);

    }

    /**
     * Method to display the view.
     */
    public void displayView() {
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Scene getScene() {
        return scene;
    }

    public static String getSceneName() {
        return "Analysis";
    }

    public void setToolBar(ToolBar toolBar) {
        this.toolBar = toolBar;
        root.setTop(toolBar);
    }

    /**
     * @return the analysisBt
     */
    public Button getAnalysisBt() {
        return analysisBt;
    }

    /**
     * @param analysisBt the analysisBt to set
     */
    public void setAnalysisBt(Button analysisBt) {
        this.analysisBt = analysisBt;
    }

    /**
     * @return the analysisInfo
     */
    public Label getAnalysisInfo() {
        return analysisInfo;
    }

    /**
     * @param analysisInfo the analysisInfo to set
     */
    public void setAnalysisInfo(Label analysisInfo) {
        this.analysisInfo = analysisInfo;
    }

    /**
     * @return the nutrientInfo
     */
    public Label getNutrientInfo() {
        return nutrientInfo;
    }

    /**
     * @param nutrientInfo the nutrientInfo to set
     */
    public void setNutrientInfo(Label nutrientInfo) {
        this.nutrientInfo = nutrientInfo;
    }

    public StackedBarChart<String, Number> getSbc() {
        return sbc;
    }

    public void setSbc(StackedBarChart<String, Number> sbc) {
        this.sbc = sbc;
    }

    public Label getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(Label suggestions) {
        this.suggestions = suggestions;
    }
    
    

}

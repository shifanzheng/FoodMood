/*
 */
package PersonalAnalysisView;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class MicroView {

    private Stage primaryStage;
    ToolBar toolBar;
    private Scene scene;
    BorderPane root;

    private Label analysisInfo;
    private Button analysisBt;
    private Label nutrientInfo;

    /**
     * Default constructor for MicroView class.
     */
    public MicroView(Stage primaryStage) {
        this.primaryStage = primaryStage;

        GridPane grid = new GridPane();

        grid.setAlignment(Pos.TOP_LEFT);
        grid.setVgap(15);

        Label analysisLabel = new Label("Analysis View\n");
        analysisBt = new Button("Give Analysis");
        analysisInfo = new Label("Analysis Results");
        nutrientInfo = new Label("Favorite Nutrient");
        grid.add(analysisLabel, 0, 0);
        grid.add(analysisBt, 0, 1);
        grid.add(analysisInfo, 0, 2);
        grid.add(nutrientInfo, 0, 3);

        root = new BorderPane(grid);

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

}

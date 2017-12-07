
package FoodView;

import FoodController.FoodDataType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
public class EnterFoodView{
    
    Stage primaryStage = new Stage();
    Scene scene;
    BorderPane root;
        
    ToolBar toolBar;
    
    TextField foodNameText;
    TextField caloriesText;
    TextField proteinText;
    TextField carbsText;
    TextField fatsText;
    
    private Slider moodSlider;
    
    Button submitButton;
    
    TableView<FoodDataType> table;
    
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
        
        foodNameText = new TextField();
        caloriesText = new TextField();
        proteinText = new TextField();
        carbsText = new TextField();
        fatsText = new TextField();
        
        foodNameText.setMaxWidth(160);
        caloriesText.setMaxWidth(160);
        proteinText.setMaxWidth(160);
        carbsText.setMaxWidth(160);
        fatsText.setMaxWidth(160);
        
        moodSlider = new Slider();
        moodSlider.setMin(1);
        moodSlider.setMax(10);
        moodSlider.setValue(1);
        moodSlider.setShowTickLabels(true);
        moodSlider.setShowTickMarks(true);
        moodSlider.setMajorTickUnit(1);
        moodSlider.setMinorTickCount(0);
        moodSlider.setBlockIncrement(1);
        moodSlider.valueProperty().addListener((obs,oldVal,newVal)->moodSlider.setValue(newVal.intValue()));
        moodSlider.setMaxWidth(300);
        
        table = new TableView<>();
        
        table.setEditable(true);
 
        TableColumn foodCol = new TableColumn("Food");
        TableColumn caloriesCol = new TableColumn("Calories");
        TableColumn proteinCol = new TableColumn("Protein");
        TableColumn carbsCol = new TableColumn("Carbs");
        TableColumn fatsCol = new TableColumn("Fats");
        TableColumn moodCol = new TableColumn("Mood");
        
        foodCol.setCellValueFactory(new PropertyValueFactory<>("foodName"));
        caloriesCol.setCellValueFactory(new PropertyValueFactory<>("calories"));
        proteinCol.setCellValueFactory(new PropertyValueFactory<>("protein"));
        carbsCol.setCellValueFactory(new PropertyValueFactory<>("carbs"));
        fatsCol.setCellValueFactory(new PropertyValueFactory<>("fat"));
        moodCol.setCellValueFactory(new PropertyValueFactory<>("mood"));
        
        table.getColumns().addAll(foodCol, caloriesCol, proteinCol, carbsCol, fatsCol, moodCol);
        
        submitButton = new Button("Submit");
        
        layout.getChildren().addAll(foodName, foodNameText, calories, caloriesText, protein, proteinText, carbs, carbsText, fats, fatsText, submitButton, moodSlider, table);
        root = new BorderPane(layout);
        root.setTop(toolBar);
        
        scene = new Scene(root, 500, 700);
        String css = this.getClass().getResource("/CSS/Theme1.css").toExternalForm(); 
        scene.getStylesheets().add(css);
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
        
    public String getFoodNameText(){
        return foodNameText.getText();
    }
    
    public int getCaloriesText(){
        return Integer.valueOf(caloriesText.getText());
    }
        
    public int getProteinText(){
        return Integer.valueOf(proteinText.getText());
    }
    
    public int getCarbsText(){
        return Integer.valueOf(carbsText.getText());
    }
    
    public int getFatsText(){
        return Integer.valueOf(fatsText.getText());
    }
    
    public Button getSubmitButton(){
        return submitButton;
    }
    
    public TableView getTable(){
        return table;
    }
    
    public void clearTextFields(){
        foodNameText.clear();
        caloriesText.clear();
        proteinText.clear();
        carbsText.clear();
        fatsText.clear();
    }

    public Slider getMoodSlider() {
        return moodSlider;
    }

    public void setMoodSlider(Slider moodSlider) {
        this.moodSlider = moodSlider;
    }
            
}

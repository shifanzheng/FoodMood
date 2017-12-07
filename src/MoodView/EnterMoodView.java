/*
 */
package MoodView;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Shifan
 */
public class EnterMoodView{
    
    Stage primaryStage = new Stage();
    Scene scene;
    BorderPane root;
    
    TableView table = new TableView();
    ListView<String> listView;
    Button addFoodButton;
    Button undoActionButton;
    TextField foodField;
    String food;
    ToolBar toolBar;
    
    Slider moodSlider;
    Button btnAdd;
    Button submitButton;
    /**
     * Default constructor for EnterMoodView class.
     * @param primaryStage
     */
    public EnterMoodView(Stage primaryStage){
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Enter Mood View");
                        
        
        Label moodLabel = new Label("Set your mood: (1 lowest 10 highest)");
        Label foodLabel = new Label("Food");
        
        foodField = new TextField();
        foodField.setMaxWidth(160);
        
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
        
        table.setEditable(true);
        table.setMaxWidth(300);
 
        TableColumn foodCol = new TableColumn("Food");
        TableColumn moodCol = new TableColumn("Mood");
        
        foodCol.setCellValueFactory(new PropertyValueFactory<>("foodName"));
        moodCol.setCellValueFactory(new PropertyValueFactory<>("Mood"));
        
        table.getColumns().addAll(foodCol,moodCol);
        
        submitButton = new Button("Submit");
        
        layout.getChildren().addAll(foodLabel,foodField,label,moodLabel,moodSlider,submitButton,table);
        root = new BorderPane(layout);
        root.setTop(toolBar);
        scene = new Scene(root, 500, 700);
        String css = this.getClass().getResource("/CSS/Theme1.css").toExternalForm(); 
        scene.getStylesheets().add(css);
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
        return "Enter Mood";
    }
    
    public void setToolBar(ToolBar toolBar){
        this.toolBar = toolBar;
        root.setTop(toolBar);
    }

    /**
     * @return the btnAdd
     */
    public Button getBtnAdd() {
        return btnAdd;
    }

    /**
     * @param btnAdd the btnAdd to set
     */
    public void setBtnAdd(Button btnAdd) {
        this.btnAdd = btnAdd;
    }

    /**
     * @return the moodSlider
     */
    public int getMoodSlider() {
        int value = 0;
        value = (int)moodSlider.getValue();
        return value;
    }
    
    public String getFood(){
        return foodField.getText();
    }

    /**
     * @param moodSlider the moodSlider to set
     */
    public void setMoodSlider(Slider moodSlider) {
        this.moodSlider = moodSlider;
    }
    public TableView getTable(){
        return table;
    }
    public void clearTextFields(){
        foodField.clear();
    }
    public Button getSubmitButton(){
        return submitButton;
    }

    
    
    
}

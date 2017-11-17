/*
 */
package MoodView;

import MoodModel.MoodModel;
import foodmood.FoodMood;
import foodmood.TabbedView;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shifan
 */
public class EnterMoodView{
    
    Stage primaryStage = new Stage();
    ToolBar toolBar;
    Scene scene;
    BorderPane root;
    private  TextField mood;
    private  Button btnAdd;
    private  Button btnNext;
    private  Label moodLabel, sliderLabel;
    private  Slider moodSlider;
    private  MoodModel model;
    /**
     * Default constructor for EnterMoodView class.
     */
    public EnterMoodView(Stage primaryStage){
        this.primaryStage = primaryStage;
        
        VBox layout = new VBox();
        Label label = new Label("Enter Mood View");
        layout.getChildren().addAll(label);
        
        root = new BorderPane(layout);
        
        //TabbedView tabbedView = new TabbedView(FoodMood.getSceneMap());
        //root.setTop(toolBar);
        
        scene = new Scene(root, 500, 700);
        model = new MoodModel();
        Frame frame = new Frame();
        
        Font font = new Font("Arial",1,16);
        
        mood = new TextField();
        
        btnAdd = new Button("Add More");  
        btnNext = new Button("Next Step");
        
        moodLabel = new Label("Enter Your Mood: ");
        sliderLabel = new Label("Enter the intensity of your Mood(1 - 10): ");
        
       /* moodSlider = new JSlider();
        moodSlider = new JSlider(JSlider.HORIZONTAL, 1,10,1);
        moodSlider.setMajorTickSpacing(1);
        moodSlider.setPaintTicks(true);
        moodSlider.setPaintLabels(true);
        
        frame.setLayout(null);
        frame.add(mood);
    
        frame.add(btnAdd);
        frame.add(btnNext);
        
        frame.add(moodLabel);
        frame.add(sliderLabel);
        frame.add(moodSlider);
        
        frame.setSize(900,450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        mood.setBounds(120, 220, 100, 25);
        btnAdd.setBounds(260, 220, 100, 25);
        btnNext.setBounds(260, 350, 100, 25);
        moodLabel.setBounds(15, 220, 105, 25);
        sliderLabel.setBounds(15, 250, 105, 25);
        moodSlider.setBounds(15,270,105,25);*/
        
        
        
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
    
     public void addButtonListener(ActionListener al) { 
    
        //getBtnAdd().addActionListener(al);
       // getBtnNext().addActionListener(al);
    }

    /**
     * @return the mood
     */
    public String getMood() {
        return mood.getText();
    }

    /**
     * @param mood the mood to set
     */
    public void setMood(TextField mood) {
        this.mood = mood;
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
     * @return the btnNext
     */
    public Button getBtnNext() {
        return btnNext;
    }

    /**
     * @param btnNext the btnNext to set
     */
    public void setBtnNext(Button btnNext) {
        this.btnNext = btnNext;
    }

    /**
     * @return the moodSlider
     */
    public Slider getMoodSlider() {
        return moodSlider;
    }

    /**
     * @param moodSlider the moodSlider to set
     */
    public void setMoodSlider(Slider moodSlider) {
        this.moodSlider = moodSlider;
    }

    
    
    
}

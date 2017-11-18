/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import java.util.List;
import java.util.Map;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author JonYa
 */
public class TabbedView {
    
    Map sceneMap;
    Stage primaryStage;
    List<Scene> sceneList;
    
    public TabbedView(Stage primaryStage, List<Scene> sceneList){
        this.primaryStage = primaryStage;
        this.sceneList = sceneList;
    }
    
    public ToolBar toolBar(){

        ToolBar toolBar = new ToolBar();

        Button button1 = new Button();
        button1.setFocusTraversable(false);
        button1.setText("Enter Food");
        button1.setOnAction(e -> {
            primaryStage.setScene(sceneList.get(0));
        });

        Button button2 = new Button();
        button2.setFocusTraversable(false);
        button2.setText("Food Stats");
        button2.setOnAction(e -> {
            primaryStage.setScene(sceneList.get(1));
        });

        Button button3 = new Button();
        button3.setFocusTraversable(false);
        button3.setText("Enter Mood");
        button3.setOnAction(e -> {
            primaryStage.setScene(sceneList.get(2));
        });

        Button button4 = new Button();
        button4.setFocusTraversable(false);
        button4.setText("Mood Stats");
        button4.setOnAction(e -> {
            primaryStage.setScene(sceneList.get(3));
        });

        Button button5 = new Button();
        button5.setFocusTraversable(false);
        button5.setText("Analysis");
        button5.setOnAction(e -> {
            primaryStage.setScene(sceneList.get(4));
        });

        Button button6 = new Button();
        button6.setFocusTraversable(false);
        button6.setText("Suggestions");
        button6.setOnAction(e -> {
            primaryStage.setScene(sceneList.get(5));
        });
                
        toolBar.getItems().addAll(button1, button2, button3, button5, button6);
        
        return toolBar;
        
    }
    
    
    
    
}

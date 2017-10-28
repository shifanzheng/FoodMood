/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import FoodView.EnterFoodView;
import FoodView.FoodStatsView;
import MoodView.EnterMoodView;
import MoodView.MoodStatsView;
import NutritionSuggestionView.SuggestionView;
import PersonalAnalysisView.MicroView;
import java.util.Iterator;
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
    
    public TabbedView(Map map){
        this.sceneMap = map;
    }
    
    
    
    public ToolBar toolBar(Stage primaryStage, EnterFoodView view1, FoodStatsView view2, EnterMoodView view3, MoodStatsView view4, MicroView view5, SuggestionView view6){

        ToolBar toolBar = new ToolBar();

        System.out.println(sceneMap.size() + " from tabbed view");
        
        
        Button button1 = new Button();
        button1.setText("Enter Food");
        button1.setOnAction(e -> primaryStage.setScene(view1.getScene()));
        
        Button button2 = new Button();
        button2.setText("Enter Food");
        button2.setOnAction(e -> primaryStage.setScene(view2.getScene()));
        
        Button button3 = new Button();
        button3.setText("Enter Food");
        button3.setOnAction(e -> primaryStage.setScene(view3.getScene()));
        
        Button button4 = new Button();
        button4.setText("Enter Food");
        button4.setOnAction(e -> primaryStage.setScene(view4.getScene()));
        
        Button button5 = new Button();
        button5.setText("Enter Food");
        button5.setOnAction(e -> primaryStage.setScene(view5.getScene()));
        
        Button button6 = new Button();
        button6.setText("Enter Food");
        button6.setOnAction(e -> primaryStage.setScene(view6.getScene()));
        
        
        
        //Label label = new Label("Hello");
        
        toolBar.getItems().addAll(button1, button2, button3, button4, button5, button6);
        
        return toolBar;
        
    }
    
    
    
    
}

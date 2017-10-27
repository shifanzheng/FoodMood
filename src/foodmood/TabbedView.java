/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import static foodmood.FoodMood.sceneMap;
import java.util.Iterator;
import java.util.Map;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author JonYa
 */
public class TabbedView {
    
    private Map sceneMap;
    
    public TabbedView(Map map){
        this.sceneMap = map;
    }
    
    public ToolBar toolBar(Stage primaryStage){

        ToolBar toolBar = new ToolBar();

        Iterator it = FoodMood.getSceneMap().entrySet().iterator();
        while (it.hasNext()) {

            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());

            Button button = new Button();
            button.setText((String) pair.getValue());
            button.setOnAction(e -> primaryStage.setScene((Scene) pair.getKey()));

            toolBar.getItems().add(button);

            //it.remove(); // avoids a ConcurrentModificationException

        }
        
        Label label = new Label("Hello");
        
        toolBar.getItems().add(label);
        
        return toolBar;
        
    }
    
    
    
    
}

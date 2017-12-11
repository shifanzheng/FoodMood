/*
 */
package FoodController;

import DataStorage.DeSerialization;
import DataStorage.GetTableData;
import DataStorage.Serialization;
import FoodModel.FoodModel;
import FoodView.EnterFoodView;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class EnterFoodController {

    private FoodModel model;
    private EnterFoodView view;


    /**
     * Default constructor for the EnterFoodController class
     * @param model
     * @param view
     */
    public EnterFoodController(FoodModel model, EnterFoodView view, Stage primaryStage) {
        
        this.model = model;
        this.view = view;
        
        //deserialization();
        setBehaviors();
        
    }
    
    public void setBehaviors(){
        //addFoodButton();
        submitButton();
    }

    public EnterFoodView getView(){
        return view;
    }
        
    public void setToolBar(ToolBar toolBar){
        view.setToolBar(toolBar);
    }
    
    public void deserialization(){
        
        try{
            DeSerialization de = new DeSerialization(model.getFoodList());
        }catch(Exception E){
            
        }
        
    }
    
    public void serialization(){
        
        try{
            //Serialization de = new Serialization(model.getFoodList());
        }catch(Exception E){
            
        }
        
    }
    
    public void submitButton(){
        
        view.getSubmitButton().setOnAction(e -> {
            
            model.setFoodName(view.getFoodNameText());
            model.setCalories(view.getCaloriesText());
            model.setProtein(view.getProteinText());
            model.setCarbs(view.getCarbsText());
            model.setFats(view.getFatsText());
            model.setMood((int)view.getMoodSlider().getValue());
            System.out.println("Mood Slider: " + (int)view.getMoodSlider().getValue());
            
            FoodDataType foodData = new FoodDataType(model.getFoodName(), model.getCalories(), 
                    model.getProtein(), model.getCarbs(), model.getFats(), model.getMood());
            
            System.out.println(model.getMood());
            
            //JASON - please serialize the "foodList" not the actual table.  It's much easier to work with.
            model.getFoodList().add(foodData);
            //model.getFoodList() <- that returns the foodList object
            
            view.getTable().getItems().add(foodData);
            
            //serialization();
            
            String name = view.getFoodNameText();
            int cal = view.getCaloriesText();
            int pro = view.getProteinText();
            int carb = view.getCarbsText();
            int fat = view.getFatsText();
            int mood = (int) view.getMoodSlider().getValue();
            GetTableData data = new GetTableData(name,cal,pro,carb,fat,mood);
            
            view.clearTextFields();
            
            
            //DeSerialization de = new DeSerialization(tableData);
            //tableData = de.returnTable(tableData);
           
        
            
            
            
            
            
            
            System.out.println(model.getFoodList().size());
            
        });
    }
    
    
    
}

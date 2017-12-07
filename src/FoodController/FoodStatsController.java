/*
 */
package FoodController;

import FoodModel.FoodModel;
import FoodView.FoodStatsView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class FoodStatsController {

    Stage primaryStage;
    private FoodModel model;
    private FoodStatsView view;

    /**
     * Default constructor for FoodStatsController class
     *
     * @param model
     * @param view
     */
    public FoodStatsController(FoodModel model, FoodStatsView view, Stage primaryStage) {
        this.primaryStage = new Stage();
        this.model = model;
        this.view = view;
        
        setBehavior();
    }
    
    public void setBehavior(){
        refreshButton();
    }
    
    public FoodStatsView getView(){
        return view;
    }
    
    public void setToolBar(ToolBar toolBar){
        view.setToolBar(toolBar);
    }
    
    public void refreshButton(){
        view.getRefreshButton().setOnAction(e -> {
            
            int totalCalories = 0;
            int totalProtein = 0;
            int totalCarbs = 0;
            int totalFat = 0;
             
            for(FoodDataType foodData : model.getFoodList()){
                totalCalories += foodData.getCalories();
                totalProtein += foodData.getProtein();
                totalCarbs += foodData.getCarbs();
                totalFat += foodData.getFat();
            }
         
            view.getLabel().setText(totalCalories + " Calories");
            
            ObservableList<PieChart.Data> pieChartDatapieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Protein", totalProtein * 100 / (totalProtein + totalCarbs + totalFat)),
                new PieChart.Data("Carbs", totalCarbs * 100 / (totalProtein + totalCarbs + totalFat)),
                new PieChart.Data("Fat", totalFat * 100 / (totalProtein + totalCarbs + totalFat)));
                    
            view.getChart().setData(pieChartDatapieChartData);
            
        });
    }
    
    
    
}

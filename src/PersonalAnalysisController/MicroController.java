/*
 */
package PersonalAnalysisController;

import FoodController.FoodDataType;
import FoodModel.FoodModel;
import PersonalAnalysisView.MicroView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import javafx.collections.FXCollections;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;

/**
 *
 * @author Shifan
 */
public class MicroController {

    private MicroView view;
    private FoodModel model;

    /**
     * Default constructor for MicroController class
     */
    public MicroController(FoodModel model, MicroView view, Stage primaryStage) {
        this.model = model;
        this.view = view;

        setButtonBehavior();
    }

    public MicroView getView() {
        return view;
    }

    public void setToolBar(ToolBar toolBar) {
        view.setToolBar(toolBar);
    }

    public void setButtonBehavior() {
        view.getAnalysisBt().setOnAction(e -> {
            
            macroAnalysis();
            view.getSbc().setVisible(true);
            
            int totalCalories = 0;
            int totalProtein = 0;
            int totalCarbs = 0;
            int totalFat = 0;

            for (FoodDataType foodData : model.getFoodList()) {
                totalCalories += foodData.getCalories();
                totalProtein += foodData.getProtein();
                totalCarbs += foodData.getCarbs();
                totalFat += foodData.getFat();
            }

            view.getAnalysisInfo().setText("You have consumsed a total of " + totalCalories + " calories, " + " " + totalProtein + " grams of protein,\n"
                    + " " + totalCarbs + " grams of carbohydrates, and " + totalFat + " grams of fat.");

            if (totalProtein > totalCarbs && totalProtein > totalFat) {
                view.getNutrientInfo().setText("Your favorite macronutrient is Protein");
            }
            if (totalCarbs > totalFat && totalCarbs > totalProtein) {
                view.getNutrientInfo().setText("Your favorite macronutrient is Carbohydrates");
            }
            if (totalFat > totalCarbs && totalFat > totalProtein) {
                view.getNutrientInfo().setText("Your favorite macronutrient is Fat");
            }
            if (totalProtein > totalCarbs && totalProtein == totalFat) {
                view.getNutrientInfo().setText("Your favorite macronutrient are Fat and Protein");
            }
            if (totalProtein == totalCarbs && totalProtein > totalFat) {
                view.getNutrientInfo().setText("Your favorite macronutrient are Protein and Carbohydrates");
            }
            if (totalFat == totalCarbs && totalCarbs > totalProtein) {
                view.getNutrientInfo().setText("Your favorite macronutrient are Fat and Carbohydrates");
            }
            if (totalProtein == totalCarbs && totalProtein == totalFat) {
                view.getNutrientInfo().setText("You like all of your nutrients equally!");
            }

        });
        
        
    }
    
    //loop through carbs
    
    public ArrayList<Integer> carbs (){
        
        ArrayList<Integer> carbList = new ArrayList<>();
        
        for(FoodDataType food : model.getFoodList()){
            carbList.add(food.getCarbs());
        }
        
        return carbList;
        
    }
    
    public ArrayList<Integer> proteins (){
        
        ArrayList<Integer> proteinList = new ArrayList<>();
        
        for(FoodDataType food : model.getFoodList()){
            proteinList.add(food.getProtein());
        }
        
        return proteinList;
        
    }
    
    public ArrayList<Integer> fats (){
        
        ArrayList<Integer> fatList = new ArrayList<>();
        
        for(FoodDataType food : model.getFoodList()){
            fatList.add(food.getFat());
        }
        
        return fatList;
        
    }
    //loop through protien
    //loop through fats
    
    public int analyzeRelationship (ArrayList<Integer> macro){
        
        int relationshipScore = 0;
        
        for(int i = 0; i < model.getFoodList().size(); i++){
            
            int mood = model.getFoodList().get(i).getMood();
            relationshipScore += macro.get(i) * mood;
            
        }
        
        System.out.println("MacroScore = " + relationshipScore);
        return relationshipScore;
        //arraylist of numbers
        //multiply macros and mood
        //add those to new temp object
        //add up and find row totals
        
        
    }
    
    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
    
    public void macroAnalysis(){
        
            double carbScore = this.analyzeRelationship(carbs());
            double proteinScore = this.analyzeRelationship(proteins());
            double fatScore = this.analyzeRelationship(fats());
            
            double total = carbScore + proteinScore + fatScore;
            
            double percentCarbs = round((carbScore / total) * 100, 1);
            double percentProteins = round((proteinScore / total) * 100, 1);
            double percentFats = round((fatScore / total) * 100, 1);
            
            
            
            findLargestNumbers(percentCarbs, percentFats, percentProteins);
            
            System.out.println(percentCarbs + " " + percentProteins + " " + percentFats);
            
            final String proteins = "Proteins";
            final String carbs = "Carbs";
            final String fats = "Fats";
            
            final CategoryAxis xAxis = new CategoryAxis();
            final NumberAxis yAxis = new NumberAxis();
            final XYChart.Series<String, Number> series1 =
                    new XYChart.Series<String, Number>();
            final XYChart.Series<String, Number> series2 =
                    new XYChart.Series<String, Number>();
            final XYChart.Series<String, Number> series3 =
                    new XYChart.Series<String, Number>();

            xAxis.setCategories(FXCollections.<String>observableArrayList(
                    Arrays.asList(proteins, carbs, fats)));
            yAxis.setLabel("Value");
            
            yAxis.setAutoRanging(false);
            xAxis.setAutoRanging(false);
            yAxis.setUpperBound(100);
            yAxis.setLowerBound(0);
            
            series1.getData().add(new XYChart.Data<String, Number>(proteins, percentCarbs));
            series2.getData().add(new XYChart.Data<String, Number>(carbs, percentProteins));
            series3.getData().add(new XYChart.Data<String, Number>(fats, percentFats));
            
            view.getSbc().getData().clear();
            view.getSbc().getData().addAll(series1, series2, series3);
            
    }
    
    public void findLargestNumbers(double percentCarbs, double percentFats, double percentProteins){
        
        percentCarbs = percentCarbs / 100;
        percentFats = percentFats / 100;
        percentProteins = percentProteins / 100;
        
        double foodHappinessArrayList = 0;
        
        if(percentCarbs >= percentFats && percentCarbs >= percentProteins){
            for(FoodDataType food : model.getFoodList()){
                double carbs = food.getCarbs() * percentCarbs;
                food.setFoodHappiness(carbs);
            }
        }else if(percentProteins >= percentFats && percentProteins >= percentCarbs){
            for(FoodDataType food : model.getFoodList()){
                double protein = food.getProtein() * percentProteins;
                food.setFoodHappiness(protein);
            }
        }else if(percentFats >= percentProteins && percentFats >= percentCarbs){
            for(FoodDataType food : model.getFoodList()){
                double fat = food.getFat() * percentFats;
                food.setFoodHappiness(fat);
            }
        }else{
            for(FoodDataType food : model.getFoodList()){
                double carbs = food.getCarbs() * percentCarbs;
                food.setFoodHappiness(carbs);
            }
        }
        
        Collections.sort(model.getFoodList(), Comparator.comparing(s -> s.getFoodHappiness()));
        
        String bestFoods = "Foods that improve your mood the most to least: ";
        
        for(int i = model.getFoodList().size() - 1; i >= 0; i--){
            System.out.println(model.getFoodList().get(i).getFoodName() + ", ");
            bestFoods += model.getFoodList().get(i).getFoodName() + ", ";
        }
        
        bestFoods = bestFoods.substring(0, bestFoods.length() - 2);
        view.getSuggestions().setText(bestFoods);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FoodController;

/**
 *
 * @author Jon
 */
public class FoodDataType {
    
    private final String foodName;
    private final int calories;
    private final int protein;
    private final int carbs;
    private final int fat;
    private final int mood;
    
    
    public FoodDataType(String foodName, int calories, int protein, int carbs, int fat, int mood) {
        this.foodName = foodName;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
        this.mood = mood;
    }
    
    public String getFoodName() {
        return foodName;
    }
    
    public int getCalories() {
        return calories;
    }
    
    public int getProtein() {
        return protein;
    }
    
    public int getCarbs() {
        return carbs;
    }
    
    public int getFat() {
        return fat;
    }
    
    public int getMood() {
        return mood;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodController;

/**
 *
 * @author Jason
 */
public class MoodDataType {
    private final String foodType;
    private final int mood;
    public MoodDataType(String food, int mood){
        this.foodType=food;
        this.mood = mood;
    }
    public String getFoodName(){
        return foodType;
    }
    public int getMood(){
        return mood;
    }
}

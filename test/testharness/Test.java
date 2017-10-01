/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testharness;
import FoodView.*;
import MoodView.*;
/**
 *
 * @author Jason
 */
public class Test {
    
    public static void main(String args[]){
       String food = new String("Chicken");
       String food2 = new String("");
       String food3 = new String("cafaf");
       String mood = new String("happy");
       String mood2 = new String("");
       String mood3 = new String("mamath");
       String nutrition[] = {"calories: 150", "fat: 3g", "sodium: 40g"};
       String nutrtion2[]={""};
       
       
       EnterFoodView view = new EnterFoodView();
       FoodStatsView stats = new FoodStatsView();
       EnterMoodView moodView = new EnterMoodView();
       MoodStatsView moodStats = new MoodStatsView();
       
       
        
    }        
}

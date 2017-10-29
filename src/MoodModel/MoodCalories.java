/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodModel;

/**
 *
 * @author Noel Sterling Jr
 */

import java.util.ArrayList;
import java.util.Iterator;


public class MoodCalories implements MoodIterator{
	
	// ArrayList holds objects
	
	ArrayList<MoodModel> moodFromCalories;
	
	public MoodCalories() {
		
		moodFromCalories = new ArrayList<MoodModel>();
		
		addMood("Burger", "Tired", 240);
		addMood("Brocolli", "Energetic", 60);
		addMood("Bacon", "Moody", 200);
		
	}
	
	// Add a moodFromCalories object object to the end of the ArrayList
	
	public void addMood(String foodName, String mood, int calories){
		
		MoodModel moodInfo = new MoodModel(foodName, mood, calories);
		
		moodFromCalories.add(moodInfo);
		
	}
	
	
	// Return the ArrayList filled with mood Objects
	
	public ArrayList<MoodModel> getCaloriesFromMood(){
            return null;
           
		
		
		
	}
        
       /* public ArrayList<MoodModel> getWorstCalories(){
            return null;
        
        
        }*/

	// By adding this method well be able to treat all collections the same
	public Iterator createIterator() {
		
		return moodFromCalories.iterator();
	}
	
}

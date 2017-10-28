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
	
	// ArrayList holds SongInfo objects
	
	ArrayList<MoodModel> moodFromCalories;
	
	public MoodCalories() {
		
		moodFromCalories = new ArrayList<MoodModel>();
		
		addMood("Burger", "Tired", 240);
		addMood("Brocolli", "Energetic", 60);
		addMood("Bacon", "Moody", 200);
		
	}
	
	// Add a SongInfo object to the end of the ArrayList
	
	public void addMood(String foodName, String mood, int calories){
		
		MoodModel moodInfo = new MoodModel(foodName, mood, calories);
		
		moodFromCalories.add(moodInfo);
		
	}
	
	
	// Get rid of this
	// Return the ArrayList filled with SongInfo Objects
	
	public ArrayList<MoodModel> getBestCalories(){
            return null;
           
		
		
		
	}
        
        public ArrayList<MoodModel> getWorstCalories(){
            return null;
        
        
        }

	// NEW By adding this method I'll be able to treat all
	// collections the same
	
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return moodFromCalories.iterator();
	}
	
}

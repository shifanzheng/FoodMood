/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodModel;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Noel Sterling Jr
 */
public class MoodFats implements MoodIterator{
    MoodModel[] fatsGrams;
	
	// Used to increment to the next position in the array
	
	int arrayValue = 0;
	
	public MoodFats() {
		
		fatsGrams = new MoodModel[3];
		
		addMood("Cheese Burger", "Tired", 300);
		addMood("Brocolli", "Energetic", 0);
		addMood("Bacon", "Moody", 250);
		
	}
	
	// Add a mood Object to the array and increment to the next position
	
	public void addMood(String foodName, String mood, int fats){
		
		MoodModel moodInfo = new MoodModel(foodName, mood, fats);
			
		fatsGrams[arrayValue] = moodInfo;
		
		arrayValue++;
		
	}
	
	// This is replaced by the Iterator
	
	public MoodModel[] getMoodFromFats(){
		
		return fatsGrams;
		
	}

	// NEW By adding this method I'll be able to treat all
	// collections the same
		
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(fatsGrams).iterator();	
	}
    
}

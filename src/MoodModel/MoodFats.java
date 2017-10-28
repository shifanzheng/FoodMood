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
    MoodModel[] bestSongs;
	
	// Used to increment to the next position in the array
	
	int arrayValue = 0;
	
	public MoodFats() {
		
		bestSongs = new MoodModel[3];
		
		addMood("Cheese Burger", "Tired", 300);
		addMood("Brocolli", "Energetic", 50);
		addMood("Bacon", "Moody", 205);
		
	}
	
	// Add a SongInfo Object to the array and increment to the next position
	
	public void addMood(String songName, String bandName, int yearReleased){
		
		MoodModel moodInfo = new MoodModel(songName, bandName, yearReleased);
			
		bestSongs[arrayValue] = moodInfo;
		
		arrayValue++;
		
	}
	
	// This is replaced by the Iterator
	
	public MoodModel[] getBestFats(){
		
		return bestSongs;
		
	}

	// NEW By adding this method I'll be able to treat all
	// collections the same
		
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(bestSongs).iterator();	
	}
    
}

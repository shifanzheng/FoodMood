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
import java.util.Hashtable;
import java.util.Iterator;

public class MoodSodium implements MoodIterator{
	
	// Create a Hashtable with an int as a key and SongInfo
	// Objects 
	
	Hashtable<Integer, MoodModel> moodFromSodium = new Hashtable<Integer, MoodModel>();
	
	// Will increment the Hashtable key
	
	int hashKey = 0;
	
	public MoodSodium() {
		
		addMood("Cheese Burger", "Tired", 300);
		addMood("Brocolli", "Energetic", 60);
		addMood("Bacon", "Moody", 200);
		
	}
	
	// Add a new SongInfo Object to the Hashtable and then increment
	// the Hashtable key
	
	public void addMood(String foodName, String mood, int calories){
		
		MoodModel moodInfo = new MoodModel(foodName, mood, calories);
		
		moodFromSodium.put(hashKey, moodInfo);
		
		hashKey++;
			
	}
	
	// This is replaced by the Iterator
	// Return a Hashtable full of SongInfo Objects
	
	public Hashtable<Integer, MoodModel> getBestSongs(){
		
		return moodFromSodium;
		
	}

	// NEW By adding this method I'll be able to treat all
	// collections the same
	
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return moodFromSodium.values().iterator();
	}
	
}

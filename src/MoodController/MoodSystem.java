/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodController;

/**
 *
 * @author Noel Sterling Jr
 */
import MoodModel.MoodIterator;
import MoodModel.MoodSodium;
import MoodModel.MoodFats;
import MoodModel.MoodCalories;
import MoodModel.MoodCalories;
import MoodModel.MoodFats;
import MoodModel.MoodIterator;
import MoodModel.MoodModel;
import MoodModel.MoodSodium;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class MoodSystem {
	
	MoodCalories calories;
	MoodSodium sodium;
	MoodFats fats;
	
	// NEW Passing in song iterators
	
	MoodIterator iterCalories;
	MoodIterator iterSodium;
	MoodIterator iterFats;
	
	// NEW WAY Initialize the iterators	
	
	public MoodSystem(MoodIterator newCalories, MoodIterator newSodium, MoodIterator newFats) {
		
		iterCalories = newCalories;
		iterSodium = newSodium;
		iterFats = newFats;
		
	}
	
	public void showTheSongs(){
		
		// Because the SongInfo Objects are stored in different
		// collections everything must be handled on an individual
		// basis. This is BAD!
		
		ArrayList aL70sSongs = calories.getBestCalories();
		
		System.out.println("Songs of the 70s\n");
		
		for(int i=0; i < aL70sSongs.size(); i++){
			
			MoodModel bestSongs = (MoodModel) aL70sSongs.get(i);
			
			System.out.println(bestSongs.getMood());
			System.out.println(bestSongs.getFood());
			System.out.println(bestSongs.getMoodEffect() + "\n");
			
		}
		
		MoodModel[] array80sSongs = fats.getBestFats();
		
		System.out.println("Songs of the 80s\n");
		
		for(int j=0; j < array80sSongs.length; j++){
			
			MoodModel bestSongs = array80sSongs[j];
			
			System.out.println(bestSongs.getMood());
			System.out.println(bestSongs.getFood());
			System.out.println(bestSongs.getMoodEffect() + "\n");
			
		}
		
		Hashtable<Integer, MoodModel> ht90sSongs = sodium.getBestSongs();
		
		System.out.println("Songs of the 90s\n");
		
		for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();)
	    {
			MoodModel bestSongs = ht90sSongs.get(e.nextElement());
			
			System.out.println(bestSongs.getFood());
			System.out.println(bestSongs.getMood());
			System.out.println(bestSongs.getMoodEffect() + "\n");
			
	    }
		
	}
	
	// Now that I can treat everything as an Iterator it cleans up
	// the code while allowing me to treat all collections as 1
	
	public void showTheSongs2(){
		
		System.out.println("NEW WAY WITH ITERATOR\n");
		
		Iterator Songs70s = iterCalories.createIterator();
		Iterator Songs80s = iterSodium.createIterator();
		Iterator Songs90s = iterFats.createIterator();
		
		System.out.println("Songs of the 70s\n");
		printTheSongs(Songs70s);
		
		System.out.println("Songs of the 80s\n");
		printTheSongs(Songs80s);
		
		System.out.println("Songs of the 90s\n");
		printTheSongs(Songs90s);
		
	}
	
	public void printTheSongs(Iterator iterator){
		
		while(iterator.hasNext()){
			
			MoodModel songInfo = (MoodModel) iterator.next();
			
			System.out.println(songInfo.getFood());
			System.out.println(songInfo.getMood());
			System.out.println(songInfo.getMoodEffect() + "\n");
			
		}
		
	}
	
}

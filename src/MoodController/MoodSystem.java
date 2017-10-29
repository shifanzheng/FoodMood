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
	
	// NEW Passing in mood iterators
	
	MoodIterator iterCalories;
	MoodIterator iterSodium;
	MoodIterator iterFats;
	
	//CONSTRUCTOR Initialize the iterators	
	
	public MoodSystem(MoodIterator newCalories, MoodIterator newSodium, MoodIterator newFats) {
		
		iterCalories = newCalories;
		iterSodium = newSodium;
		iterFats = newFats;
		
	}
	
	public void showMoods(){
		
		ArrayList caloriesList = calories.getCaloriesFromMood();
		
		System.out.println("Calories\n");
		
		for(int i=0; i < caloriesList.size(); i++){
			
			MoodModel moodInfo = (MoodModel) caloriesList.get(i);
			
			System.out.println(moodInfo.getMood());
			System.out.println(moodInfo.getFood());
			System.out.println(moodInfo.getMoodEffect() + "\n");
			
		}
		
		MoodModel[] fatsArray = fats.getMoodFromFats();
		
		System.out.println("Fats Percentage\n");
		
		for(int j=0; j < fatsArray.length; j++){
			
			MoodModel moodInfo = fatsArray[j];
			
			System.out.println(moodInfo.getMood());
			System.out.println(moodInfo.getFood());
			System.out.println(moodInfo.getMoodEffect() + "\n");
			
		}
		
		Hashtable<Integer, MoodModel> sodiumContent = sodium.getMoodFromSodium();
		
		System.out.println("Grams of Sodium \n");
		
		for (Enumeration<Integer> e = sodiumContent.keys(); e.hasMoreElements();)
	    {
			MoodModel moodInfo = sodiumContent.get(e.nextElement());
			
			System.out.println(moodInfo.getFood());
			System.out.println(moodInfo.getMood());
			System.out.println(moodInfo.getMoodEffect() + "\n");
			
	    }
		
	}
	
	// Now that I can treat everything as an Iterator it cleans up the code while allowing me to treat all collections the same
	public void showMood2(){
		
		System.out.println("Iterator Design Method\n");
		
		Iterator cal = iterCalories.createIterator();
		Iterator sod = iterSodium.createIterator();
		Iterator fats = iterFats.createIterator();
		
		System.out.println("Calories\n");
		printMood(cal);
		
		System.out.println("Grams of Sodium \n");
		printMood(sod);
		
		System.out.println("Fats Percentage\n");
		printMood(fats);
		
	}
	
	public void printMood(Iterator iterator){
		
		while(iterator.hasNext()){
			
			MoodModel moodInfo = (MoodModel) iterator.next();
			
			System.out.println(moodInfo.getFood());
			System.out.println(moodInfo.getMood());
			System.out.println(moodInfo.getMoodEffect() + "\n");
			
		}
		
	}
	
}

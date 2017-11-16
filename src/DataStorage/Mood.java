/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;

/**
 *
 * @author Jason
 */
public class Mood implements java.io.Serializable{
    
    public String food;
    public String mood;
    
    public Mood(String f, String m){
        this.food = f;
        this.mood = m;
    }
}

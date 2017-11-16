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
public class Food implements java.io.Serializable {
    
    public String food;
    public String macroN;
    public int cal;
    public int protein;
    public int fat;
    public int carb;
    
    public Food(String food, int cal,String m, int p, int fat, int carb){
        this.food = food;
        this.macroN = m;
        this. cal = cal;
        this. protein = p;
        this. fat = fat;
        this.carb = carb;
    }
}

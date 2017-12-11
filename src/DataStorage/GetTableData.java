/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;
import FoodController.*;
/**
 *
 * @author Jason
 */
public class GetTableData {
    String name;
    int cal;
    int pro;
    int fat;
    int carb;
    int mood;
    public GetTableData(String n, int cal, int p, int f, int car, int m){
        this.name = n;
        this.cal = cal;
        this.pro = p;
        this.fat = f;
        this.carb = car;
        this.mood = m;
        tableToArray(name,cal,pro,fat,carb,mood);
    }
    public void tableToArray(String n, int cal, int p, int f, int car, int m){
        Object[] tData = new Object[6];
        tData[0]= n;
        tData[1]=cal;
        tData[2]=p;
        tData[3]=f;
        tData[4]=car;
        tData[5]=m;
        //Serialization ser = new Serialization(tData);
        
    }
}

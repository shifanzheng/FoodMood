/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;
import java.io.*;
import javafx.scene.control.TableView;
/**
 *
 * @author Jason
 */
public class Serialization implements java.io.Serializable {
    public Serialization(String food, int calories, String macroN, int protein, int carbs, int fat) throws FileNotFoundException, IOException{
        Food f = new Food(food , calories , macroN , protein , carbs , fat);
        
        try{
            FileOutputStream fileout = new FileOutputStream("food.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(f);
            out.close();
            fileout.close();
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }
    public Serialization(String food, String mood) throws FileNotFoundException, IOException{
        Mood m = new Mood(food,mood);
        try{
            FileOutputStream fileout = new FileOutputStream("mood.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(m);

            out.close();
            fileout.close();
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }
    public Serialization(String user, String fName, String lName, String pass) throws FileNotFoundException, IOException{
        User u = new User(user,fName,lName,pass);
        try{
            FileOutputStream fileout = new FileOutputStream("user.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(u);
            out.close();
            fileout.close();
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }

    public Serialization(Object[] t){
        
        try{
            FileOutputStream fileout = new FileOutputStream("table.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(t);
            out.writeObject('\n');
            out.close();
            fileout.close();
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }
}

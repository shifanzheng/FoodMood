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
public class DeSerialization implements java.io.Serializable {
    public DeSerialization (String food, int calories, String macroN, int protein, int carbs, int fat) throws FileNotFoundException, IOException, ClassNotFoundException{
        Food f = null;
        try{
            FileInputStream fileIn = new FileInputStream("food.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            f = (Food) in.readObject();
            in.close();
            fileIn.close();
        }
        catch(IOException i){
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c){
            System.out.println("Food class not found");
            c.printStackTrace();
            return;
        }
    }
    public DeSerialization (String food, String mood) throws FileNotFoundException, IOException, ClassNotFoundException{
        Mood m = null;
        try{
            FileInputStream fileIn = new FileInputStream("mood.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            m = (Mood) in.readObject();
            in.close();
            fileIn.close();
        }
        catch(IOException i){
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c){
            System.out.println("Food class not found");
            c.printStackTrace();
            return;
        }
        
    }
    public DeSerialization (String user, String fName, String lName, String pass) throws FileNotFoundException, IOException, ClassNotFoundException{
        User u = null;
        try{
            FileInputStream fileIn = new FileInputStream("user.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            u = (User) in.readObject();
            in.close();
            fileIn.close();
        }
        catch(IOException i){
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c){
            System.out.println("Food class not found");
            c.printStackTrace();
            return;
        }
    }
    public DeSerialization(Object table){
        
        try{
            FileInputStream fileIn = new FileInputStream("table.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object[] t = (Object[]) in.readObject();
            in.close();
            fileIn.close();
        }
        catch(IOException i){
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c){
            System.out.println("Table class not found");
            c.printStackTrace();
            return;
        }
    }
    
}

package SerializationTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DataStorage.*;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author Jason
 */
public class SerializationTest {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        String Food = "Pizza";
        String Mood = "happy";
        String macroN = "vitamin a?";
        String User = "jim123";
        String name = "jim";
        String lname = "smith";
        String pass = "***";
        int protein = 4;
        int fat = 5;
        int cal = 1200;
        int carbs = 432;
        Serialization s = new Serialization(Food,Mood);
        DeSerialization ds = new DeSerialization(Food, Mood);
    }
}

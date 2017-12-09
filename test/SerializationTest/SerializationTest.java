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
        Object[] table = new Object[6];
        table[0]="pizza";
        table[1]=21;
        table[2]=3;
        table[3]=4;
        table[4]=5;
        table[5]=9;
 
        Serialization s = new Serialization(table);
        DeSerialization ds = new DeSerialization(table);
    }
}

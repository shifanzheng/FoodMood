/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodDB;
import java.sql.*;


/**
 *
 * @author Jason
 */
// This doesn't work but I don't want to delete it in case I decide to work on
// it again sometime
public class DBConnection {
    
    public DBConnection(String food,int cal, String macroN, int protein, int fat, int carbs) throws SQLException, ClassNotFoundException{
        //create connection
        try{
            String myDriver = "apache_derby_net";
            String myUrl = "jdbc:derby://localhost:1527/FoodMood";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"group8","ist412");
            Statement s = conn.createStatement();
            //insert into table
            s.executeUpdate("insert into FOODS (FOODTYPE, CALORIES, MACRONUTRIENTS, PROTEIN, FAT, CARBS) " + 
                    "values( " + food + " , " + cal + " , " + macroN + " , " + protein + " , " + fat + " , " + carbs + " )");
            conn.close();
        }
        catch (Exception e){
            System.err.println("error");
            System.err.println(e.getMessage());
        }
    }
    public DBConnection(String food, String mood) throws SQLException, ClassNotFoundException{
        //create connection
        try{
            
            String myUrl = "jdbc:derby://localhost:1527/FoodMood";
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection conn = DriverManager.getConnection(myUrl,"group8","ist412");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO MOODS VALUES (?,?)");
            ps.setString(1, food);
            ps.setString(2, mood);
            ps.executeUpdate();
            conn.close();
        }
        catch (Exception e){
            System.err.println("error");
            System.err.println(e.getMessage());
        }
        
    }
    public DBConnection(String username,String password, String fName, String lName, int age, int weight) throws SQLException, ClassNotFoundException{
        //create connection
        try{
            String myDriver = "apache_derby_net";
            String myUrl = "jdbc:derby://localhost:1527/FoodMood";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"group8","ist412");
            Statement s = conn.createStatement();
            //insert into table
            s.executeUpdate("insert into USERINFO (USERNAME, PASSWORD, FIRSTNAME, LASTNAME, AGE, WEIGHT) " + "values( "
                    + username + " , " + password + " , " + fName + " , " + lName + " , " + age + " , " + weight + " )");
            conn.close();
        }
        catch (Exception e){
            System.err.println("error");
            System.err.println(e.getMessage());
        }
    } 

    
}
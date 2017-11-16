/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBTest;
import FoodMoodDB.*;
import java.sql.SQLException;
/**
 *
 * @author Jason
 */
public class DBTest {
    public static void main(String [] args) throws SQLException, ClassNotFoundException{
        String f = "pizza";
        String m = "happy";
        DBConnection db = new DBConnection(f,m);
    }
}

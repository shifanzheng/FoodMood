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
public class User implements java.io.Serializable {
    public String user;
    public String fName;
    public String lName;
    public String pass;
    
    public User(String u, String f, String l, String p){
        this.user = u;
        this.fName = f;
        this.lName = l;
        this.pass = p;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;

import javafx.scene.control.TableView;

/**
 *
 * @author Jason
 */
public class Table implements java.io.Serializable{
    TableView table;
    public Table(TableView table){
        this.table = table;
    }
}

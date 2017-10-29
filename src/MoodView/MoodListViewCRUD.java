/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodview;

/**
 *
 * @author nsterling76
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class MoodListViewCRUD {
    
    public MoodListViewCRUD(){
        
        // create JFrame and JTable
        JFrame frame = new JFrame();
        JTable table = new JTable(); 
        Object[] columns = {"Mood","Food","Calories","Sodium","Fats"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
        
        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,16);
        table.setFont(font);
        table.setRowHeight(30);
        
        JTextField mood = new JTextField();
        JTextField food = new JTextField();
        JTextField calories = new JTextField();
        JTextField sodium = new JTextField();
        JTextField fats = new JTextField();
        
        
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");  
        JButton back = new JButton("Back");
        
        JLabel moodLabel = new JLabel("Enter Your Mood");
        JLabel foodLabel = new JLabel("Enter Your Food");
        JLabel calLabel = new JLabel("Enter the amount of Calories");
        JLabel sodLabel = new JLabel("Enter amount sodium content");
        JLabel fatsLabel = new JLabel("Enter the amount of Fats");
        
        mood.setBounds(120, 220, 100, 25);
        food.setBounds(120, 250, 100, 25);
        calories.setBounds(120, 280, 100, 25);
        sodium.setBounds(120, 310, 100, 25);
        fats.setBounds(120, 340, 100, 25);
        
        btnAdd.setBounds(260, 220, 100, 25);
        btnUpdate.setBounds(260, 265, 100, 25);
        btnDelete.setBounds(260, 310, 100, 25);
        back.setBounds(260, 350, 100, 25);
        
        moodLabel.setBounds(15, 220, 105, 25);
        foodLabel.setBounds(15, 250, 105, 25);
        calLabel.setBounds(15, 280, 105, 25);
        sodLabel.setBounds(15, 310, 105, 25);
        fatsLabel.setBounds(15, 380, 300, 25);
        
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        frame.add(mood);
        frame.add(food);
        frame.add(calories);
        frame.add(sodium);
    
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(back);
        
        frame.add(moodLabel);
        frame.add(foodLabel);
        frame.add(calLabel);
        frame.add(sodLabel);
        frame.add(fatsLabel);
        
        // create an array of objects to set the row data
        Object[] row = new Object[5];
        
        // button add row
        btnAdd.addActionListener(new ActionListener(){
            BufferedReader br;
            @Override
            
            public void actionPerformed(ActionEvent e) {

                row[0] = mood.getText();
                row[1] = food.getText();
                row[2] = calories.getText();
                row[3] = sodium.getText();
                row[4] = fats.getText();
                
                // add row to the model
                model.addRow(row);
                
                for(int row = 0; row < table.getRowCount(); row++) {

                    for(int column = 0; column < table.getColumnCount(); column++) {
            System.out.println(table.getColumnName(column) + ": ");
            System.out.println(table.getValueAt(row, column));
        }
        System.out.println(""); // Add line space
    }
                
            }
        });
        
        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        
        back.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent ae) {
                JButton eventSource = (JButton) ae.getSource();

                if (eventSource == back) {
                    frame.dispose();
                }
            }
        
        });
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            
            mood.setText(model.getValueAt(i, 0).toString());
            food.setText(model.getValueAt(i, 1).toString());
            calories.setText(model.getValueAt(i, 2).toString());
            sodium.setText(model.getValueAt(i, 3).toString());
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(mood.getText(), i, 0);
                   model.setValueAt(food.getText(), i, 1);
                   model.setValueAt(calories.getText(), i, 2);
                   model.setValueAt(sodium.getText(), i, 3);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        
        frame.setSize(900,450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}



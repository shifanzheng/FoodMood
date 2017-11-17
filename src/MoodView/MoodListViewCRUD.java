/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodview;

import MoodModel.MoodModel;
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
import java.sql.Timestamp;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Noel Sterling Jr
 */
public class MoodListViewCRUD {
    
    private JTable table ; 
    private Object[] columns;
    private DefaultTableModel model;
    private JTextField mood;
    private JSlider updateIntensity;
    private JButton btnAdd,btnDelete,btnUpdate,btnNext;
    private JLabel moodLabel, foodLabel;
    private Object[] row;
    private Timestamp timestamp;
    public MoodListViewCRUD(){
        
        // create JFrame and JTable
        MoodModel mod = new MoodModel();
        JFrame frame = new JFrame();
        table = new JTable();
        columns = new Object []{"Mood","Mood Intensity","Timestamp"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        timestamp = new Timestamp(System.currentTimeMillis());
        
        // set the model to the table
        table.setModel(model);
        
        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,16);
        table.setFont(font);
        table.setRowHeight(30);
        
        mood = new JTextField();
        updateIntensity = new JSlider();
        updateIntensity = new JSlider(JSlider.HORIZONTAL, 1,10,1);
        updateIntensity.setMajorTickSpacing(1);
        updateIntensity.setPaintTicks(true);
        updateIntensity.setPaintLabels(true);

        
        
        btnAdd = new JButton("Add More Moods");
        btnDelete = new JButton("Delete");
        btnUpdate = new JButton("Update");  
        btnNext = new JButton("Next Steps");
        
        moodLabel = new JLabel("Enter More Moods");
        foodLabel = new JLabel("Update your Intensity from 1 - 10");
        
        mood.setBounds(120, 220, 100, 25);
        updateIntensity.setBounds(120, 250, 100, 25);
        
        btnAdd.setBounds(260, 220, 100, 25);
        btnUpdate.setBounds(260, 265, 100, 25);
        btnDelete.setBounds(260, 310, 100, 25);
        btnNext.setBounds(260, 350, 100, 25);
        
        moodLabel.setBounds(15, 220, 105, 25);
        foodLabel.setBounds(15, 250, 105, 25);
        
        JScrollPane pane = new JScrollPane(getTable());
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        frame.add(mood);
        frame.add(updateIntensity);

    
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnNext);
        
        frame.add(moodLabel);
        frame.add(foodLabel);
        
        // create an array of objects to set the row data
        row = new Object[2];
        
        frame.setSize(900,450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        btnAdd.addActionListener(new ActionListener(){
            BufferedReader br;
            @Override
            
            public void actionPerformed(ActionEvent e) {

                row[0] = mood.getText();
                row[1] = updateIntensity.getValue();
                row[2] = timestamp;

                
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
        
        btnNext.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent ae) {
                JButton eventSource = (JButton) ae.getSource();

                if (eventSource == btnNext) {
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
            updateIntensity.setValue((int) model.getValueAt(i, 1));

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
                   model.setValueAt(updateIntensity.getValue(), i, 1);

                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
}
    
    
    /**
     * @return the table
     */
    public JTable getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(JTable table) {
        this.table = table;
    }

    /**
     * @return the columns
     */
    public Object[] getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(Object[] columns) {
        this.columns = columns;
    }

    /**
     * @return the model
     */
    public DefaultTableModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    /**
     * @return the mood
     */
    public JTextField getMood() {
        return mood;
    }

    /**
     * @param mood the mood to set
     */
    public void setMood(JTextField mood) {
        this.mood = mood;
    }

    /**
     * @return the btnAdd
     */
    public JButton getBtnAdd() {
        return btnAdd;
    }

    /**
     * @param btnAdd the btnAdd to set
     */
    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    /**
     * @return the btnDelete
     */
    public JButton getBtnDelete() {
        return btnDelete;
    }

    /**
     * @param btnDelete the btnDelete to set
     */
    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    /**
     * @return the btnUpdate
     */
    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    /**
     * @param btnUpdate the btnUpdate to set
     */
    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    /**
     * @return the btnNext
     */
    public JButton getBtnNext() {
        return btnNext;
    }

    /**
     * @param btnNext the btnNext to set
     */
    public void setBtnNext(JButton btnNext) {
        this.btnNext = btnNext;
    }

    /**
     * @return the row
     */
    public Object[] getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(Object[] row) {
        this.row = row;
    }

    public void addButtonListener(ActionListener al) { 
    
        getBtnAdd().addActionListener(al);
        getBtnUpdate().addActionListener(al);
        getBtnDelete().addActionListener(al);
        getBtnNext().addActionListener(al);
    }
    
    
    
}

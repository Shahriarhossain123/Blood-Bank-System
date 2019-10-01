/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blood.controller;

import java.sql.*;
import com.blood.view.Login;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.util.Properties;
import javax.swing.UIManager;

/**
 *
 * @author shahr
 */
public class DBConnection {
    
    Statement st;
    ResultSet rs;
    Connection con;
    String url;
    
    public DBConnection() {
        
        new Login().setVisible(true);
        
        try {
            url = "jdbc:ucanaccess://blood.mdb";
            con = DriverManager.getConnection(url);
            System.out.println("Database Ok");
            
        } catch (Exception e) {
            System.out.println("Could Not Connect to Database" + e);
        }
        
        try {
            rs.next();
        } catch (Exception e) { 
        }
    }
    
    public static void LookAndFeel() {
        
        Properties props = new Properties();
        props.put("logoString", "");
        GraphiteLookAndFeel.setCurrentTheme(props);
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        LookAndFeel();
        DBConnection dbConnection = new DBConnection();
    }
}

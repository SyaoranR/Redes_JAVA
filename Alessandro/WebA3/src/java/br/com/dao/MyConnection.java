/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Labredes
 */
public class MyConnection {
    //private String url = "jdbc:postgresql://127.0.0.1:5432/a3db";
    private String url = "jdbc:postgresql://172.16.0.147:5432/a3db";
    private String driver = "org.postgresql.Driver";
    private String user = "postgres";
    private String password = "postgres";
    protected Connection con;
    
    /* teste de conexao
    public static void main(String[] args) {
        MyConnection my = new MyConnection();
        my.openConnection();
    }
    */
   
   
    protected void openConnection() {
        try{
            Scanner read = new Scanner(url);
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "conectado");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    protected void closeConnection() {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        
    
    
    
}

package uas.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
public class Koneksi {

    private Connection connect;
    
    private String driverName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/tb_crud";
    private String username = "root";
    private String password = "";
    
    public Connection getKoneksi (){
        
        if(connect == null){
            try {
             Class.forName(driverName);
             System.out.println("Class driver ditemukan");
             
             connect = DriverManager.getConnection (url, username, password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
            
          return connect;  
    }
       
    }   


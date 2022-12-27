/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginform;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    
    public static Connection getConnection(){
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/java_application","root","");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
          
        }
        return connection;
    }
    
    
    
    
        
   
    
}

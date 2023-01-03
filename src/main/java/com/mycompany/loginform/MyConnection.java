/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MyConnection {

    private static Connection connection;

    
    
    
    
    private static ArrayList<Medicament> snapshot=new ArrayList<Medicament>();
    private static ArrayList<Medicament> medicaments=new ArrayList<Medicament>();

    public static Connection getConnection() {
        
        if(connection==null){
            try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/java_application","root","");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
          
        } }
        return connection;
    }

    public static ArrayList<Medicament> getMedicaments() { 
        return medicaments;
    }

    public static ArrayList<Medicament> getSnapshot() {
        return snapshot;
    }
    

    public static void setMedicaments(ArrayList<Medicament> medicaments) {
        MyConnection.medicaments = medicaments;
    }
    
    public static ArrayList<Medicament> databaseSnapshot(){
        snapshot.clear();
        PreparedStatement ps;
        ResultSet rs;
        String query ="SELECT * FROM `medicament`";
        
    
        try {
                ps = MyConnection.getConnection().prepareStatement(query);
                
                
                rs = ps.executeQuery();
                
                
                
                while (rs.next()) {
                    Medicament medicament = new Medicament(rs.getString("NAME"), Integer.parseInt(rs.getString("QUANTITE")), Double.parseDouble(rs.getString("PRIX")));
                    snapshot.add(medicament);   
                }    
             }catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            } 
        return snapshot;
    }
    
    public static ArrayList<Medicament> searchInData(String medicamentName,ArrayList<Medicament> medis){
        medicaments.clear();
        
       
       for(Medicament medicament : medis){
           if(medicament.getName().contains(medicamentName)){
               medicaments.add(medicament);
           }
           
       }
        
        return medicaments; 
    }
    

    
    
    
    
    
    
        
   
    
}

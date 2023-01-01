/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginform;

import java.util.ArrayList;
import java.util.Objects;


public class Medicament {
    private String name;
    private int quantite;
    private double prix;

    
    public Medicament() {
    }

    public Medicament(String name, int quantite, double prix) {
        this.name = name;
        this.quantite = quantite;
        this.prix = prix;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
    public static Medicament getMedicamentFromData(ArrayList<Medicament> medis,String medicamentName){
        Medicament medicament=null;
        
        for(Medicament medic : medis){
           if(medic.getName().equals(medicamentName)){
               medicament=medic;
           }
           
       }
        return medicament;
        
    }
    
    public static ArrayList<Medicament> updateQuantite(ArrayList<Medicament> medis,String medicamentName,int quantite){
        
        for(Medicament medic : medis){
           if(medic.getName().equals(medicamentName)){
               int medicQuant=medic.getQuantite();
               if(quantite<=medicQuant){
                   medic.setQuantite(medicQuant-quantite);
               }
               else{
                   
               }
               
               
           }
           
       }
        return medis;
        
    }
    
    
    
    
}

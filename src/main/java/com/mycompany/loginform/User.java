/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginform;

import java.util.ArrayList;


public class User extends Personne{
    
    private ArrayList<Medicament> panier;

    public User(ArrayList<Medicament> panier) {
        this.panier = panier;
    }

    public User(ArrayList<Medicament> panier, String name, String password, int Id, String email, String Cin) {
        super(name, password, Id, email, Cin);
        this.panier = panier;
    }

    public User() {
        this.panier=new ArrayList<Medicament>();
    }

    public ArrayList<Medicament> getPanier() {
        return panier;
    }

    public void setPanier(ArrayList<Medicament> panier) {
        this.panier = panier;
    }
    
    public void ajouterMedicamentAuPanier(Medicament medicament){
        boolean ifnotexiste=true;
        
        for(Medicament med : panier){
            if(medicament.getName().equals(med.getName())){
                med.setQuantite(med.getQuantite()+medicament.getQuantite());
               ifnotexiste=false;
               break;
            }
        }
        if(ifnotexiste) {
            this.panier.add(medicament);

        }
    }
    
    public void suprimerPanierElement(String MedicName){
        ArrayList<Medicament> panierClone=(ArrayList < Medicament >)panier.clone();
        for(Medicament medicament : panierClone){
           if(medicament.getName().equals(MedicName)){
               this.panier.remove(medicament);    
           }  
       }
        
        
    }


    
    
    
    
}

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
        this.panier.add(medicament);
    }


    
    
    
    
}

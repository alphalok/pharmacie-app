/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginform;

/**
 *
 * @author elhou
 */
public abstract class Personne {
    
    private String name;
    private String password;
    private int Id;
    private String email;
    private String Cin;
    

    
    public Personne() {
    }

    public Personne(String name, String password, int Id, String email, String Cin) {
        this.name = name;
        this.password = password;
        this.Id = Id;
        this.email = email;
        this.Cin = Cin;
    }
    
    

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCin() {
        return Cin;
    }

    public void setCin(String Cin) {
        this.Cin = Cin;
    }
    
    
    
    
    
    
}

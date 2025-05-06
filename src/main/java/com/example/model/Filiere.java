package com.example.model;

public class Filiere {
    private int id;
    private String nom;
    private int departementId; // Clé étrangère

    // Constructeurs
    public Filiere() {}
    
    public Filiere(String nom, int departementId) {
        this.nom = nom;
        this.departementId = departementId;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    
    public int getDepartementId() { return departementId; }
    public void setDepartementId(int departementId) { this.departementId = departementId;
    }
}
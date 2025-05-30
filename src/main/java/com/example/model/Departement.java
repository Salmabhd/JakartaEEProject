package com.example.model;

public class Departement {
    private int id;
    private String nom;

    // Constructeurs
    public Departement() {}
    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
}

package com.example.dao;

import com.example.model.Salle;
import java.sql.*;
import java.util.*;

public class SalleDAO {
    // Assure-toi que l'URL de connexion à la base de données est correcte
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "root"; // Mets le mot de passe de ta base ici si nécessaire


   public List<Salle> getAll() {
    List<Salle> liste = new ArrayList<>();
    try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM salle")) {

        while (rs.next()) {
            Salle s = new Salle();
            s.setId(rs.getInt("id"));
            s.setNumeroSalle(rs.getString("numero_salle"));
            s.setCapacite(rs.getInt("capacite"));
            System.out.println("Salle récupérée : " + s.getNumeroSalle()); // Ajoute un log pour vérifier
            liste.add(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return liste;
}

}

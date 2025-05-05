package com.example.dao;
import com.example.model.Enseignant;
import java.sql.*;
import java.util.*;

public class EnseignantDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "";


    public List<Enseignant> getAll() {
        List<Enseignant> liste = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM enseignant")) {
            while (rs.next()) {
                Enseignant e = new Enseignant();
                e.setId(rs.getInt("id"));
                e.setNom(rs.getString("nom"));
                e.setPrenom(rs.getString("prenom"));
                e.setEmail(rs.getString("email"));
                e.setIdDepartement(rs.getInt("id_departement"));
                liste.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}


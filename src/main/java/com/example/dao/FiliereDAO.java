package com.example.dao;

import com.example.model.Filiere;
import java.sql.*;
import java.util.*;

public class FiliereDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false";
    private String jdbcUser = "root";
    private String jdbcPassword = "root";

    public List<Filiere> getAll() {
        List<Filiere> filieres = new ArrayList<>();
        
        String sql = "SELECT f.id, f.nom, d.nom AS departement_nom " +
                     "FROM filiere f LEFT JOIN departement d ON f.departement_id = d.id";
        
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Filiere f = new Filiere();
                f.setId(rs.getInt("id"));
                f.setNom(rs.getString("nom"));
                f.setDepartementId(rs.getInt("departement_id"));
                filieres.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filieres;}
}
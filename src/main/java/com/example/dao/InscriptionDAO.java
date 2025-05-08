package com.example.dao;

import com.example.model.Inscription;

import java.sql.*;
import java.util.*;

public class InscriptionDAO {
private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false";
private String jdbcUser = "root";
private String jdbcPassword = "root";


public List<Inscription> getAll() {
    List<Inscription> inscriptions = new ArrayList<>();
    String sql = "SELECT * FROM inscription";

    try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            Inscription i = new Inscription();
            i.setId(rs.getInt("id"));
            i.setIdEtudiant(rs.getInt("id_etudiant"));
            i.setIdMatiere(rs.getInt("id_matiere"));
            i.setDateInscription(rs.getDate("date_inscription"));
            inscriptions.add(i);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return inscriptions;
}
}
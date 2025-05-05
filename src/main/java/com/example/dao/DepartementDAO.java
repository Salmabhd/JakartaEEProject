package com.example.dao;

import com.example.model.Departement;
import java.sql.*;
import java.util.*;

public class DepartementDAO {
    private String jdbcURL = "jdbc:mysql://mysql:3306/etudiants_db?useSSL=false&allowPublicKeyRetrieval=true";
    private String jdbcUser = "root";
    private String jdbcPassword = "";

    public List<Departement> getAll() {
        List<Departement> liste = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM departement")) {
            while (rs.next()) {
                Departement d = new Departement();
                d.setId(rs.getInt("id"));
                d.setNom(rs.getString("nom"));
                liste.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}

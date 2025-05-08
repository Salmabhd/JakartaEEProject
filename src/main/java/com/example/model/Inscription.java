package com.example.model;
import java.sql.Date;

public class Inscription {
private int id;
private int idEtudiant;
private int idMatiere;
private Date dateInscription;


public int getId() { return id; }
public void setId(int id) { this.id = id; }

public int getIdEtudiant() { return idEtudiant; }
public void setIdEtudiant(int idEtudiant) { this.idEtudiant = idEtudiant; }

public int getIdMatiere() { return idMatiere; }
public void setIdMatiere(int idMatiere) { this.idMatiere = idMatiere; }

public Date getDateInscription() { return dateInscription; }
public void setDateInscription(Date dateInscription) { this.dateInscription = dateInscription; }}
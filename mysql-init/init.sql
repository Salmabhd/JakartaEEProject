CREATE DATABASE IF NOT EXISTS etudiants_db;

USE etudiants_db;

CREATE TABLE etudiant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    email VARCHAR(100));

INSERT INTO etudiant (nom, prenom, email) VALUES
('Daaif', 'Achraf', 'ad@univ.ma'),
('Marimi', 'Jamila', 'jam@univ.ma'),
('Bodan', 'Lahcen', 'luc@univ.ma');

-- Table : Departement
CREATE TABLE IF NOT EXISTS departement (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL
);

-- Table : Filiere
CREATE TABLE IF NOT EXISTS filiere (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    id_departement INT,
    FOREIGN KEY (id_departement) REFERENCES departement(id)
);

-- Table : Enseignant
CREATE TABLE IF NOT EXISTS enseignant (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50),
    prenom VARCHAR(50),
    email VARCHAR(100),
    id_departement INT,
    FOREIGN KEY (id_departement) REFERENCES departement(id)
);

-- Table : Matiere
CREATE TABLE IF NOT EXISTS matiere (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    id_enseignant INT,
    id_filiere INT,
    FOREIGN KEY (id_enseignant) REFERENCES enseignant(id),
    FOREIGN KEY (id_filiere) REFERENCES filiere(id)
);

-- Ajout de la colonne id_filiere à la table existante etudiant
ALTER TABLE etudiant ADD COLUMN id_filiere INT;
ALTER TABLE etudiant ADD FOREIGN KEY (id_filiere) REFERENCES filiere(id);

-- Table supplémentaire : Inscription
CREATE TABLE IF NOT EXISTS inscription (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_etudiant INT,
    id_matiere INT,
    date_inscription DATE,
    FOREIGN KEY (id_etudiant) REFERENCES etudiant(id),
    FOREIGN KEY (id_matiere) REFERENCES matiere(id)
);
-- Création de la table salle
CREATE TABLE IF NOT EXISTS salle (
    id INT PRIMARY KEY AUTO_INCREMENT,
    numero_salle VARCHAR(20),
    capacite INT
);

-- Insertion des données dans la table salle
INSERT INTO salle (numero_salle, capacite) VALUES
('A101', 30),
('B202', 50),
('C303', 40);
-- Insertion de données de base
INSERT INTO departement (nom) VALUES ('Informatique'), ('Mathématiques');

INSERT INTO filiere (nom, id_departement) VALUES
('Génie Logiciel', 1),
('Data Science', 1);

INSERT INTO enseignant (nom, prenom, email, id_departement) VALUES
('El Amrani', 'Karim', 'karim@univ.ma', 1),
('Zahraoui', 'Nora', 'nora@univ.ma', 1);

INSERT INTO matiere (nom, id_enseignant, id_filiere) VALUES
('Java Avancé', 1, 1),
('Machine Learning', 2, 2);

-- Mise à jour des étudiants existants pour ajouter la filière
UPDATE etudiant SET id_filiere = 1 WHERE nom = 'Daaif';
UPDATE etudiant SET id_filiere = 2 WHERE nom = 'Marimi';
UPDATE etudiant SET id_filiere = 1 WHERE nom = 'Bodan';

-- Inscriptions
INSERT INTO inscription (id_etudiant, id_matiere, date_inscription) VALUES
(1, 1, '2025-04-01'),
(2, 2, '2025-05-02');

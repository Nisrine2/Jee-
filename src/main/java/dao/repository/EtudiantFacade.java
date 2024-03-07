package dao.repository;

import dao.entities.Etudiant;

import java.util.List;

public interface EtudiantFacade {
    public Etudiant addEtudiant(Etudiant e);
    public List<Etudiant> getAllEtudiants();
    public Etudiant getEtudiantByEmail(String email);
}

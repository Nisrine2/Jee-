package metier;

import dao.entities.Etudiant;

import java.util.List;

public interface EtudiantManagerFacade {
    public Etudiant addEtudiant(Etudiant etudiant);
    public List<Etudiant> getAllEtudiants();
}

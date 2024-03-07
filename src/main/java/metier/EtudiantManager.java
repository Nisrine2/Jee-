package metier;

import dao.entities.Etudiant;
import dao.repository.EtudiantDAO;

import java.util.List;

public class EtudiantManager implements EtudiantManagerFacade{
    public EtudiantDAO etudiantdao;
    public EtudiantManager(EtudiantDAO etudiantdao)
    {
        this.etudiantdao = etudiantdao;
    }
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        if (etudiantdao.getEtudiantByEmail(etudiant.getEmail()) == null){
            etudiantdao.addEtudiant(etudiant);
        return etudiant;
    }
    else{
            System.out.println("L'etudiant existe deja");
            return null;
        }
    }
    @Override
    public List<Etudiant> getAllEtudiants()
    {
        return etudiantdao.getAllEtudiants();
    }
}

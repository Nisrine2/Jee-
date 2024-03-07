package dao.repository;
import dao.entities.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO  implements EtudiantFacade{
    private List<Etudiant> etudiants = new ArrayList<>();
    @Override
    public Etudiant addEtudiant(Etudiant e)
    {
        for(Etudiant etd : etudiants)
        {
            if(etd.equals(e))
                return null;
        }
        etudiants.add(e);
        return e;
    }
    @Override
    public Etudiant getEtudiantByEmail(String email)
    {
        for(Etudiant etd : etudiants)
        {
            if(etd.getEmail().equals(email))
                return etd;
        }
        return null;
    }
    @Override
    public List<Etudiant> getAllEtudiants()
    {
        return etudiants;
    }
}

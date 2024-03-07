package presentation;

import dao.entities.Etudiant;
import dao.repository.EtudiantDAO;
import metier.EtudiantManager;
import metier.EtudiantManagerFacade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EtudiantDAO etudiantdao =  new EtudiantDAO();
       EtudiantManager etudiants = new EtudiantManager(etudiantdao);
       Etudiant e1 = new Etudiant("FM01","EL KIHEL","Fati",  "fatimazehraelkihel@gmail.com");
       Etudiant e2 = new Etudiant("FM02","SAMRANI","Nisrine","fatimazehraelkihel@gmail.com");
       Etudiant e3 = new Etudiant("FM02","SAMRANI","Nisrine","Samraninisrine2002@gmail.com");
       etudiants.addEtudiant(e1);
       etudiants.addEtudiant(e2);
       etudiants.addEtudiant(e3);
        System.out.println(etudiants.getAllEtudiants());
    }
}

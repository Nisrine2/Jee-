package dao.entities;

import dao.repository.EtudiantFacade;

import java.util.Objects;

public class Etudiant{
    private String id;
    private String name;
    private String prenom;
    private String email;

    public Etudiant(String id,String nom,String prenom, String email)
    {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail()
    {
        return email;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(id, etudiant.id) && Objects.equals(name, etudiant.name) && Objects.equals(prenom, etudiant.prenom) && Objects.equals(email, etudiant.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, prenom, email);
    }
}

package ecole;

public class Enseignant extends User {
    private final String specialite;

    public Enseignant(int id, String nom, String prenom, String dateNaissance, String email, String telephone, String specialite) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.specialite = specialite;
    }
}
package ecole;

public class User {
    private final int id;
    private final String nom;
    private final String prenom;
    private final String dateNaissance;
    private final String email;
    private final String telephone;

    public User(int id, String nom, String prenom, String dateNaissance, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
    }
}

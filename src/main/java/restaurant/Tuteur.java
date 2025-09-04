package restaurant;

public class Tuteur extends User {
  private final String description;

    public Tuteur(int id, String nom, String dateNaissance, String email, String telephone, String description) {
        super(id, nom, dateNaissance, email, telephone);
        this.description = description;
    }
}
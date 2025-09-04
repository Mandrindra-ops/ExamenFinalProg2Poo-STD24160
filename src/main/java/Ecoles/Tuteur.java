package ecole;

public class Tuteur extends User {
  private final String description;

    public Tuteur(int id, String nom, String dateNaissance, String email, String telephone, String description) {
        super(id, nom, dateNaissance, email, telephone);
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getEmail() {
        return email;
    }


    public String getTelephone() {
        return telephone;
    }


    public String getDescription() {
        return description;
    }
}
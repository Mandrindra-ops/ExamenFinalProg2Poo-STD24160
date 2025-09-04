package ecole;

public class Etudiant extends User {
   private final String groupe;
   private final Tuteur tuteur;
   private final Note note;
   private final List<Examen> examens;

   public Etudiant(int id, String nom, String prenom, String dateNaissance, String email, String telephone, String groupe, Tuteur tuteur) {
       super(id, nom, prenom, dateNaissance, email, telephone);
       this.groupe = groupe;
       this.tuteur = tuteur;
   }

   public String getGroupe() {
       return groupe;
   }

   public Tuteur getTuteur() {
       return tuteur;
   }

    public List<Examen> getExamen() {
         return Examen;
    }
}

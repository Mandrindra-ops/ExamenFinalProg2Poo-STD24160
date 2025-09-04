package ecole;


public class Note {
    private final int id;
    private final Etudiant etudiant;
    private final Examen examen;
    private List<Note> HistoriqueDesChangementDeNote(Instant t) {
        return new ArrayList<>();
    };



    public NotePourEtudiantExamen(int id, int idEtudiant, Examen examen, Note note) {
        this.id = id;
        this.idEtudiant = idEtudiant;
        this.examen = examen;
        this.note = note;
        
    }

    public int getId() {
        return id;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }
    public int getIdExamen() {
        return idExamen;
    }

    public double getNote() {
        return note;
    }
}

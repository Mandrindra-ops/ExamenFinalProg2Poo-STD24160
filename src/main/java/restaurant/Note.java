package restaurant;



public class Note {
    private final int id;
    private final int idEtudiant;
    private final Examen examen;
    private final Note note;



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

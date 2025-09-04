package restaurant;



public class NotePourEtudiantExamen {
    private final int id;
    private final int idEtudiant;
    private final int idExamen;
    private final double note;

    public NotePourEtudiantExamen(int id, int idEtudiant, int idExamen, double note) {
        this.id = id;
        this.idEtudiant = idEtudiant;
        this.idExamen = idExamen;
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

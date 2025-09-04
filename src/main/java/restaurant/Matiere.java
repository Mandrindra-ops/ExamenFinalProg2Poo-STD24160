package restaurant;

public class Matiere {
    private final int id;
    private final String label;
    private final int credits;
    private final String enseignant;

    public Matiere(int id, String label, int credits, String enseignant) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public int getCredits() {
        return credits;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public Matiere getMatiere() {
        return this;
    }
}
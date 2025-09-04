package restaurant;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Examen{
    private final int id;
    private final LocalDateTime dateEtHeure;
    private final Matiere matiere;
    private final int coefficients;

    public Examen(int id, LocalDateTime dateEtHeure, Matiere matiere, int coefficients) {
        this.id = id;
        this.dateEtHeure = dateEtHeure;
        this.matiere = matiere;
        this.coefficients = coefficients;
        
    }

    public int getId() {
        return id;
    }

    public String getDateEtHeure() {
        return dateEtHeure;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public int getCoefficients() {
        return coefficients;
    }

    public double getExamenGrade(Examen examen, Etudiant etudiant, Instant t) {
        double notePonderree = 0.0;
        double totalPointsPonderes = 0.0;
        double totalCoefficients = 0.0;
        for (Examen examen : this.examens) {
            if (examen.getMatiere().equals(examen.getMatiere()) && examen.getId() == examen.getId()) {
                notePonderree = examen.getNote() * examen.getCoefficients();
                totalPointsPonderes += notePonderree ;
                totalCoefficients += examen.getCoefficients();
            }
        }
        if (totalCoefficients > 0) {
            return totalPointsPonderes / totalCoefficients;
        } else {
            return 0.0;
        }
    }
}
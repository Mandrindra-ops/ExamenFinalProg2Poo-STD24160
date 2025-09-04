package restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Test
public void testCoutTotalUnLivre() {
    // Initialisation
    Livre livre = new Livre(1, "Java pour les nuls");
    livre.ajouterPrix(Instant.parse("2023-01-01T00:00:00Z"), 2000.0, "Prix initial");
    Emprunt emp = new Emprunt(1, Instant.parse("2023-06-01T00:00:00Z"), 5);
    emp.ajouterPlat(livre);
    // Action
    double cout = emp.getCoutTotal();

    // Assertions
    assertEquals(10000.0, cout, 0.01, "Le coût total devrait être 2000 * 5 = 10000.0");

}

@Test
public void testCoutTotalPlusieursLivres() {
    // Initialisation
    Livre livre1 = new Livre(1, "Java pour les noobs");
    livre1.ajouterPrix(Instant.parse("2023-01-01T00:00:00Z"), 2000.0, "Prix initial");
    Livre livre2 = new Livre(2, "Poo avancée");
    livre2.ajouterPrix(Instant.parse("2023-01-01T00:00:00Z"), 3000.0, "Prix initial");
    Emprunt emp = new Emprunt(1, Instant.parse("2023-06-01T00:00:00Z"), 3);
    emp.ajouterPlat(livre1);
    emp.ajouterPlat(livre2);
    // Action
    double cout = emp.getCoutTotal();

    // Assertions
    assertEquals(15000.0, cout, 0.01, "Le coût total devrait être (2000 + 3000) * 3 = 15000.0");

}
@Test
public void testCoutTotalEmpruntVide() {
    // Initialisation
    Emprunt emp = new Emprunt(1, Instant.parse("2023-02-01T00:00:00Z"), 5);
    // Action
    double cout = emp.getCoutTotal();

    // Assertions
    assertEquals(0.0, cout, 0.01, "Le coût total d'un emprunt vide devrait être 0.0");

}
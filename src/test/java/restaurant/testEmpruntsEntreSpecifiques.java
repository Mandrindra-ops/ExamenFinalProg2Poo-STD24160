package restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Test
public class testEmpruntsEntreDatesSpecifiques {
    @Test
    public void testEmpruntEntreSpecifiques() {
        // Initialisation
        Livre livre1 = new Livre(1, "Rakoto", "Jean", "123456");
        Emprunt emp1 = new Emprunt(1, Instant.parse("2023-01-15T00:00:00Z"), 5);
        Emprunt emp2 = new Emprunt(2, Instant.parse("2023-01-16T00:00:00Z"), 3);
        emp1.ajouterPlat(livre1);
        client.ajouterEmprunt(emp1);
        client.ajouterEmprunt(emp2);
        // Action
        List<Emprunt> emprunts = client.getEmpruntsEntre(
            Instant.parse("2023-01-01T00:00:00Z"),
                Instant.parse("2023-12-31T00:59:59Z"));

        // Assertions
        assertEquals(1, emprunts.size(), "Devrait retourner 1 emprunt en 2023");
        assertEquals(1, emprunts.get(0).getId(), "L'ID de l'emprunt devrait être 1");

    }
@Test
public void testEmpruntEntreDateNulles() {
    // Initialisation
    Client client = new Client(1, "Rakoto", "Jean", "123456");
    Emprunt emp = new Emprunt(1, Instant.parse("2023-01-15T00:00:00Z"), 5);
    client.ajouterEmprunt(emp);
    // Action
    List<Emprunt> emprunts = client.getEmpruntsEntre(
        Instant.parse("2023-01-01T00:00:00Z"),
        Instant.parse("2023-12-31T00:59:59Z")
    );

    // Assertions
    assertEquals(0, emprunts.size(), "Devrait une list vide pour un client sans emprunt");

}
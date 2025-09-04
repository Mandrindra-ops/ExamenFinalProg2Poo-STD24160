package restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestBibliotheque {
        @Test
        public void testGetPrixParJourAvantChangement() {
            Livre livre = new Livre(1, "java pour débutants");
            livre.ajouterPrix(Instant.parse("2023-01-01T00:00:00Z"), 2000.0, "Prix initial");
            livre.ajouterPrix(Instant.parse("2024-01-01T00:00:00Z"), 3000.0, "Augmentation de prix");

            double prix = livre.getPrixParJour(Instant.parse("2023-06-01T00:00:00Z"));

            //assertions
            assertEquals(2000.0, prix, 0.01, "le prix en 2023-06-01 devrait être 2000.0");

        }

        @Test
        public void testGetPrixParJourSansHistorique() {
        // Initialisation
        Livre livre = new Livre(2, "Livre vide");

        // Action et assertions
        assertThrows(IllegalStateException.class,
         () -> livre.getPrixParJour(Instant.now()),
         "devrait lever une exception car aucun prix n'est défini");

        }
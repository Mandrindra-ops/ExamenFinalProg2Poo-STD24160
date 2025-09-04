package restaurant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestNote {
    @Test
    public void testGetNote() {
        NotePourEtudiantExamen note = new NotePourEtudiantExamen(1, 1, 1, 15.0);
        assertEquals(15.0, note.getNote(), 0.01, "La note devrait être 15.0");
    }   
    @Test
    public void testGetNoteVide() {
        NotePourEtudiantExamen note = new NotePourEtudiantExamen(1, 1, 1, 0.0);
        assertEquals(0.0, note.getNote(), 0.01, "La note devrait être 0.0");
    }   
}
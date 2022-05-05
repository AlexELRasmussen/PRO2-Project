package dequetest;

import bryghus.Produkt;
import bryghus.Salg;
import deque.CirkularArrayDeque;
import deque.DequeI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CirkularArrayDequeTest {

    private DequeI deque;

    private Salg salg1;
    private Salg salg2;
    private Salg salg3;
    private Salg salg4;
    private Salg salg5;
    private Salg salg6;

    @BeforeEach
    void setUp() throws Exception {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.deque = new CirkularArrayDeque(6);

        Produkt kloster = new Produkt("Klosterbryg");
        Produkt sweet = new Produkt("Sweet Georgia Brown");
        Produkt extra = new Produkt("Extra Pilsner");
        Produkt classic = new Produkt("Classic Jazz");
        Produkt klippekort10 = new Produkt("Klippekort 10 klip");
        Produkt klippekort6 = new Produkt("Klippekort 6 klip");

        this.salg1 = new Salg(1);
        this.salg1.createSalgsLinje(kloster, 2, 40);

        this.salg2 = new Salg(2);
        this.salg2.createSalgsLinje(sweet, 3, 60);

        this.salg3 = new Salg(3);
        this.salg3.createSalgsLinje(extra, 2, 40);

        this.salg4 = new Salg(4);
        this.salg4.createSalgsLinje(classic, 3, 60);

        this.salg5 = new Salg(5);
        this.salg5.createSalgsLinje(klippekort10, 1, 160);

        this.salg6 = new Salg(6);
        this.salg6.createSalgsLinje(klippekort6, 2, 200);
    }

    @Test
    void addFirstAndRemoveLast() {
// --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        deque.addFirst(salg1);
        deque.addFirst(salg2);
        deque.addFirst(salg3);
        deque.addFirst(salg4);
        deque.addFirst(salg5);
        deque.addFirst(salg6);

        Salg salgTilBehandling = (Salg) deque.removeLast();
        assertEquals(salg1, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeLast();
        assertEquals(salg2, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeLast();
        assertEquals(salg3, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeLast();
        assertEquals(salg4, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeLast();
        assertEquals(salg5, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeLast();
        assertEquals(salg6, salgTilBehandling);

        assertThrows(NoSuchElementException.class, () -> {
            deque.removeFirst();
        });
    }

    @Test
    void addLastAndRemoveFirst() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        deque.addLast(salg1);
        deque.addLast(salg2);
        deque.addLast(salg3);
        deque.addLast(salg4);
        deque.addLast(salg5);
        deque.addLast(salg6);

        Salg salgTilBehandling = (Salg) deque.removeFirst();
        assertEquals(salg1, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeFirst();
        assertEquals(salg2, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeFirst();
        assertEquals(salg3, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeFirst();
        assertEquals(salg4, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeFirst();
        assertEquals(salg5, salgTilBehandling);

        salgTilBehandling = (Salg) deque.removeFirst();
        assertEquals(salg6, salgTilBehandling);

        assertThrows(NoSuchElementException.class, () -> {
            deque.removeFirst();
        });
    }


    @Test
    void size() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertEquals(0, deque.size());

        deque.addLast(salg1);
        assertEquals(1, deque.size());

        deque.addLast(salg2);
        assertEquals(2, deque.size());

        deque.addLast(salg3);
        assertEquals(3, deque.size());

        deque.addLast(salg4);
        assertEquals(4, deque.size());

        deque.addLast(salg5);
        assertEquals(5, deque.size());

        deque.addLast(salg6);
        assertEquals(6, deque.size());

        deque.removeFirst();
        assertEquals(5, deque.size());

        deque.removeFirst();
        assertEquals(4, deque.size());

        deque.removeFirst();
        assertEquals(3, deque.size());

        deque.removeFirst();
        assertEquals(2, deque.size());

        deque.removeFirst();
        assertEquals(1, deque.size());

        deque.removeFirst();
        assertEquals(0, deque.size());
    }

    @Test
    void isEmpty() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertTrue(deque.isEmpty());

        deque.addLast(salg1);
        assertFalse(deque.isEmpty());

        deque.addLast(salg2);
        assertFalse(deque.isEmpty());

        deque.addLast(salg3);
        assertFalse(deque.isEmpty());

        deque.removeFirst();
        assertFalse(deque.isEmpty());

        deque.removeFirst();
        assertFalse(deque.isEmpty());

        deque.removeFirst();
        assertTrue(deque.isEmpty());
    }
}
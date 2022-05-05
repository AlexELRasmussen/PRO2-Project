package CannibalTest;

import Cannibal.CircularCannibalMeal;
import Cannibal.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import queue.QueueI;

import static org.junit.jupiter.api.Assertions.*;

class CircularCannibalMealTest {

    private CircularCannibalMeal meal;

    private Person p1;
    private Person p2;
    private Person p3;
    private Person p4;
    private Person p5;
    private Person p6;
    private Person p7;
    private Person p8;
    private Person p9;

    @BeforeEach
    void setUp() throws Exception {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.meal = new CircularCannibalMeal(9);

        p1 = new Person("Hanna");
        p2 = new Person("Jens");
        p3 = new Person("Stine");
        p4 = new Person("Jeppe");
        p5 = new Person("Bodil");
        p6 = new Person("Hans");
        p7 = new Person("Bob");
        p8 = new Person("Jensine");
        p9 = new Person("Erik");
    }

    @Test
    void canAddPerson() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        meal.addPerson(p1);
        meal.addPerson(p2);
        meal.addPerson(p3);
        meal.addPerson(p4);
        meal.addPerson(p5);
        meal.addPerson(p6);
        meal.addPerson(p7);
        meal.addPerson(p8);
        meal.addPerson(p9);

        assertEquals(p1,meal.getElements()[0]);
        assertEquals(p9,meal.getElements()[8]);

    }

    @Test
    void canEatRandomPerson() {
        int unexpected = meal.getCurrentSize();
        Person person = meal.eatRandomPerson();
        assertEquals(unexpected - 1,meal.getCurrentSize());

    }

    @Test
    void canEatNextPerson() {

    }

    @Test
    void canPrintPerson() {

    }
}
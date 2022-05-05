package Cannibal;

import java.util.Random;

public class CircularCannibalMeal {
    private Person[] elements;
    private int currentSize;
    private int head;
    private int tail;

    public CircularCannibalMeal(int size) {
        elements = new Person[size];
        currentSize = 0;
        head = 0;
        tail = 0;
    }

    public Person[] getElements() {
        return elements;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    // Adds person to the cannibal dance meal
    public void addPerson(Person person) {
        growIfNecessary();
        currentSize++;
        elements[tail] = person;
        tail = (tail + 1) % elements.length;
    }

    // Removes random person from the cannibal dance
    public Person eatRandomPerson() {
        Random rand = new Random();
        int index = rand.nextInt(elements.length);
        Person person = elements[index];
        elements[index] = null;
        currentSize--;
        return person;
    }

    // Removes person "count" places from the last eaten
    public Person eatNextPerson() {
        return null;
    }

    // Prints all persons waiting to be served
    public void printPerson() {

    }

    private void growIfNecessary()
    {
        if (currentSize == elements.length)
        {
            Person[] newElements = new Person[2 * elements.length];
            for (int i = 0; i < elements.length; i++)
            {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }
}

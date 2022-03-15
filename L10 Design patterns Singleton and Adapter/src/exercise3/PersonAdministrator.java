package exercise3;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {
    private Set<Person> persons = new HashSet<>();
    private static PersonAdministrator instance = null;

    private PersonAdministrator() {
    }

    public static PersonAdministrator getInstance() {
        if (instance == null) {
            instance = new PersonAdministrator();
        }
        return instance;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    public Set<Person> getPersons() {
        return new HashSet<>(persons);
    }
}

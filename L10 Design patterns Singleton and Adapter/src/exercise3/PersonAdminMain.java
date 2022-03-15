package exercise3;

public class PersonAdminMain {
    public static void main(String[] args) {
        Person p1 = new Person("Hans Jensen","20039219");
        Person p2 = new Person("Jens Hansen","29210039");
        Person p3 = new Person("Jans Hensen","20392019");
        Person p4 = new Person("Jens Jensen","92192003");
        Person p5 = new Person("Hans Hansen","20190392");

        PersonAdministrator pa1 = PersonAdministrator.getInstance();
        PersonAdministrator pa2 = PersonAdministrator.getInstance();

        pa1.addPerson(p1);
        pa1.addPerson(p2);
        pa1.addPerson(p3);
        pa1.addPerson(p4);
        pa1.addPerson(p5);

        System.out.println(pa1.getPersons());

        pa2.removePerson(p3);

        System.out.println(pa1.getPersons());
    }
}

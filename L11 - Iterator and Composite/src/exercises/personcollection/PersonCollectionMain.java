package exercises.personcollection;

import java.util.FormatFlagsConversionMismatchException;

public class PersonCollectionMain {
    public static void main(String[] args) {
        Person p1 = new Person("Hans");
        Person p2 = new Person("Jens");
        Person p3 = new Person("Bob");
        Person p4 = new Person("Frans");
        Person p5 = new Person("Kasper");
        Person p6 = new Person("Jesper");
        Person p7 = new Person("Jonathan");
        Person p8 = new Person("Bo");
        Person p9 = new Person("Ib");
        Person p10 = new Person("Jasper");
        Person p11 = new Person("Hansi");
        Person p12 = new Person("Franzi");
        Person p13 = new Person("Ole");
        Person p14 = new Person("Jes");
        Person p15 = new Person("John");
        Person p16 = new Person("Peter");


        PersonCollection pc = new PersonCollection();

        pc.add(p1);
        pc.add(p2);
        pc.add(p3);
        pc.add(p4);
        pc.add(p5);
        pc.add(p6);
        pc.add(p7);
        pc.add(p8);
        pc.add(p9);
        pc.add(p10);
        pc.add(p11);
        pc.add(p12);
        pc.add(p13);
        pc.add(p14);
        pc.add(p15);
        pc.add(p16);

        for (int i = 0; i < pc.size(); i++) {
            System.out.println(pc.get(i));
        }

        // pc.add(3,p13);


    }
}

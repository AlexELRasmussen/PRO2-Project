package exercises.ex2;

public class Main {
    public static void main(String[] args) {
        Saelger s1 = new Saelger("Hansen");
        Indkoeber i1 = new Indkoeber("Jensen");
        Bogtitel b1 = new Bogtitel("Anders And", 6);
        Bogtitel b2 = new Bogtitel("Java",8);
        Kunde k1 = new Kunde("Læsehest1");
        Kunde k2 = new Kunde("Læsehest2");
        Kunde k3 = new Kunde("Læsehest3");

        b1.addObserver(s1);

        b2.addObserver(s1);
        b2.addObserver(i1);

        b1.etKoeb(k1);
        b1.etKoeb(k2);
        b1.etKoeb(k3);
        b2.etKoeb(k1);
        b2.etKoeb(k2);
        b2.etKoeb(k3);

    }
}

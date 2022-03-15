package exercises.ex2;

import java.util.HashSet;
import java.util.Set;

public class Saelger implements Observer{
    private String navn;
    private Set<Bogtitel> solgteBøger = new HashSet<>();

    public Saelger(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        Bogtitel bt = (Bogtitel) s;
        for (Kunde k : bt.getKunder()) {
            System.out.println(k.getBøger());
            System.out.println();
            solgteBøger.addAll(k.getBøger());
        }
    }
}

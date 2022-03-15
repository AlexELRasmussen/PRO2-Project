package exercises.ex2;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
    private String navn;
    private List<Bogtitel> bøger = new ArrayList<>();

    public Kunde(String navn) {
        this.navn = navn;
    }

    public void addBog(Bogtitel bogtitel) {
        bøger.add(bogtitel);
    }

    public List<Bogtitel> getBøger() {
        return new ArrayList<>(bøger);
    }
}

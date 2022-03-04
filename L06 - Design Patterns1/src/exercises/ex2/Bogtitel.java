package exercises.ex2;

import java.util.ArrayList;
import java.util.List;

public class Bogtitel implements Subject {
    private final String titel;
    private int antal;
    private List<Observer> observers = new ArrayList<>();
    private List<Kunde> kunder = new ArrayList<>();

    public Bogtitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public void indkoebTilLager(int antal) {
        this.antal += antal;
    }

    public void etKoeb(Kunde k) {
        kunder.add(k);
        antal--;
        k.addBog(this);
        this.notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public List<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public String toString() {
        return "Titel: " + titel;
    }

    public void addKunde(Kunde k) {
        kunder.add(k);
        k.addBog(this);
    }
}

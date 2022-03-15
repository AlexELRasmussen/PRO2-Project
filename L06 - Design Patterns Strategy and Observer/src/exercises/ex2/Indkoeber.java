package exercises.ex2;

public class Indkoeber implements Observer {
    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject s) {
        Bogtitel bt = (Bogtitel) s;
        if (bt.getAntal() < 6) {
            System.out.println(((Bogtitel) s).getTitel() + "'s beholdning er under 6, indkøb straks 10 eksemplarer");
            bt.indkoebTilLager(10);
        }
    }
}

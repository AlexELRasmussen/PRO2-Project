package exercise3;

public class Person {
    private String navn;
    private String tlfnr;

    public Person(String navn, String tlfnr) {
        this.navn = navn;
        this.tlfnr = tlfnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }

    @Override
    public String toString() {
        return "Navn: " + navn + " telefonnr: " + tlfnr + "\n";
    }
}

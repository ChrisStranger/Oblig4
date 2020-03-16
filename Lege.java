public class Lege implements Comparable<Lege> {

    protected static int nyId = 0;
    protected int id;
    protected String navn;

    public Lege(String navn) {
        this.navn = navn;
        id = nyId;
        nyId++;
    }

    public String hentNavn() {
        return navn;
    }

    public String toString() {
            return "Navn: " + navn + "\nTittel: Lege";
    }

    @Override
    public int compareTo(Lege a) {
        return hentNavn().compareTo(a.hentNavn());
    }
}
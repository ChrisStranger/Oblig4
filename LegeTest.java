class LegeTest {
    public static void main(String[] args) {

        LagLegeliste();
    }
    static void LagLegeliste() {
        SortertLenkeliste<Lege> legeListe = new SortertLenkeliste<Lege>();
        legeListe.leggTil(new Lege("Paul"));
        legeListe.leggTil(new Lege("Anne"));
        legeListe.leggTil(new Lege("Britt"));
        legeListe.leggTil(new Lege("Xander"));

        for (Lege lege : legeListe) {
            System.out.println(lege.hentNavn());
        }
    }
}
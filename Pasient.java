public class Pasient {

    static int IDTeller = 0;
    private int pasientID;
    private String  navn;
    private String fodselsnr;
    private Stabel<Resept> reseptStabel = new Stabel<Resept>();

    public Pasient(String navn, String fodselsnr) {
        this.navn = navn;
        this.fodselsnr = fodselsnr;
        this.pasientID = IDTeller;
        IDTeller++;
    }

    public Stabel<Resept> hentReseptStabel() {
        return reseptStabel;
    }

    public int hentPasientID() {
        return pasientID;
    }

    public void leggTilResept(Resept resept) {
        reseptStabel.leggPaa(resept);
    }
}
class PResept extends HvitResept {

    public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId) {
        super(legemiddel, utskrivendeLege, pasientId, 3);
    }

    @Override
    public String farge() {
        return super.farge();
    }

    @Override
    public Double prisAaBetale() {
        double pris = legemiddel.hentPris() - 108;
        if (pris > 0) {
            return pris;
        } else {
            return 0.0;
        }
    }
    public String toString() {
        return "P-resept\n" + super.toString();
    }
}
class IteratorTest {
    public static void main(String[] args) {
        lagListe();
    }
    static void lagListe() {
        Liste<String> liste = new Lenkeliste<String>();
        for (int i = 0; i<15; i++) {
            liste.leggTil("Element"+(i+1));
        }
        for (String e : liste) {
            System.out.println(e);
        }
    }
}
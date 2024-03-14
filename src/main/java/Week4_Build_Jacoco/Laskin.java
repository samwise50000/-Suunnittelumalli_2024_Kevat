package Week4_Build_Jacoco;

public class Laskin {

    private int tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {
        tulos = tulos * n;
    }

    public double jaa(double luku) {
        if (luku == 0) {
            throw new ArithmeticException("Nollalla ei voi jakaa");
        }
        tulos /= luku;
        return tulos;
    }

    public void nelio(int n) {
        tulos = n * n;
    }

    public void neliojuuri(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatiiviselle luvulle ei voi laskea neliöjuurta");
        }
        tulos = (int) Math.sqrt(n);
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
        tulos = 0;
    }
}

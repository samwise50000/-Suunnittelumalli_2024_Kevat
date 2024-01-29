package Week2_Osa2.laiteosat;

public class Verkkokortti implements Laiteosa {
    private double hinta;

    public Verkkokortti(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double haeHinta() {
        return hinta;
    }
}

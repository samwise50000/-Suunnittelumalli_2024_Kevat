package Week2_Osa2.laiteosat;

public class Muistipiiri implements Laiteosa {
    private double hinta;

    public Muistipiiri(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double haeHinta() {
        return hinta;
    }
}

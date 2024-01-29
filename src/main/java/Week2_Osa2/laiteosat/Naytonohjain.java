package Week2_Osa2.laiteosat;

public class Naytonohjain implements Laiteosa {
    private double hinta;

    public Naytonohjain(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double haeHinta() {
        return hinta;
    }
}

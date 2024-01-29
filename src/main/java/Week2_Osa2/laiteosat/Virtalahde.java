package Week2_Osa2.laiteosat;

public class Virtalahde implements Laiteosa {
    private double hinta;

    public Virtalahde(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double haeHinta() {
        return hinta;
    }
}
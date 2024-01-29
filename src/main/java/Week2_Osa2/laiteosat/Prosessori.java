package Week2_Osa2.laiteosat;

public class Prosessori implements Laiteosa {
    private double hinta;

    public Prosessori(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double haeHinta() {
        return hinta;
    }
}

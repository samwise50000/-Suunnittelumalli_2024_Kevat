package Week2_Osa2.laiteosat;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {
    private double hinta;
    private List<Laiteosa> komponentit = new ArrayList<>();

    public Kotelo(double hinta) {
        this.hinta = hinta;
    }

    public void lisaaLaiteosa(Laiteosa laiteosa) {
        komponentit.add(laiteosa);
    }

    @Override
    public double haeHinta() {
        double kokonaisHinta = hinta;
        for (Laiteosa laiteosa : komponentit) {
            kokonaisHinta += laiteosa.haeHinta();
        }
        return kokonaisHinta;
    }
}
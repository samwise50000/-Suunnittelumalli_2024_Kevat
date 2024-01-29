package Week2_Osa2;

import Week2_Osa2.laiteosat.*;

public class Main {
    public static void main(String[] args) {

        Muistipiiri muistipiiri = new Muistipiiri(50.0);
        Prosessori prosessori = new Prosessori(200.0);
        Verkkokortti verkkokortti = new Verkkokortti(30.0);
        Naytonohjain naytonohjain = new Naytonohjain(150.0);
        Virtalahde virtalahde = new Virtalahde(80.0);

        Emolevy emolevy = new Emolevy(150.0);
        emolevy.lisaaLaiteosa(muistipiiri);
        emolevy.lisaaLaiteosa(prosessori);
        emolevy.lisaaLaiteosa(verkkokortti);
        emolevy.lisaaLaiteosa(naytonohjain);

        Kotelo kotelo = new Kotelo(100.0);
        kotelo.lisaaLaiteosa(emolevy);
        kotelo.lisaaLaiteosa(virtalahde);

        double kokonaisHinta = kotelo.haeHinta();
        System.out.println("Kokoonpanon hinta: " + kokonaisHinta);
    }
}
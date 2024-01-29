package Week2;

import Week2.käyttäjä.Jasper;

import Week2.tehtaat.AdidasTehdas;
import Week2.tehtaat.BossTehdas;
import Week2.tehtaat.VaateTehdas;

public class Main {
    public static void main(String[] args) {
        // Luodaan Jasper ja alustetaan hänet Adidas-tehtaalla
        VaateTehdas adidasTehdas = new AdidasTehdas();
        Jasper jasper = new Jasper(adidasTehdas);

        // Pukeudutaan ja tulostetaan asu
        System.out.println("Ennen valmistumista:");
        jasper.pukeudu();

        // Vaihdetaan Boss-tehtaaseen
        VaateTehdas bossTehdas = new BossTehdas();
        jasper.setVaateTehdas(bossTehdas);

        // Pukeudutaan uudelleen ja tulostetaan asu
        System.out.println("\nValmistumisen jälkeen:");
        jasper.pukeudu();
    }
}

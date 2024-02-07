package Week3_Osa2;


import Week3_Osa2.käyttäjä.Jasper;

import Week3_Osa2.tehtaat.AdidasTehdas;
import Week3_Osa2.tehtaat.BossTehdas;
import Week3_Osa2.tehtaat.VaateTehdas;

public class Main {
    public static void main(String[] args) {
        VaateTehdas adidasTehdas = AdidasTehdas.getInstance();
        Jasper jasper = new Jasper(adidasTehdas);

        System.out.println("Ennen valmistumista:");
        jasper.pukeudu();

        VaateTehdas bossTehdas = BossTehdas.getInstance();
        jasper.setVaateTehdas(bossTehdas);

        System.out.println("\nValmistumisen jälkeen:");
        jasper.pukeudu();
    }
}



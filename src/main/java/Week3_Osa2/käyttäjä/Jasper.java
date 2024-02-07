package Week3_Osa2.käyttäjä;

import Week3_Osa2.tehtaat.VaateTehdas;
import Week3_Osa2.modellit.Farmarit;
import Week3_Osa2.modellit.TPaita;
import Week3_Osa2.modellit.Lippis;
import Week3_Osa2.modellit.Kengat;

public class Jasper {
    private Farmarit farmarit;
    private TPaita tPaita;
    private Lippis lippis;
    private Kengat kengat;

    public Jasper(VaateTehdas vaateTehdas) {
        this.farmarit = vaateTehdas.luoFarmarit();
        this.tPaita = vaateTehdas.luoTPaita();
        this.lippis = vaateTehdas.luoLippis();
        this.kengat = vaateTehdas.luoKengat();
    }

    public void pukeudu() {
        System.out.println("Jasper pukeutuu:");
        System.out.println(farmarit);
        System.out.println(tPaita);
        System.out.println(lippis);
        System.out.println(kengat);
    }

    public void setVaateTehdas(VaateTehdas vaateTehdas) {
        this.farmarit = vaateTehdas.luoFarmarit();
        this.tPaita = vaateTehdas.luoTPaita();
        this.lippis = vaateTehdas.luoLippis();
        this.kengat = vaateTehdas.luoKengat();
    }
}


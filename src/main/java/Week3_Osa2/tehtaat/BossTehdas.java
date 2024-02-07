package Week3_Osa2.tehtaat;

import Week3_Osa2.tuotteet.Boss.BossFarmarit;
import Week3_Osa2.tuotteet.Boss.BossKengat;
import Week3_Osa2.tuotteet.Boss.BossLippis;
import Week3_Osa2.tuotteet.Boss.BossTPaita;
import Week3_Osa2.modellit.Kengat;
import Week3_Osa2.modellit.Farmarit;
import Week3_Osa2.modellit.Lippis;
import Week3_Osa2.modellit.TPaita;

public class BossTehdas implements VaateTehdas {
    private static BossTehdas instance;

    private BossTehdas() {}

    public static BossTehdas getInstance() {
        if (instance == null) {
            instance = new BossTehdas();
        }
        return instance;
    }

    public Farmarit luoFarmarit() {
        return new BossFarmarit();
    }

    public TPaita luoTPaita() {
        return new BossTPaita();
    }

    public Lippis luoLippis() {
        return new BossLippis();
    }

    public Kengat luoKengat() {
        return new BossKengat();
    }
}

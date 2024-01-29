package Week2.tehtaat;

import Week2.tuotteet.Boss.BossFarmarit;
import Week2.tuotteet.Boss.BossKengat;
import Week2.tuotteet.Boss.BossLippis;
import Week2.tuotteet.Boss.BossTPaita;
import Week2.modellit.Kengat;
import Week2.modellit.Farmarit;
import Week2.modellit.Lippis;
import Week2.modellit.TPaita;
public class BossTehdas implements VaateTehdas {
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

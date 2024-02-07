package Week3_Osa2.tehtaat;

import Week3_Osa2.tehtaat.VaateTehdas;
import Week3_Osa2.tuotteet.Adidas.AdidasFarmarit;
import Week3_Osa2.tuotteet.Adidas.AdidasKengat;
import Week3_Osa2.tuotteet.Adidas.AdidasLippis;
import Week3_Osa2.tuotteet.Adidas.AdidasTPaita;
import Week3_Osa2.modellit.Farmarit;
import Week3_Osa2.modellit.Kengat;
import Week3_Osa2.modellit.Lippis;
import Week3_Osa2.modellit.TPaita;

public class AdidasTehdas implements VaateTehdas {
    private static AdidasTehdas instance;

    private AdidasTehdas() {}

    public static AdidasTehdas getInstance() {
        if (instance == null) {
            instance = new AdidasTehdas();
        }
        return instance;
    }

    public Farmarit luoFarmarit() {
        return new AdidasFarmarit();
    }

    public TPaita luoTPaita() {
        return new AdidasTPaita();
    }

    public Lippis luoLippis() {
        return new AdidasLippis();
    }

    public Kengat luoKengat() {
        return new AdidasKengat();
    }
}

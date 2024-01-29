package Week2.tehtaat;

import Week2.tuotteet.Adidas.AdidasFarmarit;
import Week2.tuotteet.Adidas.AdidasKengat;
import Week2.tuotteet.Adidas.AdidasLippis;
import Week2.tuotteet.Adidas.AdidasTPaita;
import Week2.modellit.Farmarit;
import Week2.modellit.Kengat;
import Week2.modellit.Lippis;
import Week2.modellit.TPaita;

public class AdidasTehdas implements VaateTehdas {
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

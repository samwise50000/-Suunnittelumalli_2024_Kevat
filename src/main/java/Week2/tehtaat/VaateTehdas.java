package Week2.tehtaat;

import Week2.modellit.Farmarit;
import Week2.modellit.TPaita;
import Week2.modellit.Lippis;
import Week2.modellit.Kengat;

public interface VaateTehdas {
    Farmarit luoFarmarit();
    TPaita luoTPaita();
    Lippis luoLippis();
    Kengat luoKengat();
}

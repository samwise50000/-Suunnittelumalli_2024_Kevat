package Week3_Osa2.tehtaat;

import Week3_Osa2.modellit.Farmarit;
import Week3_Osa2.modellit.TPaita;
import Week3_Osa2.modellit.Lippis;
import Week3_Osa2.modellit.Kengat;

public interface VaateTehdas {
    Farmarit luoFarmarit();
    TPaita luoTPaita();
    Lippis luoLippis();
    Kengat luoKengat();
}


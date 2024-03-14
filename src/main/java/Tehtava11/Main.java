package Tehtava11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Memento memento = arvuuttaja.liityPeliin();
        int arvaus = -1;

        // Pelataan, kunnes arvaus on oikein
        while (!arvuuttaja.arvaa(memento, arvaus)) {
            Random random = new Random();
            arvaus = random.nextInt(100); // Arvotaan uusi arvaus väliltä 0-99
        }
    }
}

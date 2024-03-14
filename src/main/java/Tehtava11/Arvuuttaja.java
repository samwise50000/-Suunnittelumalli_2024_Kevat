package Tehtava11;

import java.util.Random;

public class Arvuuttaja {
    public Memento liityPeliin() {
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Arvotaan luku väliltä 0-99
        return new Memento(randomNumber);
    }

    public boolean arvaa(Memento memento, int arvaus) {
        int randomNumber = memento.getNumber();
        if (arvaus == randomNumber) {
            System.out.println("Oikein arvattu! Arvuuttajan luku oli: " + randomNumber);
            return true;
        } else {
            System.out.println("Väärin arvattu. Yritä uudelleen.");
            return false;
        }
    }
}

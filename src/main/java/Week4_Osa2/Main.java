package Week4_Osa2;
import Week4_Osa2.Characters.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        for (int i = 0; i < 6; i++) {
            System.out.println("Pokemon tekee temppuja...");
            pokemon.performAction();
            System.out.println();
        }
    }
}

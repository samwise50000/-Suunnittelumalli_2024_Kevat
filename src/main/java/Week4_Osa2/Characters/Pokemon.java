package Week4_Osa2.Characters;

import Week4_Osa2.Characters.States.PokemonState;
import Week4_Osa2.Characters.States.CharizardState;
import Week4_Osa2.Characters.States.CharmeleonState;
import Week4_Osa2.Characters.States.CharmanderState;

public class Pokemon {
    private PokemonState currentState;

    public Pokemon() {
        this.currentState = new CharmanderState();
    }

    public void performAction() {
        this.currentState.performAction();
        evolve();
    }

    private void evolve() {
        if (this.currentState instanceof CharmanderState) {
            System.out.println("Charmander kehittyy Charmeleoniksi!");
            this.currentState = new CharmeleonState();
        } else if (this.currentState instanceof CharmeleonState) {
            System.out.println("Charmeleon kehittyy Charizardiksi!");
            this.currentState = new CharizardState();
        } else if (this.currentState instanceof CharizardState) {
            System.out.println("Charizard pysyy Charizardina!");
        }
    }
}

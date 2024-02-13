package Week4_Osa2.Characters.States;

public class CharizardState implements PokemonState {
    @Override
    public void performAction() {
        System.out.println("Charizard iskee tulisella hännällään!");
    }
}
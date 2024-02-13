package Week4_Osa2.Characters.States;

public class CharmanderState implements PokemonState {
    @Override
    public void performAction() {
        System.out.println("Charmander hyökkää tulipallolla!");
    }
}

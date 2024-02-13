package Week4_Osa2.Characters.States;

public class CharmeleonState implements PokemonState {
    @Override
    public void performAction() {
        System.out.println("Charmeleon syöksee liekkejä!");
    }
}

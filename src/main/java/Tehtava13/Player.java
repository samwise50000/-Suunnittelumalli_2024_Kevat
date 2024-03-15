package Tehtava13;

class Player {
    private final PlayerState state;

    public Player(PlayerState state) {
        this.state = state;
    }

    public void accept(BonusCalculator bonusCalculator) {
        state.accept(bonusCalculator);
    }
}
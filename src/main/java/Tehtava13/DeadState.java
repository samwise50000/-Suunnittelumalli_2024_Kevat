package Tehtava13;

class DeadState implements PlayerState {
    @Override
    public void accept(BonusCalculator bonusCalculator) {
        bonusCalculator.visit(this);
    }
}
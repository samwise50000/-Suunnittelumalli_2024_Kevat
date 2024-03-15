package Tehtava13;

class InjuredState implements PlayerState {
    @Override
    public void accept(BonusCalculator bonusCalculator) {
        bonusCalculator.visit(this);
    }
}

package Tehtava13;

class HealthyState implements PlayerState {
    @Override
    public void accept(BonusCalculator bonusCalculator) {
        bonusCalculator.visit(this);
    }
}
package Tehtava13;

class BonusCalculator {
    private int bonusPoints;

    public void visit(HealthyState state) {
        bonusPoints += 10; // HealthyState saa 10 bonuspistettä
    }

    public void visit(InjuredState state) {
        bonusPoints += 5; // InjuredState saa 5 bonuspistettä
    }

    public void visit(DeadState state) {
        // DeadState ei saa bonuspisteitä
    }

    public int getBonusPoints() {
        return bonusPoints;
    }
}
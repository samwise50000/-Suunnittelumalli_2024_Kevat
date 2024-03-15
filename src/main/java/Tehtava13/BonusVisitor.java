package Tehtava13;

interface BonusVisitor {
    void visit(HealthyState state);
    void visit(InjuredState state);
    void visit(DeadState state);
}

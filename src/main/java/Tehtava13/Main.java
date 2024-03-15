package Tehtava13;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(new HealthyState());
        Player player2 = new Player(new InjuredState());
        Player player3 = new Player(new DeadState());

        BonusCalculator bonusCalculator = new BonusCalculator();
        player1.accept(bonusCalculator);
        System.out.println("Player 1 bonus points: " + bonusCalculator.getBonusPoints());

        bonusCalculator = new BonusCalculator(); // Nollaa bonuspisteet uutta laskentaa varten
        player2.accept(bonusCalculator);
        System.out.println("Player 2 bonus points: " + bonusCalculator.getBonusPoints());

        bonusCalculator = new BonusCalculator(); // Nollaa bonuspisteet uutta laskentaa varten
        player3.accept(bonusCalculator);
        System.out.println("Player 3 bonus points: " + bonusCalculator.getBonusPoints());
    }
}
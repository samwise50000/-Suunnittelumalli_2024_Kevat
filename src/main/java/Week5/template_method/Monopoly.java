package Week5.template_method;


public class Monopoly extends Game {

    private int turnsPlayed = 0;
    private int winnerPlayer;

    void initializeGame() {
        System.out.println("Initializing Monopoly game...");
    }

    void makePlay(int player) {
        turnsPlayed++;
        System.out.println("Player " + player + " is making a move...");
        if (turnsPlayed == 10) {
            winnerPlayer = player;
            gameOver = true;
        }
    }

    boolean endOfGame() {
        return gameOver;
    }

    void printWinner() {
        System.out.println("Game over! Player " + winnerPlayer + " wins!");
    }
}
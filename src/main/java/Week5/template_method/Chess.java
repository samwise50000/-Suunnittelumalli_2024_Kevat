package Week5.template_method;

public class Chess extends Game {

    private int movesPlayed = 0;
    private int winnerPlayer;

    void initializeGame() {
        System.out.println("Initializing Chess game...");
    }

    void makePlay(int player) {
        movesPlayed++;
        System.out.println("Player " + player + " is making a move...");
        if (movesPlayed == 20) {
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
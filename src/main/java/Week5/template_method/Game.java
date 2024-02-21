package Week5.template_method;

public abstract class Game {

    protected int playersCount;
    protected boolean gameOver;

    abstract void initializeGame();
    abstract void makePlay(int player);
    abstract boolean endOfGame();
    abstract void printWinner();

    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while (!endOfGame()){
            makePlay(j);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }
}
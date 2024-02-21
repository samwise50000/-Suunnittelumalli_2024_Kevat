package Week5;

import Week5.template_method.Game;
import Week5.template_method.Chess;
import Week5.template_method.Monopoly;

public class Main {

    public static void main(String[] args) {

        Game monopoly = new Monopoly();
        monopoly.playOneGame(4);

        Game chess = new Chess();
        chess.playOneGame(2);
    }
}

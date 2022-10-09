package games;

public class Main {
    public static void main(String[] args) {
        RPSGame game = new RPSGame("Nadja",0);
        do {game.playGame();} while (game.wantMore());
    }
}

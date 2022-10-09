package games;

import java.util.Scanner;

public class RPSGame {
    Player player;
    Fist aIFist;
    private String yourChoiceStr = "";
    private String resultAIstr = "";
    //    private int score;
    private String resultOfGame = "";
    private int tries;

    RPSGame(String playersName, int playersScore) {
        player = new Player(playersName, playersScore);
        aIFist = new Fist();
    }

    public void playGame() {
        System.out.println(player.toString());
        System.out.println("Rock (0), Paper (1), Scissors (2). Your choice: ");
        Scanner ssscanner = new Scanner(System.in);
        int AIChoice = aIFist.play();
        switch (AIChoice) {
            case Fist.ROCK:
                resultAIstr = "ROCK";
                break;
            case Fist.PAPER:
                resultAIstr = "PAPER";
                break;
            case Fist.SCISSORS:
                resultAIstr = "SCISSORS";
                break;
        }
        switch (ssscanner.next().toLowerCase()) {
            case "0":
            case "rock":
            case "r":
                yourChoiceStr = "ROCK";
                if (AIChoice == Fist.SCISSORS) {
                    resultOfGame = "Congrats. You win. Rock beats Scissors";
                    player.plusScore();
                } else if (AIChoice == Fist.ROCK) {
                    resultOfGame = "Upps, you both chose the same";
                } else {
                    resultOfGame = "You lose. Paper beats Rock";
                    player.minusScore();
                }
                resultInfo();
                break;
            case "1":
            case "paper":
            case "p":
                yourChoiceStr = "PAPER";
                if (AIChoice == Fist.ROCK) {
                    resultOfGame = "Congrats. You win. Paper beats Rock";
                    player.plusScore();
                } else if (AIChoice == Fist.PAPER) {
                    resultOfGame = "Upps, you both chose the same";
                } else {
                    resultOfGame = "You lose. Scissors beats Paper";
                    player.minusScore();
                }
                resultInfo();
                break;
            case "2":
            case "scissors":
            case "s":
                yourChoiceStr = "SCISSORS";
                if (AIChoice == Fist.PAPER) {
                    resultOfGame = "Congrats. You win. Scissors beats Paper";
                    player.plusScore();
                } else if (AIChoice == Fist.SCISSORS) {
                    resultOfGame = "Upps, you both chose the same";
                } else {
                    resultOfGame = "You lose. Rock beats Scissors";
                    player.minusScore();
                }
                resultInfo();
                break;

            default:
                System.out.println("Upps, you chose smth wrong ");
        }
    }

    public void resultInfo() {
        System.out.println("Your selection is: " + yourChoiceStr);
        System.out.println("AI's selection is: " + resultAIstr);
        System.out.println(resultOfGame);
        System.out.println("Your score is: " + player.getScore());
        ++tries;
        System.out.println("Your try is: " + tries);
    }

    public boolean wantMore() {
        Scanner ssscanner = new Scanner(System.in);
        System.out.println("Do you want to play again? y/n?");
        String choice = ssscanner.next();
        if (choice.equals("y") || choice.equals("Y") || choice.equals("yes") || choice.equals("Yes")) {
            return true;
        } else {
            System.out.println("Ok. Bye. Have a nice day!");
            return false;
        }
    }

}


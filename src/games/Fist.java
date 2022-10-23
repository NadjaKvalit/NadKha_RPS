package games;

import java.util.Random;

public class Fist {
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

     public int play() {
        Random random = new Random();
        return random.nextInt(3);
    }
}

package games;

public class Player {
    private int score;
    private final String name;

    //constructor


    public Player(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    //@TODO: these methods work fine, but by convention there should also be a setter method:
    //@TODO: public void setScore(int score){ this.score = score; }
    public void plusScore() {
        score++;
    }

    public void minusScore() {
        score--;
    }

/*    public String getName() {
        return name;
    }

    public void rageQuit() {
        System.exit(0);
    }*/

    @Override
    public String toString() {
        return "Name: " + this.name + ", Score: " + this.score;
    }
}

package games;

public class Player {
    private int score;
    private final String name;

    //constructor
    public Player(String name, int score) {
        this.name = name;//this - means that we call field from THIS class
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    /*   public void plusScore() {
           score++;
       }

       public void minusScore() {
           score--;
       }

       public String getName() {
           return name;
       }

       public void rageQuit() {
           System.exit(0);
       }*/
    public void setScore(int score) {
        this.score = score + this.score;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Score: " + this.score;
    }
}

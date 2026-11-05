import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
    private String question;
    private String answer;
    private String hint;
    private boolean solved;
    private int attemptsLeft;
    private Item reward;

    private static final String[][] Riddles = {
        {"What has keys but no locks?", "piano", "You can play music with it."},
        {"What has a head and a tail but no body?", "coin", "You can flip it."},
        {"What gets wetter the more it dries?", "towel", "You use it after a shower."},
        {"What has hands but cannot clap?", "clock", "It tells you the time."},
        {"What has to be broken before you can use it?", "egg", "You might eat it for breakfast."},
        {"What has many teeth but cannot bite?", "comb", "You use it on your hair."},
        {"What has one eye but cannot see?", "needle", "It is used for sewing."}
    };

    public Puzzle(Item reward) {
        Random rand = new Random();
        int index = rand.nextInt(Riddles.length);
        question = Riddles[index][0];
        answer = Riddles[index][1];
        hint = Riddles[index][2];
        solved = false;
        attemptsLeft = 3;
        this.reward = reward;
    }

    public void displayPuzzle() {
        System.out.println(question);
    }

    public boolean checkAnswer(String guess) {
        if (solved || attemptsLeft <= 0) {
            return false;
        }
        if (guess.equalsIgnoreCase(answer)) {
            solved = true;
            return true;
        }
        attemptsLeft--;
        System.out.println("Incorrect! Attempts left: " + attemptsLeft);
        return false;
    }

    public void displayHint() {
        System.out.println("Hint: " + hint);
    }

    public boolean isSolved() {
        return solved;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public Item getReward() {
        return reward;
    }
}

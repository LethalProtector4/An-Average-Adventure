public class WizardTower extends Room{
private Puzzle puzzle;
    private boolean chestOpened;

    public WizardTower(Item rune) {
        super("Wizard Tower", "A mysterious tower filled with magic.");

        puzzle = new Puzzle(rune);
        chestOpened = false;
    }

    @Override
    public void interactWith(Player player) {
        System.out.println("You have entered the Wizard Tower.");

        if (!chestOpened && puzzle.getAttemptsLeft() > 0) {
            System.out.println("You discover a locked chest.");
            puzzle.displayPuzzle();
            System.out.println("You have " + puzzle.getAttemptsLeft() + " attempts.");
        }
        else if (chestOpened) {
            System.out.println("The chest is already open.");
        }
        else {
            System.out.println("You have run out of attempts!");
        }
    }

    public boolean solvePuzzle(Player player, String answer) {
        if (chestOpened) {
            System.out.println("The chest is already open.");
            return false;
        }

        if (puzzle.checkAnswer(answer)) {
            chestOpened = true;
            System.out.println("Correct! You solved the puzzle!");
            System.out.println("The chest opens!");
            System.out.println("You found "+ reward.getName());
            return true;
        }

        if (puzzle.getAttemptsLeft() > 0) {
            System.out.println("Incorrect! Try again.");
        }
        else {
            System.out.println("You have run out of attempts!");
        }

        return false;
    }

    public void displayHint() {
        if (!chestOpened && puzzle.getAttemptsLeft() > 0) {
            puzzle.displayHint();
        }
        else {
            System.out.println("No hint is available.");
        }
    }

    public boolean isChestOpened() {
        return chestOpened;
    }
}

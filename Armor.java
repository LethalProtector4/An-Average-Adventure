// The Armor.java class stores the armors protection value, name, and cost.

public class Armor extends Item{

    private int defense; // stores the defense value or strength of armor

    public Armor(String name, int cost, int defense) { // Constructor class
        super(name, cost);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }
}
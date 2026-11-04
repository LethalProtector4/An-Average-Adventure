// Potion.java class stores potion type and cost. It also randomly generates a buff value

import java.util.Random; // Note: I had to look up this import and how to implement it 

public class Potion extends Item {

    private String type; // Stores the potion type
    private int buff; // Stores the roll value

    public Potion(String name, int cost, Sting type) {
        super(name, cost); 
        this.type = type; // saves potion type
        this.buff = 0; // start value is 0
    }

    public String getType() { // Returns type of potion
        return type;
    }

    public int getBuff() { // Returns buff value
        return buff;
    }

    public int rollChance() { // Randomly generates and returns buff value
        Random random = new Random();
        buff = random.nextInt(6) + 1;
        return buff;
    }
}
// Item.java class will store, save, and return the name and cost of the item

public abstract class Item {

    private String name; // Stores item name
    private int cost; // Stores how much item cost

    public Item(String name, int cost) { // Constructor class
        this.name = name; // Saves item name
        this.cost = cost; // Saves item cost
    }

    public String getName() { // returns item's name
        return name;
    }

    public int getCost() { // Returns item's cost
        return cost;
    }
}
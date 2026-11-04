// The Weapon.java class will store information about weapons that the player can buy, find, or equip

public class Weapon extends Item {

    private int damage;

    public Weapon(String name, int cost, int damage) {
        super(name, cost); // lets child weapon use from parent item class
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
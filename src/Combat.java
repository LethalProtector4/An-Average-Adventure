
import java.util.Random;
import java.util.Scanner;
public class Combat {

    private Random rand;
    private Scanner input;

    public Combat() {
        rand = new Random();
        input = new Scanner(System.in);
    }

    public void startCombat(Player player, Enemy enemy) {

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {

            System.out.println("\nYour HP: " + player.getHealth());
            System.out.println("Wizard HP: " + enemy.getHealth());

            System.out.println("\n1. Attack");
            System.out.println("2. Use special attack");
            System.out.print("Choose an action: ");

            int choice = input.nextInt();

            if (choice == 1) {
                playerAttack(player, enemy);
            }
            else if (choice == 2) {
                specialAttack(player, enemy);
            }
            else {
                System.out.println("Invalid choice!");
                continue;
            }
            if (wizard.getHealth() > 0) {
                wizardAttack(player, enemy);
            }
        }
    }

    public void playerAttack(Player player, Enemy enemy) {

        int hitChance = rand.nextInt(100) + 1;

        if (hitChance <= player.getAccuracy()) {

            int damage = rand.nextInt(10) + player.getStrength();

            wizard.takeDamage(damage);

            System.out.println("You hit the Enemy for " + damage + " damage!");
        }
        else {
            System.out.println("Your attack missed!");
        }
    }

    public void specialAttack(Player player, Enemy enemy) {

        int damage = rand.nextInt(15) + player.getStrength();

        wizard.takeDamage(damage);

        System.out.println("You used your special attack!");
        System.out.println("You dealt " + damage + " damage!");
    }

    public void wizardAttack(Player player, Enemy enemy) {

        int hitChance = rand.nextInt(100) + 1;

        if (hitChance <= 70) {

            int damage = rand.nextInt(10) + 5;

            player.takeDamage(damage);

            System.out.println("The Enemy hit you for " + damage + " damage!");
        }
        else {
            System.out.println("The Enemy's spell missed!");
        }
    }
}



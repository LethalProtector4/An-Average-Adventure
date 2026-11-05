
import java.util.Random;
import java.util.Scanner;
public class Combat {

    private Random rand;
    private Scanner input;

    public Combat() {
        rand = new Random();
        input = new Scanner(System.in);
    }

    public void startCombat(Player player, Wizard wizard) {

        while (player.getHealth() > 0 && wizard.getHealth() > 0) {

            System.out.println("\nYour HP: " + player.getHealth());
            System.out.println("Wizard HP: " + wizard.getHealth());

            System.out.println("\n1. Attack");
            System.out.println("2. Use special attack");
            System.out.print("Choose an action: ");

            int choice = input.nextInt();

            if (choice == 1) {
                playerAttack(player, wizard);
            }
            else if (choice == 2) {
                specialAttack(player, wizard);
            }
            else {
                System.out.println("Invalid choice!");
                continue;
            }
            if (wizard.getHealth() > 0) {
                wizardAttack(player, wizard);
            }
        }
    }

    public void playerAttack(Player player, Wizard wizard) {

        int hitChance = rand.nextInt(100) + 1;

        if (hitChance <= player.getAccuracy()) {

            int damage = rand.nextInt(10) + player.getStrength();

            wizard.takeDamage(damage);

            System.out.println("You hit the Wizard for " + damage + " damage!");
        }
        else {
            System.out.println("Your attack missed!");
        }
    }

    public void specialAttack(Player player, Wizard wizard) {

        int damage = rand.nextInt(15) + player.getStrength();

        wizard.takeDamage(damage);

        System.out.println("You used your special attack!");
        System.out.println("You dealt " + damage + " damage!");
    }

    public void wizardAttack(Player player, Wizard wizard) {

        int hitChance = rand.nextInt(100) + 1;

        if (hitChance <= 70) {

            int damage = rand.nextInt(10) + 5;

            player.takeDamage(damage);

            System.out.println("The Wizard hit you for " + damage + " damage!");
        }
        else {
            System.out.println("The Wizard's spell missed!");
        }
    }
}



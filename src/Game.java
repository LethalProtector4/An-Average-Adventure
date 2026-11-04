import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Player player = new Player(chooseCharacterType(sc));
		
		
		System.out.println(player.getType());
	}
	
	public static CharacterType chooseCharacterType(Scanner sc) {
		int choice;
		while (true) {
			try {
				System.out.println("What character do you want to be?\n1. Fighter\n2. Barbarian\n3. Rogue");
				choice = sc.nextInt();
				
				if (choice < 1 || choice > 3) {
					System.out.println("Must pick a number between 1 and 3.");
					continue;
				}
				
				switch (choice) {
				case 1:
					return CharacterType.FIGHTER;
				case 2:
					return CharacterType.BARBARIAN;
				case 3:
					return CharacterType.ROGUE;
				default:
					return null;
				}
				
			} catch (Exception e) {
				System.out.println("You must pick a number!");
				sc.nextLine();
			}
		}
	}
}

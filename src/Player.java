public class Player {

	private int health;
	private int baseStrength;
	private int baseDefense;
	private int baseAgility;
	
	private CharacterType type;
	
	private int tempStrengthBonus;
	private int tempDefenseBonus;
	private int tempAgilityBonus;
	
	private Weapon equippedWeapon;
	private Armor equippedArmor;
	
	public Player(CharacterType type) {
		this.health = 100;
		this.baseStrength = type.getStrength();
		this.baseDefense = type.getDefense();
		this.baseAgility = type.getAgility();
		
		this.type = type;
		
		this.equippedWeapon = type.getStartingWeapon();
		this.equippedArmor = type.getStartingArmor();
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getStrength() {
		return baseStrength + equippedWeapon.getStrengthMod();
	}
	
	public int getDefense() {
		return baseDefense + equippedArmor.getDefenseMod();
	}
	
	public int getAgility() {
		return baseAgility + equippedWeapon.getAgilityMod() + equippedArmor.getAgilityMod();
	}
	
	public CharacterType getType() {
		return type;
	}
}

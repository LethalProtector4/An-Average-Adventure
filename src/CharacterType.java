public enum CharacterType {
	// Possible character types and their base stats the player can choose from
	FIGHTER(0, 0, 0,
			new Weapon("Shortsword", 10, 5, 0),
			new Armor("Armor", 10, 5, 0)),
	BARBARIAN(0, 0, 0,
			new Weapon("Battleaxe", 10, 8, -2),
			new Armor("Armor", 10, 5, 0)),
	ROGUE(0, 0, 0,
			new Weapon("Dagger", 10, 3, 3),
			new Armor("Armor", 10, 5, 0));
	
	private int strength;
	private int defense;
	private int agility;
	private Weapon startingWeapon;
	private Armor startingArmor;
	
	private CharacterType(int strength, int defense, int agility, Weapon startingWeapon, Armor startingArmor) {
		this.strength = strength;
		this.defense = defense;
		this.agility = agility;
		this.startingWeapon = startingWeapon;
		this.startingArmor = startingArmor;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public Weapon getStartingWeapon() {
		return startingWeapon;
	}
	
	public Armor getStartingArmor() {
		return startingArmor;
	}
}

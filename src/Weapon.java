public class Weapon extends Item {
	private int strengthMod;
	private int agilityMod;
	
	public Weapon(String name, int cost, int strengthMod, int agilityMod) {
		super(name, cost);
		this.strengthMod = strengthMod;
		this.agilityMod = agilityMod;
	}
	
	public int getStrengthMod() {
		return strengthMod;
	}
	public int getAgilityMod() {
		return agilityMod;
	}
}
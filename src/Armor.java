public class Armor extends Item {
	private int defenseMod;
	private int agilityMod;
	
	public Armor(String name, int cost, int defenseMod, int agilityMod) {
		super(name, cost);
		this.defenseMod = defenseMod;
		this.agilityMod = agilityMod;
	}
	
	public int getDefenseMod() {
		return defenseMod;
	}
	public int getAgilityMod() {
		return agilityMod;
	}
}

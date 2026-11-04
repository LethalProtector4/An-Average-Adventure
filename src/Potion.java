public class Potion extends Item {
	private enum PotionType { 
		HEALTH, STRENGTH, DEFENSE, AGILITY
	}
	
	private PotionType type;
	private int buff;
	private int duration;
	
	public Potion(String name, int cost, PotionType type, int buff, int duration) {
		super(name, cost);
		this.type = type;
		this.buff = buff;
		this.duration = duration;
	}

	public PotionType getType() {
		return type;
	}

	public int getBuff() {
		return buff;
	}

	public int getDuration() {
		return duration;
	}
}

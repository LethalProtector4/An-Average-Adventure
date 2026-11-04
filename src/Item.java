public abstract class Item {
	private String name;
	private int cost;
	
	protected Item(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}
}

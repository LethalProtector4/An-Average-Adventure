public abstract class Room {
    private String name;
    private String description;
    

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void interactWith(Player player);
}

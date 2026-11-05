public class ThroneRoom extends Room{

    public ThroneRoom() {
        super("Throne Room", "The room where the king resides.");
    }

    @Override
    public void interactWith(Player player) {
        enter();
    }

    public void enter() {
        System.out.println("You have entered the Throne Room.");
    }
    
}

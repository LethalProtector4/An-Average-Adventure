public class ThroneRoom extends Room{
    private Wizard wizard;
    public ThroneRoom(Wizard wizard) {
        super("Throne Room", "The final chamber where the Evil Wizard awaits.");
        this.wizard = wizard;
    }

    @Override
    public void interactWith(Player player) {
        System.out.println("You enter the Throne Room.");
        System.out.println("The Evil Wizard stands before you!");
        System.out.println("Prepare for the final battle!");
        startCombat(player, wizard);

    }

    public void enter() {
        System.out.println("You have reached the final room!");
    }
    
}

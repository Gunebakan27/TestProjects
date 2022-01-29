package SpaceChallenge;

public interface SpaceShip {

	public boolean launch();
	
	public boolean land();
	
	public boolean canCary(Item item);
	
	public int carry(Item item);
}

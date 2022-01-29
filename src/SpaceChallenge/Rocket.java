package SpaceChallenge;

public class Rocket implements SpaceShip{
	int cost;
	int weight;
	int maxWeight;
	int cargo=weight;
	double chanceOfExplosion;
	double chanceOfCrash;
	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCary(Item item) {
		return this.cargo+item.weight<=maxWeight;
	}

	@Override
	public int carry(Item item) {
		this.cargo+=item.weight;
		return this.cargo;
	}

}

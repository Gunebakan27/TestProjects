package SpaceChallenge;

public class U2 extends Rocket {
public U2(){
	cost=100;
	weight=18000;
	maxWeight=29000;
	chanceOfExplosion=0.0;
	chanceOfCrash=0.0;
	cargo=weight;
	}
	
	@Override
	public boolean launch() {
		int random = (int)(Math.random() * 100 + 1);
        this.chanceOfExplosion = 0.04 * (this.cargo - this.weight) / (this.maxWeight - this.weight);

//		double chanceOfExplosion=0.04*cargo/(maxWeight-weight);
		
		
		return this.chanceOfExplosion <= random;
	}

	@Override
	public boolean land() {
		int random = (int)(Math.random() * 100 + 1);
        this.chanceOfCrash = 0.08 * (this.cargo - this.weight) / (this.maxWeight - this.weight);
		
        return this.chanceOfCrash <= random;
	}

}

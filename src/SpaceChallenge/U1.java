package SpaceChallenge;

import java.util.ArrayList;

public class U1 extends Rocket{
	public U1() {
	cost=100;
	weight=10000;
	maxWeight=18000;
	cargo=weight;
	chanceOfExplosion=0.0;
	chanceOfCrash=0.0;
	}
	
	@Override
	public boolean launch() {
		 int random = (int)(Math.random() * 100 + 1);
		this.chanceOfExplosion=0.05*(this.cargo-this.weight)/(this.maxWeight-this.weight);
//      System.out.println("rocket weight = " + this.cargo + "; maxWeight = " + this.maxWeight
//      + " chance = " + 0.05 * (this.cargo - this.weight) / (this.maxWeight - this.weight));
//System.out.println("launchExplosion = " + this.chanceOfExplosion + "; Random Number = " + random);
		
		return this.chanceOfExplosion<=random;
	}

	@Override
	public boolean land() {
		int random = (int)(Math.random() * 100 + 1);
		this.chanceOfCrash=0.01*(this.cargo-this.weight)/(this.maxWeight-this.weight);
		
		return chanceOfCrash<=random;
	}

}

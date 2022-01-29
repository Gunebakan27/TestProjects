package maceraOyunuVideo;

import java.util.Scanner;

public abstract class BattleLoc extends Location{
	protected Obstacle obstacle;
	protected String award;
	Scanner scan=new Scanner(System.in);

	public BattleLoc(Player player, String name,Obstacle obstacle, String award) {
		super(player);
		this.obstacle=obstacle;
		this.name=name;
		this.award=award;
	}
public boolean getLocation() {
	int obsCount=obstacle.count();
	System.out.println("Suan buradasiniz : "+this.getName());
	System.out.println("Burada "+obsCount+" tane "+obstacle.getName()+" yasiyor ! ");
	System.out.println("<S>avas veya <K>ac");
	String selCase=scan.nextLine();
	
	if(selCase.equalsIgnoreCase("S")) {
		if(combat(obsCount)) {
			System.out.println(this.getName()+" bölgesindeki tüm düsmanlari yendiniz..");
			if(this.award.equalsIgnoreCase("food")&&player.getInv().isFood()==false) {
				System.out.println(this.award+" kazandiniz");
				player.getInv().setFood(true);
			}else if (this.award.equalsIgnoreCase("water")&&player.getInv().isWater()==false) {
				System.out.println(this.award+" kazandiniz");
				player.getInv().setWater(true);
			}else if (this.award.equalsIgnoreCase("water")&&player.getInv().isFirewood()==false) {
				System.out.println(this.award+" kazandiniz");
				player.getInv().setFirewood(true);
			}
			return true;
		}if(player.getHealthy()<=0) {
			System.out.println("Öldünüz !");
			return false;		
		}
	}
	
	return true;
}
public boolean combat(int obsCount) {
	for(int i=0;i<obsCount;i++) {
		int defObsHealth=obstacle.getHealth();
		playerStats();
		enemyStats();
		while (player.getHealthy()>0&&obstacle.getHealth()>0) {
			System.out.println("<V>ur veya <K>ac : ");
			String selCase=scan.nextLine();
			if(selCase.equalsIgnoreCase("V")) {
				System.out.println("Siz vurdunuz ! ");
				obstacle.setHealth(obstacle.getHealth()-player.getTotalDamage());
				afterHit();
				if(obstacle.getHealth()>0) {
					System.out.println();
					System.out.println("Canavar size vurdu ! ");
					player.setHealthy(player.getHealthy()-(obstacle.getDamage()-player.getInv().getArmor()));
					afterHit();
				}
			
			}else {
				return false;
			}
			
		}if(obstacle.getHealth()<player.getHealthy()) {
			System.out.println("Düsmani yendiniz..");
			player.setMoney(player.getMoney()+obstacle.getAward());
			System.out.println("Güncel paraniz : "+player.getMoney());
			obstacle.setHealth(defObsHealth);		
	
		}else {
			return false;
		}
		System.out.println("-------------------------------");
	}
	return true;
}
public void afterHit() {
	System.out.println("Oyuncu cani : "+player.getHealthy());
	System.out.println(obstacle.getName()+" cani: "+obstacle.getHealth());
	System.out.println();
}
public void enemyStats() {
	System.out.println("\n"+obstacle.getName()+"  degerleri\n-------------- ");
	System.out.println("Can : "+obstacle.getHealth());
	System.out.println("Hasar : "+obstacle.getDamage());
	System.out.println("Ödül : "+obstacle.getAward());
}
public void playerStats() {
	System.out.println("Oyuncu degerleri\n------------");
	System.out.println("Can : "+player.getHealthy());
	System.out.println("Hasar : "+player.getTotalDamage());
	System.out.println("Para : "+player.getMoney());
	if(player.getInv().getDamage()>0) {
		System.out.println("Silah : "+player.getInv().getaName());
	}
}

}

package maceraOyunuVideo;

public class SaveHaus extends NormalLoc {

	public SaveHaus(Player player) {
		super(player, "Guvenli Ev");
	
	}
public boolean getLocation(){
	player.setHealthy(player.getrHealty());
	System.out.println("Can yenilendi");
	System.out.println("Suan güvenli evdesiniz..");
	return true;
}
}

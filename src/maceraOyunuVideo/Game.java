package maceraOyunuVideo;

import java.util.Scanner;

public class Game {
Player player;
Location location;
Scanner scan=new Scanner(System.in);

public void login() {
	System.out.println("Macera Oyununa Hosgeldiniz!");
	System.out.println("Oyuna baslamadan önce isminizi giriniz");
//	String playerName=scan.nextLine();
	player=new Player("a");
	player.selectCha();
	start();
	
}

public void start() {
while (true) {
	System.out.println();
	System.out.println("=================");
	System.out.println();
	System.out.println("Lütfen bir yer seciniz : ");
	System.out.println("1- Güvenli Ev ---> Size ait güvenli bir mekan");
	System.out.println("2- Magara ---> Belki Zombi cikabilir");
	System.out.println("3- Orman ---> Vampi cikabilir");
	System.out.println("4- Nehir --> Ayi cikabilir");
	System.out.println("5- Magaza --> Silah veya zurh alabilirsiniz");
	int selLoc=scan.nextInt();
	while (selLoc<1||selLoc>5) {
		System.out.println("Lütfen gecerli bir sayi giriniz");
		selLoc=scan.nextInt();
		
	}
	switch (selLoc) {
	case 1:
		location=new SaveHaus(player);
		
		break;
	case 2:
		location=new Cave(player);
		
		break;
	case 3:
		location=new Forest(player);
		
		break;
	case 4:
		location=new River(player);
		
		break;
	case 5:
		location=new ToolStore(player);
		
		break;

	default:
		location=new SaveHaus(player);
	}
		if(location.getClass().getName().equalsIgnoreCase("SaveHaus")) {
			if(player.getInv().isFirewood()&&player.getInv().isFood()&&player.getInv().isWater()) {
		System.out.println("Tebrikler oyunu kazandiniz..");
		break;
	}
		}
	if(!location.getLocation()) {
		System.out.println("Oyun Bitti");
		break;
	}
}
}

}

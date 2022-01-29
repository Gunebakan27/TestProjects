package maceraOyunuVideo;

import java.util.Scanner;

public class ToolStore extends NormalLoc {
Scanner scan=new Scanner(System.in);
	public ToolStore(Player player) {
		super(player, "Magaza");	
	}
public boolean getLocation() {
	System.out.println("Para : "+player.getMoney());
	System.out.println("1. Silahlar");
	System.out.println("2. Zirhlar");
	System.out.println("3. Cikis");
	System.out.println("Seciminiz : ");
	int selTool=scan.nextInt();
	int selItemID;
	switch (selTool) {
	case 1:
		selItemID=  weaponMenu();
		buyWeapon(selItemID);
		break;
	case 2:
		selItemID=armorMenu();
		buyArmor(selItemID);
		break;

	default:
		break;
	}
	
	return true;
}
public void buyArmor(int itemID) {
	int avoid=0, price=0;
	String aName=null;
	if(itemID>0||itemID<4) {
	switch (itemID) {
	case 1:
		avoid=1;
		aName="Hafif Zirh";
		price=15;
		break;
	case 2:
		avoid=3;
		aName="Orta Zirh";
		price=25;
		break;
	case 3:
		avoid=5;
		aName="Agir Zirh";
		price=40;
		break;
	case 4:
		System.out.println("Cikis yapiliyor");

	default:
//		System.out.println("Gecersiz islem !");
		break;
	}	
	if (price>0) {
		
	if(player.getMoney()>=price) {
		player.getInv().setArmor(avoid);;
		player.getInv().setaName(aName);;
		player.setMoney(player.getMoney()-price);
		System.out.println(aName+" satin aldiniz, Engellenen hasar : "+player.getInv().getArmor());
		System.out.println("Kalan Para : "+player.getMoney());
	}else {
		System.out.println("Para yetersiz");
	}}

	}
	
}
public  int armorMenu() {
	System.out.println("1. Hahif Zirh <Para: 15 - Hasar : 1>");
	System.out.println("2. Orta Zirh <Para: 25 - Hasar : 3>");
	System.out.println("3. Agir Zirh <Para: 40 - Hasar : 5>");
	System.out.println("4. Cikis ");
	System.out.println("Zirh seciniz : ");
	int selArmorID=scan.nextInt();
	
	return selArmorID;

}
public void buyWeapon(int itemID) {
	int damage=0, price=0;
	String wName=null;
	if(itemID>0||itemID<4) {
	switch (itemID) {
	case 1:
		damage=2;
		wName="Tabanca";
		price=25;
		break;
	case 2:
		damage=3;
		wName="Kilic";
		price=35;
		break;
	case 3:
		damage=7;
		wName="Tüfek";
		price=45;
		break;
	case 4:
		System.out.println("Cikis yapiliyor");

	default:
		System.out.println("Gecersiz islem !");
		break;
	}	
	if (price>0) {
		
	if(player.getMoney()>price&&price>0) {
		player.getInv().setDamage(damage);
		player.getInv().setwName(wName);
		player.setMoney(player.getMoney()-price);
		System.out.println(wName+" satin aldiniz, önceki hasar : "+player.getDamage()+", Yeni hasar : "+player.getTotalDamage());
		System.out.println("Kalan Para : "+player.getMoney());
	}else {
		System.out.println("Para yetersiz");
	}}

	}
	
}
public int weaponMenu() {
	System.out.println("1. Tabanca <Para: 25 - Hasar : 2>");
	System.out.println("2. Kilic <Para: 35 - Hasar : 3>");
	System.out.println("1. Tüfek <Para: 45 - Hasar : 7>");
	System.out.println("4. Cikis ");
	System.out.println("Silah seciniz : ");
	int selWeapon=scan.nextInt();
	
	return selWeapon;
}
}

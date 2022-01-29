package kitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class KitapMethod {
	static Scanner scan=new Scanner(System.in);
	static int kitapNo=1000;

	public static void menu(List<Kitap>liste) {
		System.out.println("========= KİTAP PROGRAMI =============\r\n"
				+ "		1: Kitap ekle\r\n"
				+ "		2: Numara ile kitap sil\r\n"
				+ "		3: Tüm kitapları listele\r\n"
				+ "		4: Bitir");
		System.out.println("lütfen yapmak istediginiz islemi seciniz..");
		int secim=scan.nextInt();
		switch (secim) {
		case 1:
			kitapEkle(liste);		
			break;
		case 2:
			noIleSil(liste);
			break;
		case 3:
			listele(liste);
			break;
		case 4:
			bitir();
			break;
		default:
			System.out.println("Yanlis giris yapildi, tekrar deneyiniz..");
			break;
		}
	}
	private static void listele(List<Kitap> liste) {

		for (Kitap k : liste) {
			System.out.println(k.toString());
		}menu(liste);
	}
	private static void noIleSil(List<Kitap> liste) {

		System.err.println("Silinecek Kitap NO: ");
		int silNo=scan.nextInt();
		for (Kitap k : liste) {
			if(k.getNo()==silNo) {
				liste.remove(k);
				menu(liste);
			}
		}System.out.println(silNo+" ait kitap bulunamadi");
		menu(liste);
	}
	private static void kitapEkle(List<Kitap> liste) {
		System.out.println("Kitap ismi giriniz..");
		scan.nextLine();//dummy bos scan objesi
		String kitapAdi=scan.nextLine();
		
		System.out.println("Yazar ismi giriniz..");
	
		String yazarAdi=scan.nextLine();
		
		System.out.println("Yayin yilini giriniz..");
		int yayinYili=scan.nextInt();
		
		System.out.println("Fiyatini giriniz..");
		Double fiyat=scan.nextDouble();
		Kitap kitap=new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinYili, fiyat);
		liste.add(kitap);
	
		System.out.println(kitap.toString()+"\nGirdiginiz kitap bilgileri kaydedilmistir..");
		menu(liste);
	}
	public static void bitir() {
System.out.println("Yine bekleriz..");
}
public static void kitaplarEkle(List<Kitap>liste) {
	Kitap kitap1=new Kitap(++kitapNo, "Sefiller","Victor Hugo", 1890, 100);
	Kitap kitap2=new Kitap(++kitapNo, "aliler","tor ugo", 1890, 100);
	Kitap kitap3=new Kitap(++kitapNo, "veliler","Vict go", 1890, 100);
	Kitap kitap4=new Kitap(++kitapNo, "deliler","Vicr Hgo", 1890, 100);
	Kitap kitap5=new Kitap(++kitapNo, "geriler","ictr ugo", 1890, 100);
	
	liste.add(kitap1);
	liste.add(kitap2);
	liste.add(kitap3);
	liste.add(kitap4);
	liste.add(kitap5);
	
}
	
}

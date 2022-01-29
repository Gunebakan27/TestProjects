package okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/*
BİR OKUL YÖNETİM PLATFORMU KODALYINIZ.
1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
	Kayıtlarda şu bilgiler olabilmelidir.
	Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
	Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
	Aşağıdaki gibi bir menü gösterilsin.
====================================
 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
====================================
 1- ÖĞRENCİ İŞLEMLERİ
 2- ÖĞRETMEN İŞLEMLERİ
 Q- ÇIKIŞ
3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
============= İŞLEMLER =============
	 1-EKLEME
	 2-ARAMA
	 3-LİSTELEME
	 4-SİLME
	 5-ANA MENÜ
	 Q-ÇIKIŞ
SEÇİMİNİZ:
4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
	Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.
*/

public class Islemler {
static List<Kisi>ogrenciList=new ArrayList<>();
static List<Kisi>ogretmenList=new ArrayList<>();

static Scanner scan=new Scanner(System.in);

static String kisiTuru;

public static void anaMenu() {
	System.out.println("====================================\r\n"
			+ " ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\r\n"
			+ "====================================\r\n"
			+ " 1- ÖĞRENCİ İŞLEMLERİ\r\n"
			+ " 2- ÖĞRETMEN İŞLEMLERİ\r\n"
			+ " Q- ÇIKIŞ");
	
	System.out.println("Lütfen yapmak istediginiz islemi seciniz..");
	String secim=scan.nextLine();
	
	switch (secim) {
	case "1":
		kisiTuru="OGRENCI";
		islemMenusu();
		break;
	case "2":
		kisiTuru="OGRETMEN";
		islemMenusu();
		break;
	case "Q":
		cikis();
		break;
	default:
		System.out.println("Hatali giris yaptiniz..");
		break;
	}
}

private static void cikis() {
System.out.println("Yine bekleriz..");	
}

private static void islemMenusu() {
System.out.println("============= İŞLEMLER =============\r\n"
		+ "	 1-EKLEME\r\n"
		+ "	 2-ARAMA\r\n"
		+ "	 3-LİSTELEME\r\n"
		+ "	 4-SİLME\r\n"
		+ "	 5-ANA MENÜ\r\n"
		+ "	 0-ÇIKIŞ");
System.out.println("Yapmak istediginiz islemi seciniz..");

int secim=scan.nextInt();

switch (secim) {
case 0:
	anaMenu();
	break;
case 1:
	ekleme();
	islemMenusu();
	break;
case 2:
	arama();
	islemMenusu();
	break;
case 3:
	listeleme();
	islemMenusu();
	break;
case 4:
	silme();
	islemMenusu();
	break;
case 5:
	anaMenu();
	break;
default:
	System.out.println("Hatali giris yaptiniz..");
	islemMenusu();
	break;
}
	
}

private static void silme() {
	if(kisiTuru.equalsIgnoreCase("OGRENCI")) {
		System.out.println("Silmek istediginiz ogrencinin kimlik nosunu giriniz : ");
		String kimlikNoBul=scan.next();	
		for (Kisi o:ogrenciList) {
			if (o.getKimlikNo().equalsIgnoreCase(kimlikNoBul)) {
				ogrenciList.remove(o);
				System.out.println("Ögrenci basariyla silinmistir..");
}}	}	
}

private static void listeleme() {
if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
	for(Kisi o:ogrenciList) {
		System.out.println(o.toString());
	}
}
if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {
	for(Kisi o:ogretmenList) {
		System.out.println(o.toString());
	}
}
}

private static void arama() {
	System.out.println(kisiTuru);
	if(kisiTuru.equalsIgnoreCase("OGRENCI")) {
		System.out.println("Aramak istediginiz ogrencinin kimlik nosunu giriniz : ");
		String kimlikNoBul=scan.next();	
		for (Kisi o:ogrenciList) {
			if (o.getKimlikNo().equalsIgnoreCase(kimlikNoBul)) {
				System.out.println(o.toString());
}}}

	if(kisiTuru.equalsIgnoreCase("OGRETMEN")) {
		System.out.println("Aramak istediginiz ogretmenin kimlik nosunu giriniz : ");
		String kimlikNoBul=scan.next();	
		for (Kisi o:ogretmenList) {
			if (o.getKimlikNo().equalsIgnoreCase(kimlikNoBul)) {
				System.out.println(o.toString());
}}}}

private static void ekleme() {
	
if(kisiTuru.equalsIgnoreCase("OGRENCI")){
	Kisi kisi=new Kisi();
	
	System.out.println("Ogrenci Adi Soyadi : ");
	scan.nextLine();
	kisi.setAdSoyad(scan.nextLine());
	
	
	System.out.println("Ogrenci Kimlik no : ");
	String kimlikNo=scan.next();
	System.out.println("Ogrenci yasi : ");
	int yas=scan.nextInt();
	System.out.println("Ogrenci no : ");
	scan.nextLine();
	String ogrNo=scan.nextLine();
	System.out.println("Ogrenci sinifi : ");
	String sinif=scan.next();
	Ogrenci ogr1=new Ogrenci(kisi.getAdSoyad(), kimlikNo, yas, ogrNo, sinif);
	ogrenciList.add(ogr1);
	System.out.println("Ogrenci kaydi tamamlanmistir..\nYeni Ogrenci listesi : ");
	for(int i=0;i<ogrenciList.size();i++) {
		System.out.println((i+1)+". "+ogrenciList.get(i).toString());
	}}
if (kisiTuru.equalsIgnoreCase("OGRETMEN")) {
	System.out.println("Ogretmen Adi Soyadi : ");
	scan.nextLine();
	String adSoyad=scan.nextLine();
	System.out.println("Sicil no : ");
	String sicilNo=scan.nextLine();
	System.out.println("Ogretmeni yasi : ");
	int yas=scan.nextInt();
//	scan.nextLine();
	System.out.println("Bölümü : ");
	String bolum=scan.nextLine();
	System.out.println("Ogretmen Kimlik no : ");
	String kimlikNo=scan.nextLine();
	Ogretmen ogretmen=new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);
	ogretmenList.add(ogretmen);
	System.out.println("Ogretmen kaydi tamamlanmistir..\nYeni Ogretmen listesi : ");
	for(int i=0;i<ogretmenList.size();i++) {
		System.out.println((i+1)+". "+ogretmenList.get(i).toString());
	}
}}}

package BankaProjesi2;

import java.util.Scanner;

public class Calisan extends Personel {

    Data dc = new Data();
//    String systemUserName;
//    String systemPassword;

	public Calisan() {
    }

    public Calisan(String name, String departman, double price, int workHours, int kidem, String systemUserName, String systemPassword) {
        super(name, departman, price, workHours, kidem,systemUserName,systemPassword);
    }

    public void musteriEkle() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Müşteri isim ve soyisim giriniz : ");
        String isim = scan.next();
        System.out.print("Müşteri hesap numarası giriniz : ");
        String hesapno = scan.next();
        System.out.print("Müşteri şifresi giriniz : ");
        String sifre = scan.next();

        scan.next();
        System.out.print("Müşteri başlangıç bakiyesi giriniz : ");
        double baslangicBakiye = scan.nextDouble();

        Musteri a = new Musteri(isim, hesapno, sifre, baslangicBakiye);
        dc.setmusteriListesi(dc.getmusteriListesi()).add(a);
        System.out.println("Musteri bilgileri basari ile eklendi");

    }
}


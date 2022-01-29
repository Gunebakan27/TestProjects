package BankaProjesi2;

import java.util.Scanner;

public class Yonetici  {

    Data dy = new Data();
    String name;
    String departman;
    double price;
    int workHours;
    int kidem;
    String systemUserName;
    String systemPassword;
   

	public Yonetici() {
    }

    public Yonetici(String name, String departman, double price, int workHours, int kidem, String systemUserName, String systemPassword) {
//        super(name, departman, price, workHours, kidem, systemUserName, systemPassword);
//        this.systemUserName=systemUserName;
//        this.systemPassword=systemPassword;
        this.name = name;
        this.departman = departman;
        this.price = price;
        this.workHours = workHours;
        this.kidem = kidem;
        this.systemUserName = systemUserName;
        this.systemPassword = systemPassword;
    }

    public void istenCikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Çıkarmak istediğiniz çalışan isimi giriniz");
        String isim = scan.nextLine();
       

        for (Calisan c : dy.getCalisanListesi()) {
            if (dy.getCalisanListesi().equals(isim)) {
                dy.setCalisanListesi(dy.getCalisanListesi()).remove(c);
            }
        }
    }

    public void iseAlma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Çalışan isim ve soyisim giriniz");
        String name = scan.nextLine();
        System.out.println("Çalışan departman giriniz");
        String departman = scan.nextLine();
        System.out.println("Çalışan maaş giriniz");
        double price = scan.nextDouble();
        System.out.println("Çalışan haftalık çalışma saati giriniz");
        int workHours = scan.nextInt();
        System.out.println("Çalışan kıdem giriniz");
        int kidem = scan.nextInt();
        System.out.println("Çalışan sistemi kullanıcı adı giriniz");
        String systemUserName = scan.nextLine();
        System.out.println("Çalışan sistemi şifresi giriniz");
        String systemPassword = scan.nextLine();
        Calisan c = new Calisan(name, departman, price, workHours, kidem, systemUserName, systemPassword);
        dy.setCalisanListesi(dy.getCalisanListesi()).add(c);
        System.out.println("Çalışan bilgileri basari ile eklendi");
    }
}


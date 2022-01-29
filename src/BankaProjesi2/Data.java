package BankaProjesi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static BankaProjesi2.Main.scan;


public class Data {

    private static List<Musteri> musteriListesi = new ArrayList<>();
static List<Yonetici> yoneticiListesi = new ArrayList<>();
    private static List<Calisan> calisanListesi = new ArrayList<>();

    public Data() {
    }

    public List<Yonetici> getYoneticiListesi() {
        return yoneticiListesi;
    }

    public void ekleYonetici(List<Yonetici> yoneticiListesi) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yönetici isim ve soyisim giriniz");
        String name = scan.nextLine();
        System.out.println("Yönetici departman giriniz");
        String departman = scan.nextLine();
        System.out.println("Yönetici maaş giriniz");
        double price = scan.nextDouble();
        System.out.println("Yönetici haftalık çalışma saati giriniz");
        int workHours = scan.nextInt();
        System.out.println("Yönetici kıdem giriniz");
        int kidem = scan.nextInt();
        System.out.println("Yönetici sistemi kullanıcı adı giriniz");
        String systemUserName = scan.next(); 
        System.out.println("Yönetici sistemi şifresi giriniz");
        String systemPassword = scan.next();  
        Yonetici y = new Yonetici(name, departman, price, workHours, kidem, systemUserName, systemPassword);
        yoneticiListesi.add(y);
        System.out.println(yoneticiListesi.get(0).systemUserName);
        System.out.println(yoneticiListesi.get(0).departman);
        System.out.println("Yönetici bilgileri basari ile eklendi");

        Data.yoneticiListesi = yoneticiListesi;
       
    }

    public List<Calisan> getCalisanListesi() {
        return calisanListesi;
    }

    public List<Calisan> setCalisanListesi(List<Calisan> calisanListesi) {

        //scan.next();
        System.out.println("Çalışan isim ve soyisim giriniz");
        String name = scan.next();
        System.out.println("Çalışan departman giriniz");
        String departman = scan.next();
        System.out.println("Çalışan maaş giriniz");
        double price = scan.nextDouble();
        System.out.println("Çalışan haftalık çalışma saati giriniz");
        int workHours = scan.nextInt();
        System.out.println("Çalışan kıdem giriniz");
        int kidem = scan.nextInt();
        System.out.println("Çalışan sistemi kullanıcı adı giriniz");
        String systemUserName = scan.next();
        System.out.println("Çalışan sistemi şifresi giriniz");
        String systemPassword = scan.next();
        Calisan c = new Calisan(name, departman, price, workHours, kidem, systemUserName, systemPassword);
        calisanListesi.add(c);
        System.out.println("Çalışan bilgileri basari ile eklendi");
        Data.calisanListesi = calisanListesi;
        return calisanListesi;
    }

    public List<Musteri> getmusteriListesi() {
        return musteriListesi;
    }

    public List<Musteri> setmusteriListesi(List<Musteri> musteriListesi) {

        Data.musteriListesi = musteriListesi;
        return musteriListesi;
    }
}


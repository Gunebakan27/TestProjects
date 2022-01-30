package BankaProjesi2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Calculator.Downloads.SqLConnect;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static List<Yonetici> yoneticiList = new ArrayList<>();
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Main m = new Main();
        SqLConnect sql=new SqLConnect();
        sql.kodRun();
        sql.tabloSil("Rehber");
//        m.ekranCiktisi();
    }

    public void ekranCiktisi() {
        Yonetici y1 = new Yonetici();
        Calisan c1 = new Calisan();
        Musteri m1 = new Musteri();
        Data d1 = new Data();

        while (true) {

            System.out.println("Main Menu\n 1. Yonetici Girisi\n 2. Calisan Girisi\n 3. Musteri Girisi\n 0.Cikis ");
            System.out.println("Seçiminiz :");
            int a = scan.nextInt();

            if (a == 0) {
                System.out.println("Çıkış yapılıyor.");
                break;
            } else if (a == 1) {
                System.out.println("Yeni yönetici profili oluşturmak için 1'e \nvar olan kullanıcı adı ve şifrenizle giriş yapmak için 2'ye basınız");
                int b = scan.nextInt();

                switch (b) {
                    case 1:

                        d1.ekleYonetici(yoneticiList);
                        break;
                    case 2:
                    	Scanner scan = new Scanner(System.in);
                        System.out.println("Kullanıcı adınızı giriniz : ");
                        String user1 = scan.next();
                        // scan.next();
                        System.out.println("Parolanızı giriniz : ");
                        String parola1 = scan.next();
                        System.out.println(Data.yoneticiListesi.get(0).systemUserName);
                        for (int i=0;i<d1.getYoneticiListesi().size();i++) {
                            if (d1.getYoneticiListesi().get(i).systemUserName.equalsIgnoreCase(user1) && 
                            		d1.getYoneticiListesi().get(i).systemPassword.equalsIgnoreCase(parola1)) {
                                System.out.println("Giriş Başarılı. Lütfen aşağıdan yapmak istediğiniz işlemi  seçiniz");
                                System.out.println("\n1.Calisan isten cikarma  ");
                                System.out.println("2. Calisan ise alma");
                                System.out.println("3. Musteri bilgileri goruntule");
                                System.out.println("4. Ana Menü");
                                System.out.println("5. Çıkış");
//                                scan.next();
                                int c = scan.nextInt();
                                switch (c) {
                                    case 1:
                                        y1.istenCikarma();
                                        break;
                                    case 2:
                                        y1.iseAlma();
                                        break;
                                    case 3:
                                        m1.musteriBilgileriGoruntule();
                                        break;
                                    case 4:
                                        System.out.println("Ana menüye dönülüyor...");
                                        break;
                                    case 5:
                                        System.exit(0);
                                }
                            } else {
                                System.out.println("Giriş başarısız.");
                                break;
                            }
                        }
                        break;
                }
            } else if (a == 2) {
                System.out.println("Yeni çalışan profili oluşturmak için 1'e \nKullanıcı adı ve şifrenizle giriş yapmak için 2'ye basınız");
                int d = scan.nextInt();

                switch (d) {
                    case 1:
                        d1.setCalisanListesi(d1.getCalisanListesi());
                        break;
                    case 2:
                        System.out.println("Kullanıcı adınızı giriniz : ");
                        String user2 = scan.next();
                        //scan.next();
                        System.out.println("Parolanızı giriniz : ");
                        String parola2 = scan.next();
                        for (Calisan c2 : d1.getCalisanListesi()) {
                            if ((c2.systemUserName.equalsIgnoreCase(user2)) && (c2.systemPassword.equalsIgnoreCase(parola2))) {
                                System.out.println("Giriş Başarılı. Lütfen aşağıdan yapmak istediğiniz işlemi  seçiniz");
                            } else {
                                System.out.println("Giriş başarısız.");
                                break;
                            }
                            System.out.println("\n1.Musteri ekle  ");
                            System.out.println("2. Ana Menü");
                            //  scan.next();
                            int e = scan.nextInt();
                            switch (e) {
                                case 1:
                                    c1.musteriEkle();
                                    break;
                                case 2:
                                    System.out.println("Ana menüye dönülüyor...");
                                    break;
                            }
                        }
                        break;
                }
            } else if (a == 3) {
                System.out.println("Hesap numaranızı giriniz : ");
                String hesNo = scan.next();
                System.out.println("Parolanızı giriniz : ");
                String parola3 = scan.next();

                for (Musteri m2 : d1.getmusteriListesi()) {
                    if ((m2.hesapno.equalsIgnoreCase(hesNo)) && (m2.sifre.equalsIgnoreCase(parola3))) {
                        System.out.println("Giriş Başarılı. Lütfen aşağıdan yapmak istediğiniz işlemi  seçiniz");
                        System.out.println("Main Menu\n 1. Bakiye Görüntüle\n 2. Para Yatir\n 3. Para Cek\n 4.Cikis ");
                        int f = scan.nextInt();
                        // scan.next();

                        switch (f) {
                            case 1:
                                m2.bakiyeGoruntule();
                                break;
                            case 2:
                                System.out.println(m2.paraYatir());
                                break;
                            case 3:
                                System.out.println(m2.paraCek());
                                break;
                            case 4:
                                System.out.println("Ana menüye dönülüyor...");
                                break;
                        }
                    } else {
                        System.out.println("Giriş başarısız.");
                        break;
                    }
                }
            } else {
                System.out.println("Listeden giriş seçiniz");
            }
        }
    }
}




package RentalCarUltimate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Transaction {

    // Getter-setter kullanılmadı çünkü veriler sadece bu classta kullanıldı.
    private String alinacakSehir;
    private Date alinacakGun;
    private double alisSaati;
    private Date teslimGunu;
    private double teslimSaati;
    List<Transaction> girilenİslemler = new ArrayList<>();

    public Transaction() {
    }

    public Transaction(String alinacakSehir, Date alinacakGun, double alisSaati, Date teslimGunu, double teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.alisSaati = alisSaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }

    double topFiyat() {
        int toplam;

        // Date alıp kaç gün kiralanacağını bulacağız ve fiyatı ona göre ayarlayacağız
        long difference_In_Time
                = this.teslimGunu.getTime() - this.alinacakGun.getTime();
        int fark = (int) (TimeUnit
                .MILLISECONDS
                .toDays(difference_In_Time)
                % 365);

        toplam = (int) (Vehicle.dailyPrice * fark);

        return toplam;
    }

    void islemler() { // Kullanıcıdan alınacak tarih saat ve şehir bilgisi...
        Scanner scan = new Scanner(System.in);
        try { // Olası exceptionslara karşı try-catch kullanıldı.
            System.out.print("Almak istediğiniz şehir : ");
            String city = scan.next();

            // Bunu internetten çarptım :)
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println("Alış Tarihi şu şekilde girin (gg.aa.yy):");
            String alım = scan.next();
            if (null != alım && alım.trim().length() > 0) {
                this.alinacakGun = format.parse(alım);
            }
            System.out.println("Alım Saati seçin");
            double saat1 = scan.nextDouble();

            SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println("Teslim Tarihi şu şekilde girin (gg.aa.yy):");
            String teslim = scan.next();
            if (null != teslim && teslim.trim().length() > 0) {
                this.teslimGunu = format1.parse(teslim);
            }
            System.out.println("Teslim Saati seçin");
            double saat2 = scan.nextDouble();
            Transaction transaction = new Transaction(city, this.alinacakGun, saat1, this.teslimGunu, saat2);
            girilenİslemler.add(transaction);

            System.out.println("Ödemeniz gereken toplam ücret : " + topFiyat() + " TL'dir");
        } catch (Exception e) {
            System.out.println("Lütfen istenen bilgileri doğru bir şekilde girin...");
            islemler();
        }
    }

    @Override
    public String toString() {
        return "Alınacak Şehir : '" + alinacakSehir + '\'' +
                ", Alınacak Gün : " + alinacakGun +
                ", Alış Saati : " + alisSaati +
                ", Teslim Günü : " + teslimGunu +
                ", Teslim Saati : " + teslimSaati;
    }
}

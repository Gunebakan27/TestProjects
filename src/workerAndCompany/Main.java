package workerAndCompany;
import java.util.Scanner;
import java.util.concurrent.ConcurrentMap;

public class Main {


    static Company company = new Company();
    static Worker worker = new Worker();

    public static void main(String[] args) {


       menuGoster();
       worker.kullaniciKayit();
       company.sirketDondur(worker);
       worker.mailOlustur();
       worker.generateRandomPassword();
       System.out.println("Mail Adresiniz : " + worker.geteMail());
       System.out.println("Geçici Şifreniz : " + worker.getSifre());
       worker.objeOlustur();
       worker.mailGiris();
       worker.sifreKontrol();
        worker.yeniSifreOlustur();
     
    }

    static void menuGoster() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Aşağıdaki seçeneklerden birisini seçiniz : \n1-Çalışan \n2-Patron");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
            	worker.kullaniciKayit();
                break;
            case 2:
                break;
            default:
                System.out.println("Yanlış giriş yaptınız. Lütfen tekrar deneyiniz : ");
                menuGoster();
                break;
        }
    }

}


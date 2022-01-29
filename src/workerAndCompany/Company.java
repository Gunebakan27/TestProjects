package workerAndCompany;
import java.util.*;

public class Company {



    List<String> sirketler = new ArrayList<>(Arrays.asList("Bordo", "Mavi", "Kırmızı"));
    
    HashMap<String, String> sirketMap = new HashMap<>();

    void sirketDondur(Worker worker) {

        sirketMap.put("Bordo", "1- Organizasyon\n2- Finansman\n3- Strateji");
        sirketMap.put("Mavi", "1- Üretim\n2- Pazarlama\n3- Muhasebe");
        sirketMap.put("Kırmızı", "1- İnsan Kaynakları\n2- AR-Ge\n3- Hukuk");

        for (int i = 0; i < sirketler.size(); i++) {
            System.out.println((i + 1) + "- " + sirketler.get(i));
        }
        System.out.print("Listeden şirket seçiniz :");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println(sirketMap.get("Bordo"));
                worker.setSirketAdi("Bordo");
                departmanSec(worker);
                break;
            case 2:
                System.out.println(sirketMap.get("Mavi"));
                worker.setSirketAdi("Mavi");
                departmanSec(worker);
                break;
            case 3:
                System.out.println(sirketMap.get("Kırmızı"));
                worker.setSirketAdi("Kırmızı");
                departmanSec(worker);
                break;
            default:
                System.out.println("Yukarıdaki geçerli sayılardan birisini giriniz :");
                sirketDondur(worker);
                break;
        }
    }


     void departmanSec(Worker worker) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Departman Seçiniz : ");

        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                for (int i = 0; i < sirketler.size(); i++) {
                    if (worker.getSirketAdi().equals(sirketler.get(i))) {
                        worker.setDepartman(sirketMap.get(sirketler.get(i)).substring(sirketMap.get(sirketler.get(i)).
                                indexOf("1"), sirketMap.get(sirketler.get(i)).indexOf("2")));
                    }
                }
                break;
            case 2:
                for (int i = 0; i < sirketler.size(); i++) {
                    if (worker.getSirketAdi().equals(sirketler.get(i))) {
                        worker.setDepartman(sirketMap.get(sirketler.get(i)).substring(sirketMap.get(sirketler.get(i)).
                                indexOf("2"), sirketMap.get(sirketler.get(i)).indexOf("3")));
                    }
                }
                break;
            case 3:
                for (int i = 0; i < sirketler.size(); i++) {
                    if (worker.getSirketAdi().equals(sirketler.get(i))) {
                        worker.setDepartman(sirketMap.get(sirketler.get(i)).substring(sirketMap.get(sirketler.get(i)).
                                indexOf("3")));
                    }
                }
                break;
            default:
                System.out.println("Başka bir rakam seçiniz : ");
               break;

        }

    }
}




package workerAndCompany;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {

private String isim;
private String soyisim;
private String id;
private String sirketAdi;
private String departman;
private String eMail;

Company company=new Company();

    private String sifre;

    List<Worker> kullaniciList=new ArrayList<>();
    Main main=new Main();


    void kullaniciKayit(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Adınızı giriniz : ");
        isim=scan.nextLine();
        System.out.println("Soyadınızı giriniz : ");
        soyisim=scan.nextLine();
        System.out.println("TC giriniz : ");
        id=scan.nextLine();
      
    }
void objeOlustur() {
	Data data=new Data();
	for (int i = 0; i < data.isimler.size(); i++) {
		Worker worker=new Worker(data.isimler.get(i), data.Soyisimler.get(i), data.idler.get(i), data.sirketler.get(i), data.departmanlar.get(i), 
				data.isimler.get(i).toLowerCase() +"."+ data.Soyisimler.get(i).toLowerCase() +"@"+data.sirketler.get(i).toLowerCase()+".com");
		kullaniciList.add(worker);
	}
}
public Worker(){

}

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;

    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Worker(String isim, String soyisim, String id, String sirketAdi, String departman, String eMail) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.id=id;
        this.sirketAdi=sirketAdi;
        this.departman=departman;
        this.eMail=eMail;
    }


    void mailOlustur(){
        eMail=isim.toLowerCase()+"."+soyisim.toLowerCase()+"@"+getSirketAdi().toLowerCase()+".com";
    }
    void kullaniciGiris(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Mail adresinizi giriniz : ");
        String mail=scan.nextLine();
        int count=3;
        while (!mail.equals(eMail) & count>0){
            System.out.println("Yanlış girdiniz tekrar deneyiniz. Kalan hakkınız : " + count);
            count--;
        }
        if (count==0){
            System.out.println("3 Defa hatalı giriş yaptınız. Çıkışınız gerçekleştirilmiştir.");
            main.menuGoster();
        }

        System.out.println("Şifrenizi adresinizi giriniz : ");
        String yeniSifre=scan.nextLine();
        int count2=3;
        while (!sifre.equals(yeniSifre) & count2>0){
            System.out.println("Yanlış girdiniz tekrar deneyiniz. Kalan hakkınız : " + count);
            count--;
        }
        if (count==0){
            System.out.println("3 Defa hatalı giriş yaptınız. Çıkışınız gerçekleştirilmiştir.");
            main.menuGoster();
        }
    }
    public boolean isValidPassword(String password)
    {
  
        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 4)
              && (password.length() <= 8))) {
            return false;
        }
  
        // to check space
        if (password.contains(" ")) {
            return false;
        }
        if (true) {
            int count = 0;
  
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
  
                // to convert int to string
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        // for special characters
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
            return false;
        }
  
        if (true) {
            int count = 0;
  
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
  
                // type casting
                char c = (char)i;
  
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        if (true) {
            int count = 0;
  
            // checking small letters
            for (int i = 90; i <= 122; i++) {
  
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        // if all conditions fails
        return true;
    }

    void yeniSifreOlustur(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen en az bir büyük harf, en az bir küçük harf,en az bir rakam ve en az bir özel karakter olmak üzere minimum 4 maximum 8 karakterden oluşacan yeni şifrenizi giriniz. ");
        String yeniSifre=scan.nextLine();
//        boolean a=yeniSifre.contains("[A-Z]");
        if (isValidPassword(yeniSifre)){
        	System.out.println("Şifreniz başarılı bir şekilde değiştirilmiştir. ");
        	sifre=yeniSifre;
        	bilgileriGoster();
        }else{
            System.out.println("Eksik ya da yanlış karakter girdiniz ");
            yeniSifreOlustur();
        }

    }
void bilgileriGoster() {
      System.out.println("Mail adresiniz : " + eMail+"\nÇalıştığınız Şirket : "+sirketAdi+
    		  "\nDepartmaniniz : "+ departman);
      System.out.println("Ayni Sirket ve Departmandaki kisiler : ");
      for (int i = 0; i < kullaniciList.size(); i++) {
    	  if(departman.contains(kullaniciList.get(i).departman)) {
        	  System.out.println(kullaniciList.get(i).toString());
        	  
          }	
  	}
//      System.out.println(kullaniciList.toString());
      
}
    void generateRandomPassword()
        {
            int len = 6;
            int randNumOrigin = 48, randNumBound = 122;
            SecureRandom random = new SecureRandom();
            sifre=random.ints(randNumOrigin, randNumBound + 1)
                    .filter(i -> Character.isAlphabetic(i) || Character.isDigit(i))
                    .limit(len)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint,
                            StringBuilder::append)
                    .toString();
        }
            int count3 = 3;

        void mailGiris() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Sistem tarafından üretilen mail adresinizi giriniz : ");
            String mailKontrol = scan.nextLine();

            if (!mailKontrol.equals(eMail)) {
                count3--;
                if (count3 == 0) {
                   System.out.println("3 defa hatalı giriş yaptınız. Çıkışınız gerçekleştirilniştir.");
                }
                else{
                    System.out.println("Yanlış girdiniz tekrar deneyiniz. Kalan hakkınız : " + count3);
                    mailGiris();
                }

            } else {
                System.out.println("Mail adresiniz eşleşmiştir.");
            }
        }
    int count4=3;
    void sifreKontrol() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sistem tarafından üretilen geçici şifrenizi giriniz : ");
        String sifreKontrol = scan.nextLine();
        if (!sifreKontrol.equals(sifre)) {
            count4--;
            if (count4 == 0) {
                System.out.println("3 defa hatalı giriş yaptınız. Çıkışınız gerçekleştirilniştir.");
            }
            else{
                System.out.println("Yanlış girdiniz tekrar deneyiniz. Kalan hakkınız : " + count4);
                sifreKontrol();
            }
        } else {
            System.out.println("şifreniz eşleşmiştir.");
        }
    }
	@Override
	public String toString() {
		return "\nWorker [isim=" + isim + ", soyisim=" + soyisim + ", id=" + id + ", sirketAdi=" + sirketAdi
				+ ", departman=" + departman + ", eMail=" + eMail + "]";
	}



}

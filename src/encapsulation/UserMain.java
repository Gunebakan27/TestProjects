package encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		User user=new User();
		List<User>users=new ArrayList<>();	
		Scanner scan=new Scanner(System.in);
		String cevap;
		int sayac=0;
		do {
		System.out.println("Lütfen User Name giriniz..");
		user.setUserName(scan.next());
		do{System.out.println("Lütfen password giriniz..");	
		user.setPassword(scan.next());
		if(user.getPassword().length()<6) {
			System.out.println("Lütfen en az alti karakter giriniz..");
		}else {	
			System.out.println("Password basariyla kaydedilmistir..");
		}}while(user.getPassword().length()<6);	
		user.setId(1000+sayac);	
		sayac++;
		User user1=new User(user.getId(),user.getUserName(),user.getPassword(), user.isActive(), user.isSignedIn());
		users.add(user1);
		System.out.println("Kullanici kaydi basariyla alinmistir.\n"
				+ "Yeni kullanici olusturmaya devam etmek istiyor musunuz? 'E'/'H' ");
		cevap=scan.next();
		
		}while(cevap.equalsIgnoreCase("E"));

		System.out.println("Kaydedilen kullanici listesi: "+users.toString());
	}

}

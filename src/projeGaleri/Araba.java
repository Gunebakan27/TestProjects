package projeGaleri;

import java.util.Scanner;


public class Araba {
	static int fiyat=100000;
	
	
	public static void main(String[] args) {
		
		aracSecimi();
		
		
	}

	
	
	
	
	private static  void aracSecimi() {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Görmek istediginiz Arac Markasini Seciniz.");
		System.out.println("1-  Opel\n"
				+ "2- Toyota\n"
				+ "3- Honda\n"
				+ "4- Volkswagen\n"
				+ "5- Diger");
		int secim = scan.nextInt();
		
		switch (secim) {
		case 1:
			
			paketSecimi();
			
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;

			
		default:
			break;
		}
	}





	public static void paketSecimi() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Görmek istediginiz Paketi Seciniz.");
		int secim=scan.nextInt();
		switch (secim) {
		case 1:
			BasicPaket basicPaket = new BasicPaket();
			basicPaket.paketCagir();
			break;
		case 2:
			
			break;

		default:
			break;
		}
		
		
		
	}

}

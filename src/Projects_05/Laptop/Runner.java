package Projects_05.Laptop;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Data data=new Data();
		PriceForOneLaptop price=new PriceForOneLaptop();
		data.AllData(0);
		for (int i = 0; i < data.allData.size(); i++) {
			System.out.println("Ürün ID : "+(110+i)+" --> " +data.allData.get(i+110));
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen fiyatini görmek istediginiz ürünün ID'sini giriniz..");
		int productID=scan.nextInt();
		System.out.println("Sectiginiz Ürün : "+data.AllData(productID));
		System.out.println("Ürünün Fiyati : "+price.getPrice(productID)+" TL'dir");
		
		System.out.println("Lütfen yapmak istediginiz indirim oranini giriniz : ");
		int indirim=scan.nextInt();
		System.out.println("Sectiginiz ürünün indirimli fiyati : "+price.getDiscount(price.getPrice(productID), indirim)+" TL'dir");
		
	}

}

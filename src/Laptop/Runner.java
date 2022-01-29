package Laptop;

import java.util.ArrayList;

public class Runner extends Calculation{

	public static void main(String[] args) {
		PriceForOneLaptop price=new PriceForOneLaptop();
		Calculation calculate=new Calculation();
		Data data=new Data();
		System.out.println(price.getPrice(110));
		System.out.println(price.getDiscount(50, 10));
		data.AllData(0);
		for (int i = 0; i < data.allData.size(); i++) {
			System.out.println("Ürün ID : "+(110+i)+ "-->"+data.allData.get(110+i));
		}
	}

	@Override
	public int getRam(ArrayList<String> laptop) {
		// TODO Auto-generated method stub
		return super.getRam(laptop);
	}

}

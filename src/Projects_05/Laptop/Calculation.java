package Projects_05.Laptop;

import java.util.ArrayList;

public class Calculation {
static int price=0;

		
	public int getRam(ArrayList<String> laptop) {
		int addPrice=0;
		if(laptop.get(2).contains("32")) {
			addPrice=300;
		}if(laptop.get(2).contains("16")) {
			addPrice=200;
		}if(laptop.get(2).contains("8")) {
			addPrice=100;
		}if(laptop.get(2).contains("4")) {
			addPrice=50;
		}
	
		return price+addPrice;
	}
	
	

	
     /*
        Create method name is getRam

        Parameter is ArrayList<String>

        if ram is 32 gb add 300 to price
        if ram is 16 gb add 200 to price
        if ram is 8 gb add 100 to price
        if ram is 4 gb add 50 to price

        return the price.
     */


     /*
        getRam methodunu oluşturalım

        Parametresi  ArrayList<String> olsun


        Eğer ram 32 gb ise price 300 ekle
        Eğer ram 16 gb ise price 200 ekle
        Eğer ram 8 gb ise price 100 ekle
        Eğer ram 4 gb ise price 50 ekle


        return  price olmalı.

        Not price -- fiyat
     */


    /*
       Create method name is getCPU

        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */
	public int getCpu(ArrayList<String> laptop) {
		int addPrice=0;
		if(laptop.get(3).contains("i3")) {
			addPrice=200;
		}if(laptop.get(3).contains("i5")) {
			addPrice=300;
		}if(laptop.get(3).contains("i7")) {
			addPrice=500;}
		return price+addPrice;
	}

      /*
        getCPU  methodunu oluşturalım

        Parametresi  ArrayList<String> olsun


        Eğer CPU i3 ise price 200 ekle
        Eğer CPU i5 ise price 300 ekle
        Eğer CPU i7 ise price 500 ekle


        return  price olmalı.
     */


    /*
      Create method name is getColor

      Parameter is ArrayList<String>

      return type is int

      if Color is Red add 400 to price
      if Color is Orange add 300 to price
      if Color is Silver add 200 to price
      if Color is Black add 150 to price

      return the price.
   */
		public int getColor(ArrayList<String> laptop) {
			int addPrice=0;
			if(laptop.get(4).contains("Red")) {
				addPrice=400;
			}if(laptop.get(4).contains("Orange")) {
				addPrice=300;
			}if(laptop.get(4).contains("Silver")) {
				addPrice=200;
			}if(laptop.get(4).contains("Black")) {
				addPrice=150;
			}
		
			return price+addPrice;
		}
     /*
        getColor methodunu oluşturalım

        Parametresi  ArrayList<String> olsun

        return türü int olmalı


        Eğer Color Red ise ise price 400 ekle
        Eğer Color Orange ise price 300 ekle
        Eğer Color Silver ise price 200 ekle
        Eğer Color Black ise price 150 ekle


        return  price olmalı.

     */



    /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */
		public int getSize(ArrayList<String> laptop) {
			int addPrice=0;
			if(laptop.get(1).contains("Mini")) {
				addPrice=100;
			}if(laptop.get(1).contains("Middle")) {
				addPrice=200;
			}if(laptop.get(1).contains("Max")) {
				addPrice=300;
			}
		
			return price+addPrice;
		}
    /*
        getSize  methodunu oluşturalım

        return türü int olmalı

        Parametresi  ArrayList<String> olsun


        Eğer Size "Mini" içeriyorsa price 100 ekle
        Eğer Size "Middle" içeriyorsa price 200 ekle
        Eğer Size "Max" içeriyorsa price 300 ekle


        return  price olmalı.
     */



}

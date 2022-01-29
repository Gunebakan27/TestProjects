package Projects_03;



public class getPopulation {
	public static void main(String[] args) {
		String country="USa";
		String countryNames[]={"USA" ,"Mexico" ,"Canada"};
		int countryPopulations[] = {100000 , 120000 , 130000};
		
		System.out.println(populationOfCountry(country, countryNames, countryPopulations));
	}

	private static int populationOfCountry(String country, String[] countryNames, int[] countryPopulations) {
		for (int i = 0; i < countryPopulations.length; i++) {
			if(countryNames[i].equalsIgnoreCase(country)) {
				return countryPopulations[i];
			}
		}
		
		
		return -1;
		
	}
}

 
		

    /*
        Method name is populationOfCountry

        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)

        countryNames is Country names

        countryPopulations is Country population

        if str is contained in the countryNames return the population


        For example:

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return should be 120000

        NOTE : if str is not in the countryNames array return -1
     */


    /*
    Method adı populationOfCountry
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (str) alacak

     countryNames Ülke isimleri

     countryPopulations Ülke nüfusları

      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et

      Ornegin;

      countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return 120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali

     */

    
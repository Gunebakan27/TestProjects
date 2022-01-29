package Projects_03;

public class SubtractionSquare {
	public static void main(String[] args) {
		int first=10;
		int second = 5;
		System.out.println(getSumOfSquares(first, second));
	}
	private static int getSumOfSquares(int first, int second) {
	int sumFirst=0;
		for (int i = 0; i <= first; i++) {
		sumFirst+=i;
	}
		sumFirst*=sumFirst;
		System.out.println(sumFirst);
		int sumSecond=0;
	for (int i = 0; i <=second; i++) {
		sumSecond+=i;
	}
		sumSecond*=sumSecond;
		System.out.println(sumSecond);
		return sumFirst+sumSecond;		
	}	
}
  /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /*
   substSquare isminde bir method verildiğinde
   bu method parametre olara iki int alır
   return tipi int olur

   getSumOfSquares methodunu kullanarak


Parameter 1 toplamin karesi+Parameter 2 toplamin karesi= sonuc


   Örnek:

    int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir

    int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir

    3025 + 225 = 3250

    return 3250
    */





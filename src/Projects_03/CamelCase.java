package Projects_03;

import java.util.Arrays;
import java.util.Scanner;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
 public static void main(String[] args) {
	
	 String s="I lIVe in uSa";
	 System.out.println( camelCase(s));
}

	private static String camelCase(String s) {

		String arr[]=s.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1, arr[i].length()).toLowerCase();
		}
		s="";
		for (int i = 0; i < arr.length; i++) {
			s+=arr[i]+" ";
		}
		return s;



    }


}

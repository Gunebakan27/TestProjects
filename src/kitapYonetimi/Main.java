package kitapYonetimi;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static List<Kitap>kitapListe=new ArrayList<>();
	
	public static void main(String[] args) {
	
		KitapMethod.kitaplarEkle(kitapListe);
		KitapMethod.menu(kitapListe);
		
	}
		
	}




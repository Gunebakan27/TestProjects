package projeGaleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuxPaket extends Araba implements IcAraba, DisAraba{

	boolean sunroof=true;
	boolean navigasyon=true;
	

	@Override
	public void aracRengi() {
		
		List<String> aracRengi = new ArrayList<>(Arrays.asList("Beyaz","K�rm�z","Mavi","Siyah","Sar�"));
		
		int secenek=1;
		for (String string : aracRengi) {
			System.out.println("Arac Renk secenekleri : "+secenek+". "+string);
			secenek++;
		}
		
	}
	@Override
	public String yakitTuru() {
		List<String> yakitTuru = new ArrayList<>(Arrays.asList("Benzin","Diesel","Hibrit"));
		return null;
		
	}
	@Override
	public String vitesTuru() {
		List<String> vitesTuru = new ArrayList<>(Arrays.asList("Manuel","Otomatik"));
		
		return null;
		
	}
	
	
	
}

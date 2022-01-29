package hastaneOtomasyon;

public class HastaneRunner {
	
private static Hastane hastane = new Hastane();

	public static void main(String[] args) {	
		String aktuelDurum="Migren";
		
		System.out.println(doktorUnvan(aktuelDurum));
		doktorBul(aktuelDurum);
		hastaBul(aktuelDurum);
		hastaDurumuBul(aktuelDurum);	
	}
	public static void hastaDurumuBul(String aktuelDurum) {
		int idx=0;
		
		for(int i=0;i<hastane.durumlar.length;i++) {
			if(hastane.durumlar[i].equalsIgnoreCase(aktuelDurum)) {
				idx=i;
			}
		
	}String aciliyet=hastane.acil[idx]?"Acil":"Acil Degil";
	System.out.println(aciliyet);
	}
	public static void hastaBul(String aktuelDurum) {
		int idx=0;
		for(int i=0;i<hastane.durumlar.length;i++) {
			if(hastane.durumlar[i].equalsIgnoreCase(aktuelDurum)) {
				idx=i;
			}
			
		}hastane.setHasta();
		System.out.println(hastane.hastalar.get(idx).toString());
	}
	public static void doktorBul(String aktuelDurum) {
		int idx=0;
		for(int i=0;i<hastane.durumlar.length;i++) {
			if(hastane.durumlar[i].equalsIgnoreCase(aktuelDurum)) {
				idx=i;
			}
			
		}hastane.setDoktor();
		System.out.println(hastane.doktorlar.get(idx).toString());
		
			
	}

	public static String doktorUnvan(String aktuelDurum) {	
		String unvan="";
		
	for(int i=0;i<hastane.durumlar.length;i++) {
		if(hastane.durumlar[i].equalsIgnoreCase(aktuelDurum)) {
			unvan=hastane.unvanlar[i];
		}
	}		
		return unvan;	
	}
}

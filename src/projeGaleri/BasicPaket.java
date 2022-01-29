package projeGaleri;

public class BasicPaket extends Araba implements IcAraba, DisAraba{

	public BasicPaket(){
		
	}
	
//	public BasicPaket(String aracTipi,String aracRengi, String yakitTürü, String vitesTürü, int kapiSayisi, int fiyat) {
//	}
	
//	BasicPaket basicPaket = new BasicPaket(aracTipi, aracRengi(), 
//			yakitTuru(),vitesTuru(),kapiSayisi,fiyat);
	

	@Override
	public void aracRengi() {
	
		String aRengi="Beyaz";
		
		System.out.println(aRengi);
		
	}

	@Override
	public String yakitTuru() {

		String yTuru="Benzin";
	
		return yTuru;
				
	}

	@Override
	public String vitesTuru() {
		
		String vTuru="Manuel";
		
		return vTuru;
		
	}
	public void paketCagir() {
		aracRengi();
		System.out.println("BasicPaket [aracTipi="+aracTipi +", kapiSayisi()="+ kapiSayisi 
				+ ", yakitTuru()=" + yakitTuru()
				+ ", vitesTuru()=" + vitesTuru() + ", fiyat="+fiyat+" TL ]");
	}








	

	
}

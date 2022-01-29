package okulYonetimi;

public class Ogrenci extends Kisi{
	private String ogrNo;
	private String sinif;
	
	public Ogrenci() {
	}

	

	@Override
	public String toString() {
		return "Ogrenci [ogrNo=" + ogrNo + ", sinif=" + sinif + ", getAdSoyad()=" + getAdSoyad() + ", getKimlikNo()="
				+ getKimlikNo() + ", getYas()=" + getYas() + "]";
	}



	public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrNo, String sinif) {
		super(adSoyad, kimlikNo, yas);
		this.ogrNo = ogrNo;
		this.sinif = sinif;
	}



	public String getOgrNo() {
		return ogrNo;
	}
	public void setOgrNo(String ogrNo) {
		this.ogrNo = ogrNo;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	

}

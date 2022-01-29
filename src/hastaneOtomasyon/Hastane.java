package hastaneOtomasyon;
import java.util.ArrayList;
import java.util.List;
public class Hastane extends Data {
    private Doktor doktor;
    private Hasta hasta;
    
    List<Doktor> doktorlar = new ArrayList<Doktor>();
    List<Hasta> hastalar = new ArrayList<>();
    
    public Hastane() {
    }
    public Doktor getDoktor() {
        return doktor;
    }
    public void setDoktor() {
        for (int i = 0; i < doctorIsimleri.length; i++) {
            doktor = new Doktor(doctorIsimleri[i], doctorSoyIsimleri[i], unvanlar[i]);
            doktorlar.add(doktor);
        }
//        this.doktor = doktor;
        //hastane1.setDoktor(hastane1.getDoktor());
        // System.out.println(hastane1.doktorlar.get(5).getIsim());
    }
    public Hasta getHasta() {
        return hasta;
    }
    public void setHasta() {
        for (int i = 0; i < hastaIsimleri.length; i++) {
            hasta = new Hasta(hastaIsimleri[i], hastaSoyIsimleri[i], hastaIDleri[i], durumlar[i]);
            hastalar.add(hasta);
        }
//        this.hasta = hasta;
    }
}


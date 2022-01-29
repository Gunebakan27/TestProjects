package hastaneOtomasyon;

public class Durum {
private String aktuelDurum;
private boolean aciliyet;
public Durum() {
}
public Durum(String actuelDurum, boolean aciliyet) {
    this.aktuelDurum = actuelDurum;
    this.aciliyet = aciliyet;
}
public String getAktuelDurum() {
    return aktuelDurum;
}
public void setAktuelDurum(String aktuelDurum) {
    this.aktuelDurum = aktuelDurum;
}
public boolean isAciliyet() {
    return aciliyet;
}
public void setAciliyet(boolean aciliyet) {
    this.aciliyet = aciliyet;
}
@Override
public String toString() {
    return "Durum [actuelDurum=" + aktuelDurum + ", aciliyet=" + aciliyet + "]";
}
    
}


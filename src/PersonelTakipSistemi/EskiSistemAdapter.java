package PersonelTakipSistemi;

public class EskiSistemAdapter implements PersonelTakip {
    private EskiPersonelSistemi eskiPersonelSistemi;

    public EskiSistemAdapter(EskiPersonelSistemi eskiSitem){
        this.eskiPersonelSistemi = eskiSitem;
    }
    @Override
    public void personelBilgisiGetir() {
        eskiPersonelSistemi.eskiPersonelBilgisiGetir();
    }

    @Override
    public void izinKontrol() {
        eskiPersonelSistemi.eskiIzinKontrol();
    }
}

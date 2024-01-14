package PersonelTakipSistemi;

public class YeniPersonelSistemi implements PersonelTakip{
    @Override
    public void personelBilgisiGetir() {
        System.out.println("Yeni Sistem ile personel bilgisi geetiriliyor.");
    }

    @Override
    public void izinKontrol() {
        System.out.println("Yeni Sistem ile izin kontrol ediliyor.");
    }
}

package PersonelTakipSistemi;

public class PersonelTakipSistemi {
    public static void main(String[] args){
        YeniPersonelSistemi yeniSistem = new YeniPersonelSistemi();
        EskiPersonelSistemi eskiPersonelSistemi = new EskiPersonelSistemi();
        EskiSistemAdapter eskiSistem = new EskiSistemAdapter(eskiPersonelSistemi);

        yeniSistem.izinKontrol();
        eskiSistem.izinKontrol();

    }
}

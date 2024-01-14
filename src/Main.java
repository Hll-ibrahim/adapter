// Ana Sınıf (Istemci)
public class Main {
    public static void main(String[] args) {
        // İstemci, farklı müzik çalarları kullanabilir
        MuzikCalar mp3Calar = new MP3Calar();
        MuzikCalar eskiCalar = new EskiMuzikCalarAdapter(new EskiMuzikCalar());


        // Farklı müzik çalarları kullanarak müzik çalma işlemi
        mp3Calar.muzikCal();
        mp3Calar.sonrakiParca();
        mp3Calar.oncekiParca();

        System.out.println("-----");

        eskiCalar.muzikCal();
        eskiCalar.sonrakiParca();
        eskiCalar.oncekiParca();
    }
}
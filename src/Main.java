public class Main {
    public static void main(String[] args) {
        MuzikCalar mp3Calar = new MP3Calar();
        MuzikCalar eskiCalar = new EskiMuzikCalarAdapter(new EskiMuzikCalar());


        mp3Calar.muzikCal();
        mp3Calar.sonrakiParca();
        mp3Calar.oncekiParca();

        System.out.println("-----");

        eskiCalar.muzikCal();
        eskiCalar.sonrakiParca();
        eskiCalar.oncekiParca();
    }
}
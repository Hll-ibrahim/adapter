// Yeni bir MP3 çalar sınıfı
class MP3Calar implements MuzikCalar {
    @Override
    public void muzikCal() {
        System.out.println("MP3 çalar ile müzik çalılıyor.");
    }

    @Override
    public void sonrakiParca() {
        System.out.println("MP3 çalar ile sonraki parça çalılıyor.");
    }

    @Override
    public void oncekiParca() {
        System.out.println("MP3 çalar ile önceki parça çalılıyor.");
    }
}

class EskiMuzikCalarAdapter implements MuzikCalar {
    private EskiMuzikCalar eskiMuzikCalar;

    public EskiMuzikCalarAdapter(EskiMuzikCalar eskiMuzikCalar) {
        this.eskiMuzikCalar = eskiMuzikCalar;
    }

    @Override
    public void muzikCal() {
        eskiMuzikCalar.eskiMuzigiCal();
    }

    @Override
    public void sonrakiParca() {
        eskiMuzikCalar.sonrakiEskiParca();
    }

    @Override
    public void oncekiParca() {
        eskiMuzikCalar.oncekiEskiParca();
    }
}

package ProjeYonetimi;

public class EskiProjeAdapter implements Project{
    private EskiProje eskiProje;

    public EskiProjeAdapter(EskiProje eskiProje){
        this.eskiProje = eskiProje;
    }
    @Override
    public String getData() {
        return this.eskiProje.veriGetir();
    }

    @Override
    public void postData(String data) {
        this.eskiProje.veriGonder(data);
    }
}

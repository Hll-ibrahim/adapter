package ProjeYonetimi;

public class Proje2 implements Project{
    @Override
    public String getData() {
        return "proje2 data";
    }

    @Override
    public void postData(String data) {
        System.out.println("Proje2 veri gonderiyor.."+data);
    }
}

package ProjeYonetimi;

public class Proje1 implements Project{
    @Override
    public String getData() {
        return "project1 data";
    }

    @Override
    public void postData(String data) {
        System.out.println("Proje1 veri gonderiyor.."+data);

    }
}

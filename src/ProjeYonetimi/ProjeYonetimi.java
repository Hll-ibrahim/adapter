package ProjeYonetimi;

public class ProjeYonetimi {
    public static void main(String[] args){

        Proje1 proje1 = new Proje1();
        Proje2 proje2 = new Proje2();
        EskiProje eskiProje = new EskiProje();
        EskiProjeAdapter eskiProjeAdapter = new EskiProjeAdapter(eskiProje);

        System.out.println(proje2.getData());
        System.out.println(proje1.getData());
        System.out.println(eskiProjeAdapter.getData());

        eskiProjeAdapter.postData("Aboo");
        proje1.postData("hii");

    }
}

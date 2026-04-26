package akademis;

public class main {
    public static void main(String[] args) {

       
        Mahasiswa mhs = new Mahasiswa("2410020160", "Anisa", 3.8, 4);
        mhs.tampil();

        System.out.println("------------------");

        
        MataKuliah mk = new MataKuliah("IF101", "Pemrograman");
        mk.tampil();
    }
}

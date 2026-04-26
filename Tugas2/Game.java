package Tugas2;

public class Game {

    String namaKarakter;
    int level;

    
    public Game() {
        System.out.println("Game Dimulai");
        namaKarakter = "Balmond";
        level = 15;
    }

    
    public Game(String namaKarakter, int level) {
        this.namaKarakter = namaKarakter;
        this.level = level;
    }

    
    public void tampilData() {
        System.out.println("Karakter: " + namaKarakter);
        System.out.println("Level: " + level);
    }

   
    public String getNamaKarakter() {
        return namaKarakter;
    }
}

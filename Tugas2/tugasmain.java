package Tugas2;

public class tugasmain {
    public static void main(String[] args) {

        
        Game g1 = new Game();
        g1.tampilData();

        System.out.println("=== Game Kedua ===");

        
        Game g2 = new Game("Brody", 5);
        g2.tampilData();
    }
}

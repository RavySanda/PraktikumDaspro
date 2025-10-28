package jobsheet7;
import java.util.Scanner;
public class percobaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai;
        double tertinggi = 0;   
        double terendah = 100;  
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double BATAS_LULUS = 60.0;

        System.out.println("Masukkan nilai 10 mahasiswa:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // cek tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // hitung lulus / tidak lulus
            if (nilai >= BATAS_LULUS) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("\nHasil:");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);

        sc.close();
    }
}

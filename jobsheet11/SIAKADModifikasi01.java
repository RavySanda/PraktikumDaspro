package jobsheet11;
import java.util.Scanner;
public class SIAKADModifikasi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMK];

        System.out.println("\n=== INPUT NILAI ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            for (int j = 0; j < jumlahMK; j++) {
                System.out.print("Nilai siswa " + (i + 1) + ", mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== RATA-RATA PER SISWA ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            int total = 0;
            for (int j = 0; j < jumlahMK; j++) {
                total += nilai[i][j];
            }
            double rata = (double) total / jumlahMK;
            System.out.println("Siswa " + (i + 1) + ": " + rata);
        }

        System.out.println("\n=== RATA-RATA PER MATA KULIAH ===");
        for (int j = 0; j < jumlahMK; j++) {
            int total = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                total += nilai[i][j];
            }
            double rata = (double) total / jumlahSiswa;
            System.out.println("Mata kuliah " + (j + 1) + ": " + rata);
        }

        sc.close();
    }
}

package jobsheet11;
import java.util.Scanner;
public class SIAKAD01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        System.out.println("=== INPUT NILAI ===");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai siswa " + (i + 1) + ", mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== RATA-RATA PER SISWA ===");
        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += nilai[i][j];
            }
            double rata = (double) total / 3;
            System.out.println("Siswa " + (i + 1) + " = " + rata);
        }


        System.out.println("\n=== RATA-RATA PER MATA KULIAH ===");
        for (int j = 0; j < 3; j++) {
            int total = 0;
            for (int i = 0; i < 4; i++) {
                total += nilai[i][j];
            }
            double rata = (double) total / 4;
            System.out.println("Mata kuliah " + (j + 1) + " = " + rata);
        }

        sc.close();
    }
}

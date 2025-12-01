package jobsheet11;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;

        int[][] survey = new int[responden][pertanyaan];

        System.out.println("=== INPUT DATA SURVEY ===");
        for (int i = 0; i < responden; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("=== RATA-RATA PER RESPONDEN ===");
        for (int i = 0; i < responden; i++) {
            int total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survey[i][j];
            }
            double rata = (double) total / pertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        System.out.println("\n=== RATA-RATA PER PERTANYAAN ===");
        for (int j = 0; j < pertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < responden; i++) {
                total += survey[i][j];
            }
            double rata = (double) total / responden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataKeseluruhan = (double) totalKeseluruhan / (responden * pertanyaan);
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        System.out.println("Rata-rata keseluruhan = " + rataKeseluruhan);

        sc.close();
    }
}

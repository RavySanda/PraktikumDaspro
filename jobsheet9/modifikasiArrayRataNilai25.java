package jobsheet9;
import java.util.Scanner;
public class modifikasiArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();

        int[] nilaiMhs = new int[n];
        int totalLulus = 0, totalTidakLulus = 0;
        int countLulus = 0, countTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        double rataLulus = 0, rataTidakLulus = 0;
        if (countLulus > 0) {
            rataLulus = (double) totalLulus / countLulus;
        }
        if (countTidakLulus > 0) {
            rataTidakLulus = (double) totalTidakLulus / countTidakLulus;
        }

        // Output 
        if (countLulus > 0)
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
        else
            System.out.println("Tidak ada mahasiswa yang lulus.");

        if (countTidakLulus > 0)
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        else
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");

        sc.close();
    }
}

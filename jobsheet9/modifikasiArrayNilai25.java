package jobsheet9;
import java.util.Scanner;
public class modifikasiArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +i+ ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
        String status = (nilaiAkhir[i] > 70) ? "lulus !" : "tidak lulus !";
        System.out.println("Mahasiswa ke-" +i+ " " + status);
}

    }
}
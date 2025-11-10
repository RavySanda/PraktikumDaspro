package jobsheet9;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nama = new String[n];
        int[] harga = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();
            System.out.print("Masukkan harga untuk " + nama[i] + ": ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            total += harga[i];
        }

        System.out.println("\n=== DAFTAR PESANAN ===");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " - Rp" + harga[i]);
        }

        System.out.println("Total biaya: Rp" + total);

        sc.close();
    }
}

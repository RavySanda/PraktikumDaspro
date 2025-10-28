package jobsheet7;
import java.util.Scanner;
public class Tugas1Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HARGA_TIKET = 50000;
        int jumlahTiketTerjual = 0;
        double totalPendapatan = 0.0;

        System.out.println("== Program Penjualan Tiket Bioskop ==");
        System.out.println("Masukkan jumlah tiket untuk setiap pelanggan. Ketik 0 untuk selesai.");

        while (true) {
            System.out.print("Jumlah tiket (pelanggan): ");
            int jml = sc.nextInt();
            if (jml < 0) {
                System.out.println("Input tidak valid (negatif). Coba lagi.");
                continue;
            }
            if (jml == 0) {
                break;
            }

            double harga = jml * HARGA_TIKET;
            // diskon
            if (jml > 10) {
                harga = harga * 0.85; // diskon 15%
            } else if (jml > 4) {
                harga = harga * 0.90; // diskon 10%
            }

            jumlahTiketTerjual += jml;
            totalPendapatan += harga;
            System.out.println("Total untuk transaksi ini = Rp " + (int)harga);
        }

        System.out.println("\n== Rekap Penjualan Harian ==");
        System.out.println("Total tiket terjual: " + jumlahTiketTerjual);
        System.out.println("Total pendapatan   : Rp " + (int)totalPendapatan);

        sc.close();
    }
}

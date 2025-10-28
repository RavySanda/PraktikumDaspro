package jobsheet7;
import java.util.Scanner;
public class percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaKopi = 12000;
        final int hargaTeh  = 7000;
        final int hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik \"batal\" untuk berhenti): ");
            String namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dihentikan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            int kopi = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah teh: ");
            int teh = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah roti: ");
            int roti = Integer.parseInt(sc.nextLine());

            int totalHarga = kopi * hargaKopi + teh * hargaTeh + roti * hargaRoti;
            System.out.println("Total harga untuk " + namaPelanggan + " = Rp " + totalHarga);
            System.out.println(); // pembersihan visual
            // sc.nextLine(); // tidak diperlukan karena sudah menggunakan nextLine saat input angka di-parse
        } while (true);

        sc.close();
    }
}

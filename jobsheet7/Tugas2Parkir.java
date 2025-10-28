package jobsheet7;
import java.util.Scanner;
public class Tugas2Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TARIF_MOBIL_PER_JAM = 3000;
        int TARIF_MOTOR_PER_JAM = 2000;
        int TARIF_MAKS = 12500;

        System.out.println("== Program Parkir ==");
        System.out.println("Input tipe kendaraan: 1 = Mobil, 2 = Motor, 0 = Selesai");

        while (true) {
            System.out.print("Tipe kendaraan (0=selesai,1=mobil,2=motor): ");
            int tipe = sc.nextInt();
            if (tipe == 0) {
                break;
            }
            if (tipe != 1 && tipe != 2) {
                System.out.println("Tipe tidak dikenal. Coba lagi.");
                continue;
            }

            System.out.print("Durasi parkir (jam): ");
            int jam = sc.nextInt();
            if (jam < 0) {
                System.out.println("Durasi tidak valid. Coba lagi.");
                continue;
            }

            int bayar;
            if (jam > 5) {
                bayar = TARIF_MAKS;
            } else {
                if (tipe == 1) {
                    bayar = jam * TARIF_MOBIL_PER_JAM;
                } else {
                    bayar = jam * TARIF_MOTOR_PER_JAM;
                }
            }

            System.out.println("Total bayar: Rp " + bayar);
        }

        System.out.println("Selesai. Terima kasih.");
        sc.close();
    }
}

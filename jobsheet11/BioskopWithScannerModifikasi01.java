package jobsheet11;
import java.util.Scanner;
public class BioskopWithScannerModifikasi01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        int menu;

        do {
            System.out.println("\n============== MENU BIOSKOP ==============");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                int baris, kolom;

                while (true) {

                    System.out.print("Masukkan baris (0-3): ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom (0-1): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 
                    if (baris < 0 || baris > 3 || kolom < 0 || kolom > 1) {
                        System.out.println(">>> Kursi tidak tersedia! Silakan ulangi input.\n");
                        continue; 
                    }

                    if (penonton[baris][kolom] != null) {
                        System.out.println(">>> Kursi sudah terisi oleh: " + penonton[baris][kolom]);
                        System.out.println(">>> Silakan pilih kursi lain.\n");
                        continue;
                    }

                    break;
                }

                System.out.print("Masukkan nama penonton: ");
                penonton[baris][kolom] = sc.nextLine();

                System.out.println(">>> Data berhasil disimpan!");

            }

            else if (menu == 2) {
                System.out.println("\n============= DAFTAR PENONTON =============");

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {

                        if (penonton[i][j] == null)
                            System.out.print("*** ");   
                        else
                            System.out.print(penonton[i][j] + " ");
                    }
                    System.out.println();
                }
            }

           
            else if (menu == 3) {
                System.out.println(">>> Program selesai. Terima kasih!");
            }

           
            else {
                System.out.println(">>> Menu tidak valid, silakan pilih 1-3.");
            }

        } while (menu != 3);

        sc.close();
    }
}

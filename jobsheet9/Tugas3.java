package jobsheet9;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== DAFTAR MENU KAFE ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean found = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari.trim())) {
                found = true;
                posisi = i;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Menu '" + cari + "' tersedia di urutan ke-" + (posisi + 1));
        } else {
            System.out.println("Menu '" + cari + "' tidak tersedia di kafe.");
        }

        sc.close();
    }
}

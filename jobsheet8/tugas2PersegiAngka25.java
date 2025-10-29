import java.util.Scanner;

public class tugas2PersegiAngka25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Input n harus minimal 3.");
            return;
        }

        // Outer loop: untuk baris (i)
        for (int i = 1; i <= n; i++) {
            // Inner loop: untuk kolom (j)
            for (int j = 1; j <= n; j++) {
                
                // Kondisi untuk mencetak angka n:
                // Berada di tepi atas (i=1) ATAU
                // Berada di tepi bawah (i=n) ATAU
                // Berada di tepi kiri (j=1) ATAU
                // Berada di tepi kanan (j=n)
                if (i == 1 || i == n || j == 1 || j == n) {
                    // Cetak angka n jika di salah satu tepi
                    System.out.print(n + " ");
                } 
                else {
                    // Cetak spasi di bagian tengah (rongga)
                    // Dua spasi untuk menjaga alignment kolom
                    System.out.print("  "); 
                }
            }
            System.out.println(); // Pindah baris
        }
        sc.close();
    }
}
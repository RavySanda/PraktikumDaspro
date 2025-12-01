package jobsheet11;
public class BioskopModifikasi01 {
    public static void main(String[] args) {

        String[][] penonton = new String[4][2];
        penonton[0][0] = "Ali";
        penonton[0][1] = "Budi";
        penonton[1][0] = "Cici";
        penonton[1][1] = "Dedi";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Fajar";
        penonton[3][0] = "Gilang";
        penonton[3][1] = "Hana";

        System.out.println("=== MENAMPILKAN JUMLAH BARIS & KOLOM ===");
        System.out.println("Jumlah baris (penonton.length): " + penonton.length);
        System.out.println("Jumlah kolom tiap baris (penonton[0].length): " + penonton[0].length);
        System.out.println();

        System.out.println("=== PANJANG SETIAP BARIS (FOR LOOP) ===");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Baris " + i + " memiliki kolom: " + penonton[i].length);
        }
        System.out.println();

        System.out.println("=== PANJANG SETIAP BARIS (FOREACH) ===");
        int nomorBaris = 0;
        for (String[] baris : penonton) {
            System.out.println("Baris " + nomorBaris + " memiliki kolom: " + baris.length);
            nomorBaris++;
        }
        System.out.println();

        System.out.println("=== PENONTON BARIS KE-3 (FOR LOOP) ===");
        for (int j = 0; j < penonton[2].length; j++) {
            System.out.println(penonton[2][j]);
        }
        System.out.println();

        System.out.println("=== PENONTON BARIS KE-3 (FOREACH) ===");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }
        System.out.println();

        System.out.println("=== SELURUH PENONTON (FOR LOOP NESTED) ===");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.print(penonton[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("=== SELURUH PENONTON (FOREACH NESTED) ===");
        for (String[] baris : penonton) {
            for (String nama : baris) {
                System.out.print(nama + " ");
            }
            System.out.println();
        }
    }
}

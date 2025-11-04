package jobsheet8;
import java.util.Scanner;
public class modifikasiNilaiKelompok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kelompok = 1;
        double rataNilai, totalNilai, nilai;
        double maxRata = 0;
        int kelompokTerbaik = 0;

        while (kelompok <= 6) {
            totalNilai = 0;
            System.out.println("Kelompok " + kelompok);

            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari penilai ke-" + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok " + kelompok + " = " + rataNilai);
            System.out.println();

            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokTerbaik = kelompok;
            }

            kelompok++;
        }

        System.out.println("Kelompok dengan rata-rata tertinggi adalah kelompok " + kelompokTerbaik);
    }
}


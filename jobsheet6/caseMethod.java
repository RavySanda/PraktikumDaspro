package jobsheet6;
import java.util.Scanner;
public class caseMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======== INPUT DATA MAHASISWA ========");

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("NIM: ");
        String nim = sc.nextLine();


        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS (30%): ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS (40%): ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas (30%): ");
        double tugas1 = sc.nextDouble();

        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS (30%): ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS (40%): ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas (30%): ");
        double tugas2 = sc.nextDouble();


        System.out.print("Nilai Etika (min 70): ");
        double etika = sc.nextDouble();

        System.out.print("Nilai Kehadiran (min 75): ");
        double kehadiran = sc.nextDouble();


        double nilaiAkhir1 = (uts1 * 0.30) + (uas1 * 0.40) + (tugas1 * 0.30);
        double nilaiAkhir2 = (uts2 * 0.30) + (uas2 * 0.40) + (tugas2 * 0.30);
        double rataRataNilaiAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2.0;


        String nilaiHuruf1 = tentukanGrade(nilaiAkhir1);
        String statusMK1 = tentukanStatusLulusMK(nilaiAkhir1);

        String nilaiHuruf2 = tentukanGrade(nilaiAkhir2);
        String statusMK2 = tentukanStatusLulusMK(nilaiAkhir2);

        String statusEtika = tentukanStatusEtika(etika);
        String statusKehadiran = tentukanStatusKehadiran(kehadiran);

        
        String statusSemester = "";

        if (statusMK1.equals("LULUS") && statusMK2.equals("LULUS")) {
            if (rataRataNilaiAkhir >= 60) {
                // nested if etika dan kehadiran
                if (etika >= 70 && kehadiran >= 75) {
                    statusSemester = "LULUS";
                } else {
                    statusSemester = "TIDAK LULUS (Etika atau Kehadiran Tidak Memenuhi)";
                }
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Ada Mata Kuliah Tidak Lulus)";
        }

        // ---------- OUTPUT ----------
        System.out.println("\n======== HASIL PENILAIAN AKADEMIK ========");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("-------------------------------------------");

        System.out.printf("%-28s %-6s %-6s %-6s %-12s %-12s %-10s\n",
                "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");

        System.out.printf("%-28s %-6.0f %-6.0f %-6.0f %-12.2f %-12s %-10s\n",
                "Algoritma Pemrograman", uts1, uas1, tugas1, nilaiAkhir1, nilaiHuruf1, statusMK1);

        System.out.printf("%-28s %-6.0f %-6.0f %-6.0f %-12.2f %-12s %-10s\n",
                "Struktur Data", uts2, uas2, tugas2, nilaiAkhir2, nilaiHuruf2, statusMK2);

        System.out.println("-------------------------------------------");
        System.out.printf("%-28s %-12.2f %-12s\n", "Etika", etika, statusEtika);
        System.out.printf("%-28s %-12.2f %-12s\n", "Kehadiran", kehadiran, statusKehadiran);
        System.out.println("-------------------------------------------");

        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", rataRataNilaiAkhir);
        System.out.println("Status Semester        : " + statusSemester);

        sc.close();
    }

   
    public static String tentukanGrade(double nilai) {
        if (nilai > 80 && nilai <= 100) {
            return "A";
        } else if (nilai > 73 && nilai <= 80) {
            return "B";
        } else if (nilai > 65 && nilai <= 73) {
            return "B+";
        } else if (nilai > 60 && nilai <= 65) {
            return "C";
        } else if (nilai > 50 && nilai <= 60) {
            return "C+";
        } else if (nilai > 39 && nilai <= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public static String tentukanStatusLulusMK(double nilai) {
        if (nilai >= 60) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }


    public static String tentukanStatusEtika(double nilai) {
        if (nilai >= 70) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    public static String tentukanStatusKehadiran(double nilai) {
        if (nilai >= 75) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }
}

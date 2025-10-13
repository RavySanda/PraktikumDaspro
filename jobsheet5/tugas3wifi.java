import java.util.Scanner;
public class tugas3wifi {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int jumlahSks = 0;
     System.out.println("JENIS PENGGUNA");
     String pengguna = sc.nextLine().trim();

        if (pengguna.equalsIgnoreCase("DOSEN")) {
            System.out.println("AKSES DIBERIKAN DOSEN");
         } else if (pengguna.equalsIgnoreCase("MAHASISWA")) {
            System.out.println("MASUKKAN SKS");
            jumlahSks = sc.nextInt(); 
           if (jumlahSks>=12){
            System.out.println("AKSES WIFI DIBERIKAN MAHASISWA");
         } else {
            System.out.println("AKSES DITOLAK KARENA >=12");
         }

        }else {
            System.out.println("AKSES DITOLAK ");
        }
  
       sc.close();
    }
    
}

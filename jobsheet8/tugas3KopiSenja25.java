import java.util.Scanner;
public class tugas3KopiSenja25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        
        System.out.println("\n=== Input Penjualan Per Cabang ==="); 

        int grandTotalPelanggan = 0;
        int grandTotalItem = 0;

        for (int i = 1; i <= jumlahCabang; i++) {
            
            System.out.println("\n--- Cabang " + i + " ---"); 
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            
            int totalItemCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                
                System.out.print("- Pelanggan " + j + " memesan berapa item? "); 
                int itemDipesan = sc.nextInt();
                totalItemCabang += itemDipesan;
            }
            
            System.out.println("Cabang " + i + ":"); 
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang"); 
            System.out.println("- Item terjual: " + totalItemCabang); 
            
           
            grandTotalPelanggan += jumlahPelanggan;
            grandTotalItem += totalItemCabang;
        }

        
        System.out.println("\nTotal seluruh Cabang:"); 
        System.out.println("Pelanggan: " + grandTotalPelanggan + " orang"); 
        System.out.println("Item terjual: " + grandTotalItem + " item");

        sc.close();
    }
}
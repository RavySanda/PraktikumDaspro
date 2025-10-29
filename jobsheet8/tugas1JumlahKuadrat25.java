import java.util.Scanner;
public class tugas1JumlahKuadrat25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        
        int totalSum = 0;
        String outputDetail = "";

        for (int i = 1; i <= n; i++) {
            int kuadrat = 0;
            String kuadratDetail = "";
            
            for (int j = 1; j <= i; j++) {
                kuadrat += i; 
            }

            totalSum += kuadrat;
            
            if (i > 1) {
                outputDetail += " + ";
            }
            outputDetail += kuadrat;

            System.out.println("n=" + i + " -> jumlah kuadrat = " + outputDetail + " = " + totalSum);
        }
        sc.close();
    }
}

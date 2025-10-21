package jobsheet7;
import java.util.Scanner;
public class siakadFor25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tertinggi = 0;
        double terendah = 100;

        for(int i = 1; i <= 10; i++){
            System.out.println("MASUKKAN NILAI KE-" + i + ":");
            double nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;

            }
            System.out.println("NILAI TERTINGGI :" +tertinggi);
            System.out.println("NILAI TERENDAH "+ terendah);







    }
}
}
    


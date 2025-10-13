import java.util.Scanner;
public class tugas3ktm {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    
     System.out.println("APAKAH BAWA KTM ");
     boolean bawaKtm = sc.nextBoolean();
     System.out.println("APAKAH SUDAH REGISTRASI");
     boolean registrasi = sc.nextBoolean();

      if (bawaKtm || registrasi) {
          System.out.println ("boleh masuk");
      } else {
          System.out.println("Di tolak masuk");

    }
    }
}

  

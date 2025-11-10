package jobsheet9;

public class modifikasiArrayBilangan25 {
    public static void main(String[] args) {
        int[] bil = new int[4];
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        int[] bil2 = {5, 13, -7, 17};
        System.out.println("\nIsi bil2 secara langsung:");
        for (int i = 0; i < bil2.length; i++) {
            System.out.println("bil2[" + i + "] = " + bil2[i]);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("elemen ke-" + i + " = " + bil[i]);
        }
    }
}



public class SegitigaKekanan{
    public static void main(String[] args) {
        int tinggi = 5;

        // bagian naik
        for (int a = 1; a <= tinggi; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // bagian turun
        for (int a = tinggi - 1; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
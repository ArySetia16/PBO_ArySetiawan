public class SegitigaKekiri {
    public static void main(String[] args) {
        int tinggi = 5;

        // bagian atas
        for (int a = 1; a <= tinggi; a++) {
            // spasi
            for (int b = tinggi; b > a; b--) {
                System.out.print(" ");
            }
            // bintang
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // bagian bawah
        for (int a = tinggi - 1; a >= 1; a--) {
            // spasi
            for (int b = tinggi; b > a; b--) {
                System.out.print(" ");
            }
            // bintang
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
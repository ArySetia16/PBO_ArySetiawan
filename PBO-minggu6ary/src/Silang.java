public class Silang {
    public static void main(String[] args) {
        int ukuran = 9; // ukuran X

        for (int a = 1; a <= ukuran; a++) {
            for (int b = 1; b <= ukuran; b++) {
                if (a == b || a + b == ukuran + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
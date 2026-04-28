public class Latihan {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("1. Segitiga");
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n - a; b++) System.out.print(" ");
            for (int c = 1; c <= a; c++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        System.out.println("2. segitiga Terbalik");
        for (int a = n; a >= 1; a--) {
            for (int b = 1; b <= n - a; b++) System.out.print(" ");
            for (int c = 1; c <= a; c++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        System.out.println("3. segitiga Kanan");
        for (int a = 1; a <= n; a++) {
            for (int c = 1; c <= a; c++) System.out.print("* ");
            System.out.println();
        }
        for (int a = n - 1; a >= 1; a--) {
            for (int c = 1; c <= a; c++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        System.out.println("4. segitiga Kiri");
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n - a; b++) System.out.print("  ");
            for (int c = 1; c <= a; c++) System.out.print("* ");
            System.out.println();
        }
        for (int a = n - 1; a >= 1; a--) {
            for (int b = 1; b <= n - a; b++) System.out.print("  ");
            for (int c = 1; c <= a; c++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();

        System.out.println("5. Bentuk silang");
        for (int a = 1; a <= n; a++) {
            for (int c = 1; c <= n; c++) {
                if (a == c || a + c == n + 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
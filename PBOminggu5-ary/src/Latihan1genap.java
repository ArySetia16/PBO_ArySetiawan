 import java.util.Scanner;

    public class Latihan1genap {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a, total = 0;
            for ( a = 2; a <= 20; a+=2 ) {
                System.out.print(a + " + ");
                total += a;
            }
            System.out.print("= " + total);
        }
    }
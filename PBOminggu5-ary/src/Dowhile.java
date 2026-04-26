
import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Input N: ");
        N = input.nextInt();
        // while (N <= 3 ) {
        //     System.out.println("Nama ke:" + N);
        //     N++;
        // }
        do {
            System.out.println("Nama ke:" + N);
            N++;
        } while (N <= 3);
    }
}
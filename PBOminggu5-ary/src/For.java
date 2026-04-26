import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N,a;
        System.out.print("Input N: ");
        N = input.nextInt();
        for ( a = 1; a <= N; a++) {
            System.out.println("Nama ke:" + a);
        }
    }
}
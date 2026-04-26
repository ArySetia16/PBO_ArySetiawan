import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N,a;
        System.out.print("Input N: ");
        N = input.nextInt();
        a = 1;
        while (a <= N) {
            System.out.println("Nama ke:" + a);
            a++;
        }
    }
    
}

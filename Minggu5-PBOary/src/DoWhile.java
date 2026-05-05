import java.util.*;
public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
            System.out.print("input N: ");
            N = input.nextInt();
            do {
                System.out.println("nama ke-"  + N);
                N++;
            } while (N <= 3);
        }


    }
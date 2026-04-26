import java.util.Scanner;
public class Latihan3fibonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();
        
        int n1 = 1, n2 = 1;
        
        System.out.print("Deret Fibonacci: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(n1);
            
            if (i < n) {
                System.out.print(", ");
            }
            
            int angkaBerikutnya = n1 + n2;
            n1 = n2;
            n2 = angkaBerikutnya;
        }
        
        System.out.println();
    }
}
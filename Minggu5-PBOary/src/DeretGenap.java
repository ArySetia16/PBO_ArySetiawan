import java.util.*;
public class DeretGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, total = 0;
        for (a = 2; a <= 20; a+=2) {
            System.out.println(a + " + ");
            total = total + a;
            }
        System.out.println(" =  " +total);
    }
}
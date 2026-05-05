import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elemen = 0;
        System.out.print("Tentukan jumlah elemen array: ");
        elemen = input.nextInt();

        int[] nilai = new int[elemen];
        int a;
        //int[] bilangan = {1, 2, 3, 4, 5};
        for (a = 0; a < elemen; a ++){
            System.out.println("masukan nilai index ke-" +a+ ": ");
            nilai[a] = input.nextInt();
        }
        for(a=0; a < elemen; a++){
            System.out.println("nilai array index-" +a+ ": " +nilai[a]);
        }
    }
}
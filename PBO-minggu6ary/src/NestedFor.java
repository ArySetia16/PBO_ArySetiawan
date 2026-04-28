import java.util.*;
public class NestedFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int bilangan = 0;

        do { 
            System.out.print("Masukan sebuah bilangan: ");
            bilangan = input.nextInt();
            while (bilangan >= 0) {
                while (bilangan % 2 == 0) {
                    System.out.println("Bilangan GENAP");
                    System.out.print("Masukan sebuah bilangan: ");
                    bilangan = input.nextInt();
                }
                System.out.println("Bilangan GANJIL");
                System.out.print("Masukan sebuah bilangan: ");
                bilangan = input.nextInt();
            }
            System.out.println("Bilangan kurang dari 0");
            System.out.print("Ulang program (y/Y)?");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
    }
}
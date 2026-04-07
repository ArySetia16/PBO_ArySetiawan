import java.util.*;
public class NestedIF {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int bilangan;
        System.out.println("masukan sebuah bilangan (1-100): ");
        bilangan = in.nextInt();
        /*if (bilangan < 1) {
            System.out.println(+bilangan+ " bilangan kurang dari 1");
            System.out.println("silahkan masukan bilangan 1-100");
        } else if (bilangan > 100) {
            System.out.println(+bilangan+ " bilangan lebih dari 100");
            System.out.println("silahkan masukan bilangan 1-100");
         if (bilangan < 1 || bilangan > 100) {
            System.out.println(+bilangan+ " kurang dari 1 atau lebih dari 100");
            System.out.println("silahkan masukan bilangan 1-100");
        }else {
            System.out.println("bilangan yang anda masukan benar");
            if (bilangan % 2 == 0) {
                        System.out.println(+bilangan+ " adalah bilangan GENAP");
                    } else {
                        System.out.println(+bilangan+ " adalah bilangan GANJIL");
                    }

        }*/
         if (bilangan > 0 && bilangan <= 100) {
            System.out.println("bilangan yang anda masukan benar");
            if (bilangan % 2 == 0) {
                        System.out.println(+bilangan+ " adalah bilangan GENAP");
                    } else {
                        System.out.println(+bilangan+ " adalah bilangan GANJIL");
                    }
            
         }
    }
}
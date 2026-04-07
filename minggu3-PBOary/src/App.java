import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int bilangan;
        System.out.println("masukan bilangan: ");
        bilangan = in.nextInt();
        if (bilangan % 2 == 0) {
            System.out.println(+bilangan+ " adalah bilangan GENAP");
        } else {
            System.out.println(+bilangan+ " adalah bilangan GANJIL");
        }
    }
}

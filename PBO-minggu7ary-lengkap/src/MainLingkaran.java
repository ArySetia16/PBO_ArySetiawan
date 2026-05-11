import java.util.Scanner;

class Lingkaran {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double luas() {
        return Math.PI * jariJari * jariJari;
    }

    double keliling() {
        return 2 * Math.PI * jariJari;
    }
}

public class MainLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("  Program Hitung Lingkaran");
        System.out.println("================================");
        System.out.print("Masukkan Jari-jari Lingkaran : ");
        double r = sc.nextDouble();

        Lingkaran lingkaran = new Lingkaran(r);

        System.out.println("--------------------------------");
        System.out.printf("Jari-jari  : %.2f%n", r);
        System.out.printf("Luas       : %.2f%n", lingkaran.luas());
        System.out.printf("Keliling   : %.2f%n", lingkaran.keliling());
        System.out.println("================================");

        sc.close();
    }
}
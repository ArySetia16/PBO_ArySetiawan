import java.util.Scanner;

// Class Konversi
class Konversi {
    private double fahrenheit;

    // Constructor
    public Konversi(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // Method konversi Fahrenheit ke Celcius
    public double toCelcius() {
        return (fahrenheit - 32.0) * 5 / 9;
    }
}

// Class utama
public class HitungKonversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM KONVERSI FAHRENHEIT KE CELCIUS");
        System.out.print("Masukkan nilai Fahrenheit: ");
        double f = input.nextDouble();

        // Membuat objek Konversi
        Konversi konversi = new Konversi(f);

        // Menampilkan hasil
        System.out.println("==========================================");
        System.out.printf("Besar pembelian Fahrenheit : %.2f\n", f);
        System.out.printf("Hasil konversi ke Celcius  : %.4f\n", konversi.toCelcius());
    }
}

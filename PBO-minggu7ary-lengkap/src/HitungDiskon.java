import java.util.Scanner;

// Class Diskon
class Diskon {
    private double totalBelanja;

    // Constructor
    public Diskon(double totalBelanja) {
        this.totalBelanja = totalBelanja;
    }

    // Method menghitung potongan
    public double potong() {
        if (totalBelanja < 1000000) {
            return 0;
        } else if (totalBelanja <= 5000000) {
            return totalBelanja * 0.20;
        } else {
            return totalBelanja * 0.35;
        }
    }

    // Method menghitung harga setelah diskon
    public double bayar() {
        return totalBelanja - potong();
    }
}

// Class utama
public class HitungDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG DISKON PEMBELIAN");
        System.out.print("Besar pembelian barang Rp. ");
        double belanja = input.nextDouble();

        // Membuat objek Diskon
        Diskon diskon = new Diskon(belanja);

        // Menampilkan hasil
        System.out.println("==========================================");
        System.out.printf("Besar pembelian barang Rp. %.2f\n", belanja);
        System.out.printf("Besar diskon yang diberikan Rp. %.2f\n", diskon.potong());
        System.out.printf("Besar harga yang harus dibayarkan Rp. %.2f\n", diskon.bayar());
    }
}

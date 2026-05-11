import java.util.Scanner;

// Class Perpustakaan
class Perpustakaan {
    private String kodeBuku;
    private int banyakPinjam;

    // Constructor
    public Perpustakaan(String kodeBuku, int banyakPinjam) {
        this.kodeBuku = kodeBuku;
        this.banyakPinjam = banyakPinjam;
    }

    // Method untuk menentukan tarif sewa
    public int tarif() {
        if (kodeBuku.equalsIgnoreCase("C")) {
            return 500 * banyakPinjam;
        } else if (kodeBuku.equalsIgnoreCase("K")) {
            return 700 * banyakPinjam;
        } else if (kodeBuku.equalsIgnoreCase("N")) {
            return 1000 * banyakPinjam;
        } else {
            return 0; // jika kode salah
        }
    }

    // Method untuk menentukan jenis buku
    public String jenisBuku() {
        if (kodeBuku.equalsIgnoreCase("C")) {
            return "Cerpen";
        } else if (kodeBuku.equalsIgnoreCase("K")) {
            return "Komik";
        } else if (kodeBuku.equalsIgnoreCase("N")) {
            return "Novel";
        } else {
            return "Tidak diketahui";
        }
    }
}

// Class utama
public class HitungSewaBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Perpustakaan \"Kecil-Kecilan\"");
        System.out.println("----------------------------");
        System.out.print("Nama Penyewa Buku : ");
        String nama = input.nextLine();
        System.out.print("Kode Buku [C/K/N] : ");
        String kode = input.nextLine();
        System.out.print("Banyak Pinjam     : ");
        int pinjam = input.nextInt();

        // Membuat objek Perpustakaan
        Perpustakaan sewa = new Perpustakaan(kode, pinjam);

        // Hitung tarif
        int tarifSewa = sewa.tarif();
        String jenis = sewa.jenisBuku();

        // Output
        System.out.println("\nHASIL PROSES");
        System.out.println("Tarif Sewa Rp. " + tarifSewa);
        System.out.println("Jenis Buku : " + jenis);
        System.out.println("Penyewa dengan Nama " + nama);
        System.out.println("Jumlah Bayar Penyewaan Sebesar Rp. " + tarifSewa);
    }
}

import java.util.Scanner;

// Class Perpustakaan
class Perpustakaan {
    private String golongan;
    private int lamaPinjam;

    // Constructor
    public Perpustakaan(String golongan, int lamaPinjam) {
        this.golongan = golongan;
        this.lamaPinjam = lamaPinjam;
    }

    // Method menghitung harga sewa
    public int hitungSewa() {
        if (golongan.equalsIgnoreCase("A")) {
            return 200;
        } else if (golongan.equalsIgnoreCase("B")) {
            return 250;
        } else if (golongan.equalsIgnoreCase("C")) {
            return 150;
        } else {
            return 0; // jika kode salah
        }
    }

    // Method menghitung denda
    public int hitungDenda() {
        if (lamaPinjam > 7) {
            return (lamaPinjam - 7) * 100;
        } else {
            return 0;
        }
    }

    // Method menghitung total bayar
    public int totalBayar() {
        return hitungSewa() + hitungDenda();
    }
}

// Class utama
public class PerpustakaanDesa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Perpustakaan Rakyat Pedesaan");
        System.out.println("----------------------------");
        System.out.print("Nama Peminjam : ");
        String nama = input.nextLine();
        System.out.print("Golongan Buku [A/B/C] : ");
        String golongan = input.nextLine();
        System.out.print("Lama Peminjaman (hari) : ");
        int lama = input.nextInt();

        // Membuat objek Perpustakaan
        Perpustakaan pinjam = new Perpustakaan(golongan, lama);

        // Hitung hasil
        int sewa = pinjam.hitungSewa();
        int denda = pinjam.hitungDenda();
        int total = pinjam.totalBayar();

        // Output
        System.out.println("\nPerpustakaan Rakyat Pedesaan");
        System.out.println("Pembayaran Peminjaman Buku");
        System.out.println("----------------------------");
        System.out.println("Nama Peminjam : " + nama);
        System.out.println("Harga Sewa Buku : Rp. " + sewa);
        System.out.println("Lama Peminjaman : " + lama + " Hari");
        System.out.println("Jumlah Bayar : Rp. " + sewa);
        System.out.println("Besar Denda : Rp. " + denda);
        System.out.println("------------------------------------------------");
        System.out.println("Jumlah yang Harus dibayar Rp. " + total);
    }
}

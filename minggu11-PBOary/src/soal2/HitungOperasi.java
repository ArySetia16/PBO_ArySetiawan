package soal2;
import java.util.Scanner;

// Kelas Operasi dengan enkapsulasi
class Operasi {
    private double satu;
    private double dua;

    // Setter
    public void setSatu(double a) {
        satu = a;
    }

    public void setDua(double b) {
        dua = b;
    }

    // Getter
    public double getSatu() {
        return satu;
    }

    public double getDua() {
        return dua;
    }

    // Operasi hitung
    public double tambah() {
        return satu + dua;
    }

    public double kurang() {
        return satu - dua;
    }

    public double kali() {
        return satu * dua;
    }

    public double bagi() {
        if (dua == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan!");
        }
        return satu / dua;
    }
}

public class HitungOperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operasi operasi = new Operasi();

        try {
            System.out.print("Masukkan nilai pertama: ");
            double a = input.nextDouble();
            operasi.setSatu(a);

            System.out.print("Masukkan nilai kedua: ");
            double b = input.nextDouble();
            operasi.setDua(b);

            System.out.println("Hasil Penjumlahan: " + operasi.tambah());
            System.out.println("Hasil Pengurangan: " + operasi.kurang());
            System.out.println("Hasil Perkalian: " + operasi.kali());
            System.out.println("Hasil Pembagian: " + operasi.bagi());

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}

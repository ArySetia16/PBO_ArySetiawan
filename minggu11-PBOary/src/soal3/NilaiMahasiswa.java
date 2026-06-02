package soal3;
import java.util.Scanner;

// Kelas dasar dengan enkapsulasi
class Nilai {
    private double uts;
    private double uas;

    public void setUTS(double u) {
        uts = u;
    }

    public void setUAS(double u) {
        uas = u;
    }

    public double getUTS() {
        return uts;
    }

    public double getUAS() {
        return uas;
    }
}

// Kelas turunan untuk menghitung nilai akhir
class HitungNilai extends Nilai {
    public double nilaiAkhir() {
        return (getUTS() * 0.4) + (getUAS() * 0.6);
    }

    public char grade() {
        double nilai = nilaiAkhir();
        if (nilai >= 80) {
            return 'A';
        } else if (nilai >= 70) {
            return 'B';
        } else if (nilai >= 60) {
            return 'C';
        } else if (nilai >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }
}

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HitungNilai hn = new HitungNilai();

        try {
            System.out.print("Masukkan nilai UTS: ");
            double uts = input.nextDouble();
            hn.setUTS(uts);

            System.out.print("Masukkan nilai UAS: ");
            double uas = input.nextDouble();
            hn.setUAS(uas);

            double akhir = hn.nilaiAkhir();
            char grade = hn.grade();

            System.out.println("Nilai Akhir: " + akhir);
            System.out.println("Grade: " + grade);

        } catch (Exception e) {
            System.out.println("Kesalahan input: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}

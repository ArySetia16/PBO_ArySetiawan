import java.util.Scanner;

public class Rata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int nilaipertandingan1, nilaipertandingan2, nilaipertandingan3;

        System.out.println("PROGRAM HITUNG NILAI RATA-RATA");
        System.out.println("");

        System.out.print("Masukan Nama Peserta: ");
        nama = input.nextLine();

        System.out.print("Masukan Nilai Pertandingan 1: ");
        nilaipertandingan1 = input.nextInt();
        System.out.print("Masukan Nilai Pertandingan 2: ");
        nilaipertandingan2 = input.nextInt();
        System.out.print("Masukan Nilai Pertandingan 3: ");
        nilaipertandingan3 = input.nextInt();

        int NilaiRataRata = (nilaipertandingan1 + nilaipertandingan2 + nilaipertandingan3) / 3;
        
        String hadiah;
        if (NilaiRataRata >= 85) {
            hadiah = "Seperangkat Komputer P4";
        } else if (NilaiRataRata >= 70) {
            hadiah = "Seperangkat uang sebesar Rp. 500.000";
        } else {
            hadiah = "Hadiah Hiburan";
        }

        System.out.println("\nSiswa Bernama " + nama);
        System.out.println("Memperoleh nilai rata-rata " + NilaiRataRata + " dari hasil perlombaan yang diikuti");
        System.out.println("dan berhak mendapatkan hadiah " + hadiah);

        input.close();
    }
}
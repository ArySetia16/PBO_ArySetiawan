import java.util.Scanner;

public class HitungNilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang = 'Y';

        do {
            System.out.println("PROGRAM HITUNG NILAI AKHIR MATAKULIAH PBO UNDIRA");
            System.out.print("Masukkan Jumlah Mahasiswa: ");
            int jumlah = input.nextInt();
            input.nextLine();

            // Header output
            System.out.println("\nDAFTAR NILAI");
            System.out.println("MATERI : PEMROGRAMAN PBO");
            System.out.println("-------------------------------------------------------------");
            System.out.println("No. Nama Mahasiswa   Tugas   UTS   UAS   Akhir   Grade");
            System.out.println("-------------------------------------------------------------");

            for (int i = 1; i <= jumlah; i++) {
                System.out.println("Mahasiswa Ke - " + i);

                System.out.print("Nama Mahasiswa : ");
                String nama = input.nextLine();

                System.out.print("Nilai Tugas : ");
                double tugas = input.nextDouble();

                System.out.print("Nilai UTS : ");
                double uts = input.nextDouble();

                System.out.print("Nilai UAS : ");
                double uas = input.nextDouble();
                input.nextLine();

                // Hitung nilai murni
                double nilaiTugas = tugas * 0.30;
                double nilaiUTS = uts * 0.30;
                double nilaiUAS = uas * 0.40;
                double nilaiAkhir = nilaiTugas + nilaiUTS + nilaiUAS;

                // Tentukan grade
                String grade;
                if (nilaiAkhir >= 80) {
                    grade = "A";
                } else if (nilaiAkhir >= 70) {
                    grade = "B";
                } else if (nilaiAkhir >= 59) {
                    grade = "C";
                } else if (nilaiAkhir >= 50) {
                    grade = "D";
                } else {
                    grade = "E";
                }

                // Cetak hasil
                System.out.printf("%-3d %-15s %-6.1f %-5.1f %-5.1f %-6.1f %-5s\n",
                        i, nama, tugas, uts, uas, nilaiAkhir, grade);
            }

            System.out.println("-------------------------------------------------------------");

            System.out.print("Apakah ingin mengulang program? (Y/T): ");
            ulang = input.next().charAt(0);
            input.nextLine(); 

        } while (ulang == 'Y' || ulang == 'y');

        System.out.println("Program selesai.");
        input.close();
    }
}

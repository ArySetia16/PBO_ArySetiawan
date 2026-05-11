import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("  PROGRAM HITUNG NILAI AKHIR");
        System.out.println("  MATERI : PEMROGRAMAN C++");
        System.out.println("=========================================");
        System.out.print("\nMasukkan Jumlah Mahasiswa : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] nama       = new String[jumlah];
        double[] nilaiTugas = new double[jumlah];
        double[] nilaiUTS   = new double[jumlah];
        double[] nilaiUAS   = new double[jumlah];
        double[] nilaiAkhir = new double[jumlah];
        char[]   grade      = new char[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Mahasiswa Ke-" + (i + 1) + " ---");
            System.out.print("Nama Mahasiswa  : ");
            nama[i] = sc.nextLine();
            System.out.print("Nilai Tugas     : ");
            nilaiTugas[i] = sc.nextDouble();
            System.out.print("Nilai UTS       : ");
            nilaiUTS[i] = sc.nextDouble();
            System.out.print("Nilai UAS       : ");
            nilaiUAS[i] = sc.nextDouble();
            sc.nextLine();

            double murniTugas = nilaiTugas[i] * 0.30;
            double murniUTS   = nilaiUTS[i]   * 0.30;
            double murniUAS   = nilaiUAS[i]   * 0.40;
            nilaiAkhir[i] = murniTugas + murniUTS + murniUAS;

            if      (nilaiAkhir[i] >= 80) grade[i] = 'A';
            else if (nilaiAkhir[i] >= 70) grade[i] = 'B';
            else if (nilaiAkhir[i] >= 59) grade[i] = 'C';
            else if (nilaiAkhir[i] >= 50) grade[i] = 'D';
            else                          grade[i] = 'E';
        }

        System.out.println("\n\n             DAFTAR NILAI");
        System.out.println("         MATERI : PEMROGRAMAN C++");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-4s %-15s %-7s %-7s %-7s %-8s %-5s%n",
                "No.", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Grade");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-4d %-15s %-7.2f %-7.2f %-7.2f %-8.2f %-5s%n",
                    (i + 1), nama[i],
                    nilaiTugas[i], nilaiUTS[i], nilaiUAS[i],
                    nilaiAkhir[i], grade[i]);
        }
        System.out.println("--------------------------------------------------------------");

        sc.close();
    }
}
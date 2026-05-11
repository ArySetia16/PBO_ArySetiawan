import java.util.Scanner;

public class HonorKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double HONOR_TETAP = 700000;
        final double HONOR_LEMBUR_PERJAM = 2500;
        final int JAM_NORMAL = 240;

        System.out.println("Program Hitung Honor Karyawan Kontrak PT. EASY");
        System.out.print("Masukkan Jumlah Karyawan : ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlah];
        int[] golongan = new int[jumlah];
        int[] pendidikan = new int[jumlah];
        int[] jamKerja = new int[jumlah];
        double[] tunjanganJabatan = new double[jumlah];
        double[] tunjanganPendidikan = new double[jumlah];
        double[] honorLembur = new double[jumlah];
        double[] pajak = new double[jumlah];
        double[] gajiBersih = new double[jumlah];

        double totalGaji = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Karyawan Ke - " + (i + 1));
            System.out.print("Nama Karyawan : ");
            nama[i] = input.nextLine();
            System.out.print("Golongan (1/2/3) : ");
            golongan[i] = input.nextInt();
            System.out.print("Pendidikan (1=SMU/2=D3/3=S1) : ");
            pendidikan[i] = input.nextInt();
            System.out.print("Jumlah Jam Kerja : ");
            jamKerja[i] = input.nextInt();
            input.nextLine();

            // Hitung tunjangan jabatan
            switch (golongan[i]) {
                case 1: tunjanganJabatan[i] = HONOR_TETAP * 0.05; break;
                case 2: tunjanganJabatan[i] = HONOR_TETAP * 0.10; break;
                case 3: tunjanganJabatan[i] = HONOR_TETAP * 0.15; break;
                default: tunjanganJabatan[i] = 0;
            }

            // Hitung tunjangan pendidikan
            switch (pendidikan[i]) {
                case 1: tunjanganPendidikan[i] = HONOR_TETAP * 0.025; break;
                case 2: tunjanganPendidikan[i] = HONOR_TETAP * 0.05; break;
                case 3: tunjanganPendidikan[i] = HONOR_TETAP * 0.075; break;
                default: tunjanganPendidikan[i] = 0;
            }

            // Hitung honor lembur
            if (jamKerja[i] > JAM_NORMAL) {
                honorLembur[i] = (jamKerja[i] - JAM_NORMAL) * HONOR_LEMBUR_PERJAM;
            } else {
                honorLembur[i] = 0;
            }

            // Pajak (misalnya 10% dari honor tetap + tunjangan)
            pajak[i] = (HONOR_TETAP + tunjanganJabatan[i] + tunjanganPendidikan[i]) * 0.10;

            // Gaji bersih
            gajiBersih[i] = HONOR_TETAP + tunjanganJabatan[i] + tunjanganPendidikan[i] + honorLembur[i] - pajak[i];

            totalGaji += gajiBersih[i];
        }

        // Output
        System.out.println("\nPT. EASY");
        System.out.println("-----------------------------------------------------------");
        System.out.println("No.\tNama\t\tTunjangan\t\tHonor\tPajak\tGaji");
        System.out.println("\t\tJabatan\tPendidikan\tLembur\t\tBersih");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d\t%-10s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n",
                    (i + 1), nama[i], tunjanganJabatan[i], tunjanganPendidikan[i],
                    honorLembur[i], pajak[i], gajiBersih[i]);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total Gaji yang dikeluarkan Rp. %.2f\n", totalGaji);
    }
}

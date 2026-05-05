import java.util.Scanner;

public class FriedChicken {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kode = new String[100];
        String[] jenis = new String[100];
        int[] harga = new int[100];
        int[] banyak = new int[100];
        int[] jumlah = new int[100];

        int banyakJenis;

        // Tampilan awal
        System.out.println("GEROBAK FRIED CHICKEN");
        System.out.println("---------------------------");
        System.out.println("Kode   Jenis   Harga");
        System.out.println("---------------------------");
        System.out.println("D      Dada    Rp. 2500");
        System.out.println("P      Paha    Rp. 2000");
        System.out.println("S      Sayap   Rp. 1500");
        System.out.println("---------------------------");

        System.out.print("Banyak Jenis : ");
        banyakJenis = input.nextInt();

        // Input data
        for (int a = 0; a < banyakJenis; a++) {
            System.out.println("\nJenis ke - " + (a + 1));
            System.out.print("Jenis Potong [D/P/S] : ");
            kode[a] = input.next().toUpperCase();

            System.out.print("Banyak Potong : ");
            banyak[a] = input.nextInt();

            // Menentukan jenis & harga
            if (kode[a].equals("D")) {
                jenis[a] = "Dada";
                harga[a] = 2500;
            } else if (kode[a].equals("P")) {
                jenis[a] = "Paha";
                harga[a] = 2000;
            } else if (kode[a].equals("S")) {
                jenis[a] = "Sayap";
                harga[a] = 1500;
            } else {
                jenis[a] = "Tidak diketahui";
                harga[a] = 0;
            }

            jumlah[a] = harga[a] * banyak[a];
        }

        // Output
        System.out.println("\nGEROBAK FRIED CHICKEN");
        System.out.println("-------------------------------------------------------");
        System.out.println("No  Jenis   Harga   Banyak   Jumlah");
        System.out.println("-------------------------------------------------------");

        int totalBayar = 0;

        for (int a = 0; a < banyakJenis; a++) {
            System.out.println((a + 1) + "   " + jenis[a] + "   Rp." + harga[a] +
                    "   " + banyak[a] + "   Rp." + jumlah[a]);
            totalBayar += jumlah[a];
        }

        double pajak = totalBayar * 0.1;
        double totalAkhir = totalBayar + pajak;

        System.out.println("-------------------------------------------------------");
        System.out.println("Jumlah Bayar : Rp. " + totalBayar);
        System.out.println("Pajak 10%    : Rp. " + pajak);
        System.out.println("Total Bayar  : Rp. " + totalAkhir);
    }
}
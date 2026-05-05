import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris = 0, kolom = 0;
        System.out.println("Tentukan ORDO untuk Array");
        System.out.print("Masukkan jumlah baris array: ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom array: ");
        kolom = input.nextInt();

        int[][] nilai = new int[baris][kolom];
        int a, b;

        for (a = 0; a < baris; a++) {
            for (b = 0; b < kolom; b++) {
                System.out.print("Masukan nilai index ke-[" +a+ "][" +b+ "]: ");
                nilai[a][b] = input.nextInt();
            }
        }

        for (a = 0; a < baris; a++) {
            for (b = 0; b < kolom; b++) {
                System.out.println("Nilai index ke-[" +a+ "][" +b+ "]: " + nilai[a][b]);
            }
        }

        for (a = 0; a < baris; a++) {
            for (b = 0; b < kolom; b++) {
                System.out.print(nilai[a][b]+ "\t");
            }
            System.out.println();
        }


    }
}
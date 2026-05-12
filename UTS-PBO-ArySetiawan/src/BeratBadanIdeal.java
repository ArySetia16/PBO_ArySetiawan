import java.util.Scanner;

public class BeratBadanIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang = 'Y';

        do {
            System.out.print("Pilih jenis kelamin (L/P) : ");
            char gender = input.next().charAt(0);

            System.out.print("Masukkan tinggi badan Anda (dalam cm) : ");
            int tinggi = input.nextInt();

            int ideal;
            if (gender == 'L' || gender == 'l') {
                ideal = tinggi - 100;
            } else if (gender == 'P' || gender == 'p') {
                ideal = tinggi - 110;
            } else {
                System.out.println("Jenis kelamin tidak valid!");
                continue;
            }

            System.out.println("Berat badan ideal yang seharusnya : " + ideal + " Kg");

            System.out.print("Masukkan berat badan Anda (dalam Kg) : ");
            int berat = input.nextInt();

            int selisih = berat - ideal;

            if (berat <= ideal) {
                System.out.println("Anda masuk kategori Kurus "
                        + "dan harus menambah berat badan sebanyak " + Math.abs(selisih) + " Kg (" + berat + " Kg – " + ideal + " Kg)");
            } else {
                System.out.println("Anda masuk kategori Gemuk "
                        + "dan harus mengurangi berat badan sebanyak " + selisih + " Kg (" + berat + " Kg – " + ideal + " Kg)");
            }

            System.out.print("Apakah ingin mengulang program? (Y/T) : ");
            ulang = input.next().charAt(0);

        } while (ulang == 'Y' || ulang == 'y');

        System.out.println("Program selesai.");
        input.close();
    }
}

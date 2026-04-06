import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai Radius \t: ");
        double radius = sc.nextDouble();
        double luas = Math.PI * radius * radius;
        double keliling = 2 * Math.PI * radius;
        System.out.println("Hasil Perhitungan");
        System.out.println("Luas Lingkaran \t\t: " + luas);
        System.out.println("Keliling Lingkaran \t: " + keliling);
        sc.close();
    }
}

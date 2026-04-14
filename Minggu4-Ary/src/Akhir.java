import java.util.Scanner;

public class Akhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, grade;
        double nilaiKeaktifan, nilaiTugas, nilaiUjian;
        double murniKeaktifan, murniTugas, murniUjian, nilaiAkhir;

        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        System.out.println("");
        System.out.print("Nama Siswa      : ");
        nama = input.nextLine();
        System.out.print("Nilai Keaktifan : ");
        nilaiKeaktifan = input.nextDouble();
        System.out.print("Nilai Tugas     : ");
        nilaiTugas = input.nextDouble();
        System.out.print("Nilai Ujian     : ");
        nilaiUjian = input.nextDouble();

        murniKeaktifan = nilaiKeaktifan * 0.20;
        murniTugas = nilaiTugas * 0.30;
        murniUjian = nilaiUjian * 0.50;
        nilaiAkhir = murniKeaktifan + murniTugas + murniUjian;

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

        System.out.println("\nSiswa yang bernama " + nama);
        System.out.println("Dengan Nilai Persentasi Yang dihasilkan.");
        System.out.println("Nilai Keaktifan * 20% : " + murniKeaktifan);
        System.out.println("Nilai Tugas     * 30% : " + murniTugas);
        System.out.println("Nilai Ujian     * 50% : " + murniUjian);
        System.out.println("");
        System.out.print("Jadi Siswa yang bernama " + nama);
        System.out.println(" memperoleh nilai akhir sebesar " + nilaiAkhir);
        System.out.println("");
        System.out.println("Grade nilai yang didapat adalah " + grade);

        input.close();
    }
}
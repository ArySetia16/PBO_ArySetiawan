package soal1;
import java.util.Scanner;

// Kelas Silinder dengan enkapsulasi
class Silinder {
    private double radius;
    private double tinggi;

    public void setRadius(double r) {
        radius = r; 
    }

    public void setTinggi(double t) {
        tinggi = t; 
    }

    public double getRadius() {
        return radius;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }
}

public class VolumeSilinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Silinder silinder = new Silinder();

        try {
            System.out.print("Masukkan radius silinder: ");
            double r = input.nextDouble();
            if (r < 0) {
                throw new IllegalArgumentException("Radius tidak boleh negatif!");
            }
            silinder.setRadius(r);

            System.out.print("Masukkan tinggi silinder: ");
            double t = input.nextDouble();
            if (t < 0) {
                throw new IllegalArgumentException("Tinggi tidak boleh negatif!");
            }
            silinder.setTinggi(t);

            double volume = silinder.hitungVolume();
            System.out.println("Volume silinder adalah: " + volume);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}


    package minggu2.arysetiawan;

    import java.util.Scanner;
    public class Minggu2ArySetiawan {

        public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        String nama;
        char GolonganDarah;
        int umur;

        System.out.print("Masukan Nama Anda : ");
        nama = masuk.nextLine();
        
        
        System.out.print("Masukan Golongan Darah Anda : ");
        GolonganDarah = masuk.next().charAt(0);
        
        
        System.out.print("Masukan Umur Anda : ");
        umur = masuk.nextInt();
        
        
        System.out.println("\nNama Anda  : " + nama);
        System.out.println("Nilai Anda : " + GolonganDarah );
        System.out.println("Nilai Anda : " + umur );
        
        
        masuk.close();
        }

    }

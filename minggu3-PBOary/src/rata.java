import java.util.*;
public class rata{
    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String nama;
        int nilai1, nilai2, nilai3;
        int RataRata;
        System.out.println("masukan nama siswa: ");
        nama = in.nextLine();
        System.out.println("masukan nilai 1: ");
        nilai1 = in.nextInt();
        System.out.println("masukan nilai 2: ");
        nilai2 = in.nextInt();
        System.out.println("masukan nilai 3: ");
        nilai3 = in.nextInt();

        RataRata = (nilai1 + nilai2 + nilai3) / 3;
        System.out.println("Rata-Rata nilai " +nama+ " adalah" +RataRata);

        
    }
}

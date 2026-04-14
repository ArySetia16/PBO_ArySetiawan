import java.util.*;
public class Switchcase {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        char pilih;
        String prodi= null;
        System.out.println("masukan pilihan A-C: ");
        pilih = input.next().charAt(0);
        switch (pilih) {
            case 'A':
                prodi = "informatika";
                break;
            case 'B':
                prodi = "sistem informasi";
                break;
            case 'C':
                prodi = "teknik komputer";
            default:
                System.out.println("pilihan tidak valid");
                break;

        }
    System.out.println("prodi yang anda pilih adalah: "+prodi);
    }
}
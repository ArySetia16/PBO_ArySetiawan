public class Segitiga{
    public static void main(String[] args) {
        int tinggi = 10; // jumlah baris

        for (int a = 1; a <= tinggi; a++) {

            // mencetak spasi
            for (int b = 1; b <= tinggi - a; b++) {
                System.out.print(" ");
            }
            // mencetak bintang
            for (int c = 1; c <= (2 * a - 1); c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
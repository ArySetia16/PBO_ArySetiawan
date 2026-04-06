import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai Celcius:" );
        double celcius = input.nextDouble();


        double fahrenheit = (celcius * 9/5) + 32;  
        System.out.println("Nilai Fahrenheit: " + fahrenheit);
        input.close();

    }
}

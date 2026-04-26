public class Latihan4prima {
     public static void main(String[] args) {
        int batas = 20; 

        System.out.print("Bilangan Prima: ");

        for (int i = 2; i <= batas; i++) {
            int counter = 0;

    
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }

         
            if (counter == 2) {
                System.out.print(i);
                
            
                if (i < 19) {
                    System.out.print(", ");
                }
            }
        }
    }
}
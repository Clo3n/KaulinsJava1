import java.util.Random;
import java.util.Scanner;

public class Kods {

    static void mestKaulinu(int reizes) {
        int skaitlis;
        Random rand = new Random();
        for(int i=0;i<reizes;i++){
            skaitlis = rand.nextInt(6) + 1;
            System.out.println("Uzkrita skaitlis: " + skaitlis);
        }
    }
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);

        System.out.print("Cik reizes mest kauliņu? ");
        int reizes = dati.nextInt();

        mestKaulinu(reizes);
        
        dati.close();   
    }
}
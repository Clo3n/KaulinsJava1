import java.util.Random;

public class Kods {
    static void mestKaulinu() {
        int skaitlis;
        Random rand = new Random();
        skaitlis = rand.nextInt(6) + 1;
        System.out.println("Uzkrita skaitlis: " + skaitlis);
    }

    public static void main(String[] args) {
        for (int i=0;i<3;i++) {
        mestKaulinu();
        }
    }
}
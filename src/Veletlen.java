import java.util.Random;

public class Veletlen {
    public static void csinald() {
        Random rnd = new Random();
        int szam = rnd.nextInt(3);
        System.out.println("Veletlen szam: " + szam);

        int kocka = rnd.nextInt(6) + 1;
        System.out.println("Kockadobas: " + kocka);
    }
}

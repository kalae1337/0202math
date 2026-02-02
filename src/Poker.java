import java.util.Random;

public class Poker {
    public static void play() {
        Random rnd = new Random();
        //2 ugyanolyan nyerobb, ket par, harom ugyanolyan
        //5 db egymas mellett
        System.out.print("Kockapoker: ");
        for(int i = 1; i< 6; i++) {
            System.out.print(rnd.nextInt(6)+1 + " ");
        }
    }
}

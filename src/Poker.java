import java.util.Random;

public class Poker {
    public static void play() {
        playHuman();
        playMachine();
    }
    public static void playHuman() {
        Random rnd = new Random();

        System.out.print("ember:\t");
        for(int i = 1; i< 6; i++) {
            System.out.print(rnd.nextInt(6)+1 + " ");
        }
        System.out.println();
    }
    public static void playMachine() {
        Random rnd = new Random();

        System.out.print("gep:\t");
        for(int i = 1; i< 6; i++) {
            System.out.print(rnd.nextInt(6)+1 + " ");
        }
}
}

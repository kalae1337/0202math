import java.util.Random;

public class Poker {
    public static void play() {
        playerThrow("Ember");
        playerThrow("Gep");
    }
    
    public static void playerThrow(String role) {
        Random rnd = new Random();

        System.out.print(role +":\t");
        for(int i = 1; i< 6; i++) {
            System.out.print(rnd.nextInt(6)+1 + " ");
        }
        System.out.println();
}
}

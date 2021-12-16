import java.util.Random;

public class Coin {

    public static void TossCoin() {

        Random random = new Random();
        if (random.nextInt(2) == 1) {
            System.out.println("Eagle");
        } else {
            System.out.println("Tails");
        }

    }

    public static void main(String[] args) {
        Coin.TossCoin();
        Coin.TossCoin();
        Coin.TossCoin();
    }

}

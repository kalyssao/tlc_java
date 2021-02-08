import java.util.Random;
public class RandIntWhile {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(3 + 3) - 3;
        while ( num != 0 ) {
            System.out.println(num);
            num = random.nextInt(3 + 3) - 3;
        }
    }
}

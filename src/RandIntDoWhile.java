import java.util.Random;
public class RandIntDoWhile {
    public static void main(String[] args) {
        int num;
        do {
             Random random = new Random();
             num = random.nextInt(3 + 3) - 3;
            System.out.println(num);
        } while (num != 0);
    }
}

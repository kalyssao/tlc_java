import java.util.Random;
public class PrintRange {
    public static void main(String[] args) {

        int num;

        int count = 0;
        while ( count != 6 ){
            num = generateNumber(20);
            System.out.println(num);
            ++count;
        }
    }

    public static int generateNumber(){
        Random random = new Random();
        int num = random.nextInt( 49 - 1 ) + 1;
        return num;
    }

    public static int generateNumber(int n){
        Random random = new Random();
        int num = random.nextInt( n - 1 ) + 1;
        return num;
    }
}

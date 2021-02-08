public class RandomInt {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1;

        if (num % 2 == 0 ){
            System.out.println("even! "+ num);
        }
        System.out.println("odd! "+ num);
    }
}

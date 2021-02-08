public class RandomIntModulo {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;

        if (num == 0) {
            System.out.println("frozen");
        } else if (num >= 1 && num <= 14) {
            System.out.println("cold");
        } else if (num >= 15 && num <= 24) {
            System.out.println("cool");
        } else if (num >= 25 && num <= 40) {
            System.out.println("warm");
        } else if (num >= 41 && num <= 60) {
            System.out.println("hot");
        } else if (num >= 61 && num <= 80) {
            System.out.println("very hot");
        } else {
            System.out.println("boiling");
        }
    }
}

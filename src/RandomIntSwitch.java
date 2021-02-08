public class RandomIntSwitch {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 9) + 0;

        switch(num){
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            default:
                System.out.println("nine");
                break;
        }

    }
}

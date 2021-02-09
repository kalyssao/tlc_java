public class Calculator {

    public static int calculate( String operation, int i, int j){
        if (operation.equals("add")){
            return new AddTwo().apply(i, j);
        } else if (operation.equals("subtract")){
            return new SubTwo().apply(i, j);
        } else {
            System.out.println("nothing yet");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate("add", 4, 3));
        System.out.println(calculate("subtract", 12, 4));
    }
}


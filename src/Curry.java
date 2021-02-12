import java.util.function.Function;

public class Curry {
    public static Function<Integer, Function<Integer, Integer>> add(){
        return x -> y -> x+y;
    }

    public static void main(String[] args) {
        System.out.println(add().apply(3).apply(4));
    }
}

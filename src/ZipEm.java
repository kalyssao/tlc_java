import java.util.function.BiFunction;

public class ZipEm implements BiFunction<String, String, Tuple> {
    @Override
    public Tuple apply(String t, String u) {
        Tuple res = new Tuple(t, u);
        return res;
    }
}

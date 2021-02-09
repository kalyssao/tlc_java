import java.util.function.BiFunction;

public class SubTwo implements BiFunction<Integer, Integer, Integer> {
    @Override
    public Integer apply(Integer t, Integer u) {
        return t - u;
    }
}

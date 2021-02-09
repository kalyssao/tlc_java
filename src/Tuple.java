public class Tuple {
    String x;
    String y;

    public Tuple(String x, String y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("
                + x + "," + y + ")";
    }
}

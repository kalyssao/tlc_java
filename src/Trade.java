import java.time.LocalTime;
public class Trade {
    String symbol;
    String date;
    int quantity;
    Double price;
    LocalTime time;

    public void convertToTime(String timestamp){
        long newTimestamp = Long.parseLong(timestamp);
        this.time = LocalTime.ofNanoOfDay(newTimestamp * 1000000);
    }

    @Override
    public String toString() {
        return "Trade{" +
                "symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}

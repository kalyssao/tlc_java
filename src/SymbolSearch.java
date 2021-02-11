import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SymbolSearch {
//    static Function<String, Trade> mapLineToTrade = new Function<>() {
//        public Trade apply(String line) {
//
//            Trade trade = new Trade();
//
//            Scanner sc = new Scanner(line).useDelimiter(",");
//
//            trade.symbol = sc.next();
//            trade.date = sc.next();
//            trade.convertToTime(sc.next());
//            trade.quantity = Integer.parseInt(sc.next());
//            trade.price = Double.parseDouble(sc.next());
//
//            if (sc.hasNextLine()) {
//                sc.nextLine();
//            }
//
//            return trade;
//        }
//    };

//    public static List<Trade> setUp(File file) throws IOException {
//        List<Trade> trades = Files
//                .lines(file.toPath())
//                .map(mapLineToTrade)
//                .collect(Collectors.toList());
//        return trades;
//    }


    public static Optional<Trade> searchGivenSymbol(String symbol) throws IOException{
        File file = new File("C:\\Users\\TURNTABL\\IdeaProjects\\JavaLabs\\src\\Trades.txt");

        List<Trade> trades = new ArrayList<>();
        Trade t1 = new Trade("T1", "APPL", 10, 40.0);
        Trade t2 = new Trade("T2", "TSLA", 10, 50.0);


        trades.add(t1);
        trades.add(t2);

        Optional<Trade> result = trades.stream()
                .filter(t -> "TSLA".equals(t.getSymbol()))
                .findFirst();

        return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(searchGivenSymbol("APPL"));
    }

}

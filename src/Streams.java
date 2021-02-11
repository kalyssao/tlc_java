import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void printLine(){
        File file = new File("C:\\Users\\TURNTABL\\IdeaProjects\\JavaLabs\\src\\Trades.txt");
        try {
            Stream<String> lines = Files.lines(file.toPath());
            lines.forEach(System.out::println);
        } catch (IOException e){
            System.out.println("IO Exception");
        }
    }

    static Function<String, Trade> mapLineToTrade = new Function<>() {
        public Trade apply(String line) {

            Trade trade = new Trade();

            Scanner sc = new Scanner(line).useDelimiter(",");

            trade.symbol = sc.next();
            trade.date = sc.next();
            trade.convertToTime(sc.next());
            trade.quantity = Integer.parseInt(sc.next());
            trade.price = Double.parseDouble(sc.next());

            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            return trade;
        }
    };

    public static void convertToTrade(File file) throws IOException{

        List<Trade> trades = Files
                .lines(file.toPath())
                .map(mapLineToTrade)
                .collect(Collectors.toList());

        System.out.println(trades);

    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\TURNTABL\\IdeaProjects\\JavaLabs\\src\\Trades.txt");

        convertToTrade(file);
    }
}

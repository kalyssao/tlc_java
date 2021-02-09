import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyZip{
    public static <T, U, R> List<Tuple> zipElements( List<String> list1, List<String> list2){
        List<Tuple> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++){
            result.add(new ZipEm().apply(list1.get(i), list2.get(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("1", "2", "3");
        List<String> list2 = Arrays.asList("4", "5", "6");

        List<Tuple> result = zipElements(list1, list2);
        System.out.println(result);

    }
}

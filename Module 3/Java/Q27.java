import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Mango");
        Collections.sort(list, (a, b) -> a.compareTo(b));
        list.forEach(System.out::println);
    }
}

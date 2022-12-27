import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream().filter(x -> x > 0 && (x % 2) == 0).
                sorted(Comparator.naturalOrder()).
                forEach(System.out::println);
    }
}
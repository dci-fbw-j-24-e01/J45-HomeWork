import java.util.ArrayList;
import java.util.List;

public class NumberOfStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("stubbornness");
        list.add("power");
        list.add("alongside");
        list.add("power");
        list.add("conviction");
        list.add("connected");
        list.add("stubbornness");
        list.add("tenacious");

        long count = list.stream()
                .filter(x -> x.startsWith("p"))
                .count();
        System.out.println(count);
    }
}

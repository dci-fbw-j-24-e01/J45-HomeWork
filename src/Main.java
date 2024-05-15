import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("stubbornness");
    list.add("power");
    list.add("alongside");
    list.add("conviction");
    list.add("connected");
    list.add("tenacious");

List<String> upperCase = list.stream()
        .map(String::toUpperCase)
        .toList();

        System.out.println(upperCase);
    }
}
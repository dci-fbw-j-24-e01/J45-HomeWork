import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Alphabet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("improve");
        list.add("power");
        list.add("plagiarism");
        list.add("alongside");
        list.add("conviction");
        list.add("keyword");
        list.add("bookmark");

List<String> alphabet = list.stream()
        .sorted()
        .toList();

        System.out.println(alphabet);
    }
}

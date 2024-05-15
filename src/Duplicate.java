import java.util.ArrayList;
import java.util.List;

public class Duplicate {
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

        List<String> withoutDuplicate =list.stream()
                .distinct()
                .toList();
        System.out.println(list);
        System.out.println(withoutDuplicate);
    }
}

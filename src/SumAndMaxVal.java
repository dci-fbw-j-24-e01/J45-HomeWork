import java.util.*;
import java.util.stream.Collectors;

public class SumAndMaxVal {
    public static void main(String[] args) {


        List<Integer> numbersForSum = Arrays.asList(1, 2, 3, 4, 8, 51, 2, 9, 0, -2);
        int result = numbersForSum.stream()
                .reduce(0, Integer::sum);
        System.out.println("The sum - " + result);
        System.out.println();

        Optional<Integer> maxVal = numbersForSum.stream()
                .reduce(Integer::max);
        int x = maxVal.get();
//        OptionalInt maxVal = numbersForSum.stream()
//                .mapToInt(Integer::intValue)
//                .max();
        System.out.println("Maximum value - " + x);
        System.out.println();

        int minVal = numbersForSum.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(Integer.MIN_VALUE);

        System.out.println("Second smallest element - " + minVal);
        System.out.println();

        int secondMaxVal = numbersForSum.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(Integer.MAX_VALUE);

        System.out.println("Second largest element - " + secondMaxVal);
        System.out.println();

        double doubleStream = numbersForSum.stream()
//                .collect(Collectors.summarizingDouble(Double::doubleValue));
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average of a list of integers - " + doubleStream);
    }
}
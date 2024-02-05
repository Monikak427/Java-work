package streams;

import java.util.Arrays;

public class CapitalizeAndSortStrings {

    public static String[] capitalizeAndSort(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted()
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] strings = {"elephant", "dog", "cat", "rabbit"};
        String[] result = capitalizeAndSort(strings);

        Arrays.stream(result).forEach(System.out::println);
    }
}

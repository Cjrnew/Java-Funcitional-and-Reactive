package functionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Claudio");
        list.add("");
        list.add("Costa");
        list.add("");
        list.add("ClaudioCosta");

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newList = filterList(list, predicate);

        Predicate<String> filter = s -> s.contains("Claudio");
        List<String> filteredList = filterList(list, filter);

        List<Integer> intList = Arrays.asList(1,4,5,7,8);

        Predicate<Integer> integerFilter = e -> e % 2 == 0;
        List<Integer> evens = filterList(intList, integerFilter);

        System.out.println(newList);
        System.out.println(filteredList);
        System.out.println(evens);


    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {

        List<T> newList = new ArrayList<>();

        for (T string : list) {
            if (predicate.test(string)) {
                newList.add(string);
            }

        }
        return newList;
    }
}

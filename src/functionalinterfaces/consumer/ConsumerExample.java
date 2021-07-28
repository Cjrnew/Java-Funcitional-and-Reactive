package functionalinterfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(31, 21 ,54 ,89, 90);

        Consumer<Integer> consumer = System.out::println;

        consumer.accept(100);

        printElements(list, consumer);

    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {

        for (T t : list) {
            consumer.accept(t);
        }
    }
}

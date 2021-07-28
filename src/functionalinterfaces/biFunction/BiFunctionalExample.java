package functionalinterfaces.biFunction;

import java.util.function.BiFunction;

public class BiFunctionalExample {

    public static void main(String[] args) {

        BiFunction<String, String, Integer> biFunction = (a, b) -> (a+b).length() ;

        System.out.println(biFunction.apply("Hello", "World"));

    }
}

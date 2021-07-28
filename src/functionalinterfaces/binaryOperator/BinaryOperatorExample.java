package functionalinterfaces.binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<String> operator = (a, b) -> a + "." + b;

        System.out.println(operator.apply("oracle", "com"));

    }

}

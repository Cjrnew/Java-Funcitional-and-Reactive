package functionalinterfaces.supplier;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> "Test Supplier";
        System.out.println(stringSupplier.get());

        Supplier<Double> randomNumber = Math::random;
        System.out.println(randomNumber.get());

    }

}

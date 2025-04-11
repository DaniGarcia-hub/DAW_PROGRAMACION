package Consumer_Supplier.Ejercicio5;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Double> generarDoubleRandom = () -> {
            Random rand = new Random();
            return rand.nextDouble();
        };

        System.out.println(generarDoubleRandom.get());
    }
}

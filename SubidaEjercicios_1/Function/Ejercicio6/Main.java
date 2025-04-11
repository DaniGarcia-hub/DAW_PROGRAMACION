package Function.Ejercicio6;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> operacionPow = (integer, integer2) -> Math.pow(integer, integer2);
        Consumer<Double> mostrarDouble = aDouble -> System.out.println(aDouble);
        mostrarDouble.accept(operacionPow.apply(2, 4));
    }
}

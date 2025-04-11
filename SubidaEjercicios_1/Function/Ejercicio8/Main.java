package Function.Ejercicio8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> operacionPow = (integer, integer2) -> Math.pow(integer, integer2);
        Function<Double, String> adaptarNumATexto = aDouble -> "Resultado: " + aDouble;
        Consumer<String> mostrarDouble = s -> System.out.println(s);
        mostrarDouble.accept(adaptarNumATexto.apply(operacionPow.apply(2,4)));
    }
}

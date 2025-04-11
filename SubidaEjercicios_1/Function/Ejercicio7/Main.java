package Function.Ejercicio7;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Double, String> adaptarNumATexto = aDouble -> "Resultado: " + aDouble;
        Consumer<String> mostrarString = s -> System.out.println(s);
        mostrarString.accept(adaptarNumATexto.apply(4.15));
    }
}

package Function.Ejercicio1;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> obtenerLongitud = s -> s.length();
        Consumer<Integer> mostrarInt = integer -> System.out.println(integer);
        mostrarInt.accept(obtenerLongitud.apply("Programación"));
    }
}

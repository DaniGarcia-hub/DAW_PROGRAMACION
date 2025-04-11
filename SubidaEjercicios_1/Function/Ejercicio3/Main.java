package Function.Ejercicio3;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> obtenerLongitud = s -> s.length();
        Function<Integer, Integer> potenciaDos = integer -> (int) Math.pow(2, integer);
        Consumer<Integer> mostrarInt = integer -> System.out.println(integer);
        mostrarInt.accept(potenciaDos.apply(obtenerLongitud.apply("Programación")));
    }
}

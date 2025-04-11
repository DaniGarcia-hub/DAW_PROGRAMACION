package Function.Ejercicio5;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sumaNumeros =  (integer, integer2) -> integer + integer2;
        Consumer<Integer> mostrarInt = integer -> System.out.println(integer);
        mostrarInt.accept(sumaNumeros.apply(8,7));
    }
}

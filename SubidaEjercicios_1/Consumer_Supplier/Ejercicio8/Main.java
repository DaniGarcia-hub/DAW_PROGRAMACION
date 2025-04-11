package Consumer_Supplier.Ejercicio8;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> multiplicar = (o1, o2) -> System.out.println(o1 * o2);
        BiConsumer<Integer, Integer> suma = (integer, integer2) -> System.out.println(integer + integer2);
        BiConsumer<Integer, Integer> resta = (integer, integer2) -> System.out.println(integer - integer2);
        BiConsumer<Integer, Integer> division = (integer, integer2) -> System.out.println(integer / integer2);

        BiConsumer<Integer, Integer> calcularTodo = suma.andThen(resta.andThen(multiplicar.andThen(division)));
        calcularTodo.accept(2, 4);
    }
}

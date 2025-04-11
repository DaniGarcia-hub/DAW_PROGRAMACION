package Consumer_Supplier.Ejercicio9;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> multiplicar = (o1, o2) -> System.out.println(o1 * o2);
        BiConsumer<Integer, Integer> suma = (integer, integer2) -> System.out.println(integer + integer2);
        BiConsumer<Integer, Integer> resta = (integer, integer2) -> System.out.println(integer - integer2);
        BiConsumer<Integer, Integer> division = (integer, integer2) -> System.out.println(integer / integer2);

        calculator(-9, 7, suma);
    }

    public static void calculator(int valor1, int valor2, BiConsumer<Integer, Integer> expresion){
        expresion.accept(valor1, valor2);
    }
}

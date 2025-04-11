package Consumer_Supplier.Ejercicio7;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> multiplicar = (integer, integer2) -> System.out.println(integer * integer2);
        multiplicar.accept(-9, 7);
    }
}
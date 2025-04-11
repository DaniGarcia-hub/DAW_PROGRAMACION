package Consumer_Supplier.Ejercicio1;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Estoy en clase de programación");
    }
}

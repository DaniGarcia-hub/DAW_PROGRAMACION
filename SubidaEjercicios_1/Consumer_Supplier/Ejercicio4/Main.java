package Consumer_Supplier.Ejercicio4;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> variable = () -> "Java es un lenguaje de programación";
        System.out.println(variable.get());
    }
}
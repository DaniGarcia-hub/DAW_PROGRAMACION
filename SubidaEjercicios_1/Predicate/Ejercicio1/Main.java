package Predicate.Ejercicio1;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> validarCantidad = integer -> integer > 100;
        System.out.println(validarCantidad.test(4));
        System.out.println(validarCantidad.test(120));
    }
}

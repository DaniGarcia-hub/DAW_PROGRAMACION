package Predicate.Ejercicio7;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> es22 = integer -> integer == 22;
        List<Integer> listaEnteros = List.of(26,22,19,75,22,28,48,30,24,16,29);
        System.out.println(listaEnteros.stream().filter(es22).count());
    }
}

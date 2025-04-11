package Predicate.Ejercicio6;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaEnteros = List.of(26,64,19,75,23,28,48,30,24,16,29);
        Predicate<Integer> mayorQue25 = integer -> integer > 25;
        Predicate<Integer> mayorQue30 = integer -> integer < 30;
        listaEnteros.stream().filter(mayorQue25.and(mayorQue30)).forEach(integer -> System.out.println(integer));
    }
}

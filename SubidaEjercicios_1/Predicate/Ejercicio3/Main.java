package Predicate.Ejercicio3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> mayorQue100 = integer -> integer > 100;
        Predicate<Integer> menorQue50 = integer -> integer < 50;
        Predicate<Integer> combinarValidaciones = mayorQue100.or(menorQue50);
        System.out.println(combinarValidaciones.test(110));
        System.out.println(combinarValidaciones.test(80));
        System.out.println(combinarValidaciones.test(40));
    }
}

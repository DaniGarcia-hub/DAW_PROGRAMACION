package Predicate.Ejercicio2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> mayorQue100 = integer -> integer > 100;
        Predicate<Integer> menorQue300 = integer -> integer < 300;
        Predicate<Integer> combinarValidaciones = mayorQue100.and(menorQue300);
        System.out.println(combinarValidaciones.test(150));
        System.out.println(combinarValidaciones.test(90));
        System.out.println(combinarValidaciones.test(320));
    }
}

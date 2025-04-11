package Predicate.Ejercicio4;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> noEsIgualA100 = integer -> integer != 100;
        System.out.println(noEsIgualA100.test(100));
        System.out.println(noEsIgualA100.test(90));
    }
}

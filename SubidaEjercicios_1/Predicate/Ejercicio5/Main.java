package Predicate.Ejercicio5;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String, String> sonIguales = (s, s2) -> s.equals(s2);
        System.out.println(sonIguales.test("hola", "hola"));
        System.out.println(sonIguales.test("adios", "Adios"));
        System.out.println(sonIguales.test("chorizo", "patata"));
    }
}

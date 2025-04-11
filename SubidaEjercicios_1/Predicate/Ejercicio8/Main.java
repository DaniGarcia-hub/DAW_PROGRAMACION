package Predicate.Ejercicio8;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> listaTexto = List.of("Real Madrid", "Barcelona", "Elche", "Bilbao", "Real Sociedad");
        Predicate<String> empiezaPorA = s -> s.toUpperCase().startsWith("A");
        Predicate<String> longitudEs5 = s -> s.length() == 5;
        listaTexto.stream().filter(empiezaPorA.or(longitudEs5)).forEach(s -> System.out.println(s));
    }
}

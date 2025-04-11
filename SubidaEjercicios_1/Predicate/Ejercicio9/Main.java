package Predicate.Ejercicio9;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> validarTexto = s -> !s.toUpperCase().startsWith("P");
        List<String> listaTexto = List.of("Real Madrid", "Barcelona", "Elche", "Bilbao", "Pamplona FC");
        listaTexto.stream().filter(validarTexto).forEach(s -> System.out.println(s));
    }
}
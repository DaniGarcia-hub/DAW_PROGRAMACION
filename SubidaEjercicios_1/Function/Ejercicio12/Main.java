package Function.Ejercicio12;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> listaTextos = Arrays.asList("Uva", "Manzana", "Platano", "Sandía");
        BiFunction<String, String, String> empiezaCon = (s, s2) -> s.toUpperCase().startsWith(s2.toUpperCase()) ? s : null;
        Consumer<String> mostrarContenido = s -> System.out.println(s);
        mostrarContenido.accept(empiezaCon.apply(listaTextos.get(0), "U"));
        mostrarContenido.accept(empiezaCon.apply(listaTextos.get(1), "P"));
        mostrarContenido.accept(empiezaCon.apply(listaTextos.get(2), "Pla"));
        mostrarContenido.accept(empiezaCon.apply(listaTextos.get(3), "Sand"));
    }
}

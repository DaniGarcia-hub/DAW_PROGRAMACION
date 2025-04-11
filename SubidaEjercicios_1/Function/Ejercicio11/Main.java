package Function.Ejercicio11;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> listaTextos = Arrays.asList("Uva", "Manzana", "Platano", "Sandía");
        BiFunction<String, Integer, String> validarLongitud = (s, integer) -> s.length() < integer ? s : null;
        Consumer<String> mostrarContenido =  s -> System.out.println(s);
        mostrarContenido.accept(validarLongitud.apply(listaTextos.get(0),4));
        mostrarContenido.accept(validarLongitud.apply(listaTextos.get(1),3));
        mostrarContenido.accept(validarLongitud.apply(listaTextos.get(2),10));
        mostrarContenido.accept(validarLongitud.apply(listaTextos.get(3),15));
    }
}

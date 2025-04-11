package Function.Ejercicio4;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> listaStrings = Arrays.asList("Melón", "Mandarina", "Plátano", "Uva");
        Function<String, Integer> obtenerLongitud = s -> s.length();
        Consumer<Map<String, Integer>> mostrarDatosMapa = stringIntegerMap -> stringIntegerMap.entrySet().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey() + " | " + stringIntegerEntry.getValue()));
        mostrarDatosMapa.accept(convertirToHashMap(listaStrings, obtenerLongitud));
    }

    public static Map<String, Integer> convertirToHashMap(List<String> lista, Function<String, ?> function){
        Map<String, Integer> mapa = new HashMap<>();
        lista.forEach(s -> mapa.put(s, (Integer) function.apply(s)));
        return mapa;
    }
}

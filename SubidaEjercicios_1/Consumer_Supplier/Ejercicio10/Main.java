package Consumer_Supplier.Ejercicio10;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new LinkedHashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");
        mapa.put(5, "Cinco");
        mapa.forEach((integer, s) -> System.out.println(integer + " | " + s));
    }
}

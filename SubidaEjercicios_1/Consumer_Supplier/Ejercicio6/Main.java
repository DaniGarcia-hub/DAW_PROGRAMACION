package Consumer_Supplier.Ejercicio6;

import java.util.HashMap;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<HashMap<String, String>> crearMapa = () -> new HashMap<>();
        HashMap<String, String> mapa1 = crearMapa.get();
        mapa1.put("1", "Uno");
        mapa1.put("2", "Dos");
        mapa1.forEach((s, s2) -> System.out.println(s + " | " + s2));

        HashMap<String, String> mapa2 = crearMapa.get();
        mapa2.put("casa1", "Torremolinos");
        mapa2.put("casa2", "Malaga");
        mapa2.forEach((s, s2) -> System.out.println(s + " | " + s2));
    }
}

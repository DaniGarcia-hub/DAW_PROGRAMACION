package Consumer_Supplier.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> mostrarUltLetra = s -> System.out.println(s.charAt(s.length()-1));
        List<String> lista = new ArrayList<>();
        lista.add("Madrid");
        lista.add("Barcelona");
        lista.add("Bilbao");
        lista.add("Elche");
        lista.add("Alicante");
        lista.add("Jaén");
        lista.add("Murcia");
        lista.add("Málaga");
        lista.add("Sevilla");
        lista.add("Huesca");
        lista.add("Ourense");

        lista.forEach(mostrarUltLetra);
    }
}

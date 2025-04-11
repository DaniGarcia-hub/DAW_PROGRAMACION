package Consumer_Supplier.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(10);
        lista.add(7);

        lista.forEach(s -> System.out.println(s));
    }
}

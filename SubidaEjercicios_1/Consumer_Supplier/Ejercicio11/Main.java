package Consumer_Supplier.Ejercicio11;

import java.time.LocalTime;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalTime> horaActual = () -> LocalTime.now();
        System.out.println(horaActual.get());
    }
}

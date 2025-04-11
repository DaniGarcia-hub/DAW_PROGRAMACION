package Function.Ejercicio9;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Consumer<String> mostrarTexto = s -> System.out.println(s);
        mostrarTexto.accept(calcularPow(2, 4));
    }

    public static String calcularPow(int num1, int num2){
        BiFunction<Integer, Integer, Double> operacionPow = (integer, integer2) -> Math.pow(integer, integer2);
        Function<Double, String> adaptarNumATexto = aDouble -> "Resultado: " + aDouble;
        return adaptarNumATexto.apply(operacionPow.apply(num1,num2));
    }
}

package UD5Tarea5.Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangulo> rectangulos = new ArrayList<>();
        rectangulos.add(new Rectangulo(4, 2, 3));
        rectangulos.add(new Rectangulo(4, 3, 5));

        Collections.sort(rectangulos);

        for (Rectangulo rectangulo : rectangulos){
            System.out.println(rectangulo.toString());
        }
    }
}

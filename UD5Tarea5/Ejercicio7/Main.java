package UD5Tarea5.Ejercicio7;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("David", 23, 180));
        estudiantes.add(new Estudiante("Rodrigo", 28, 158));
        estudiantes.add(new Estudiante("Alba", 19, 163));
        estudiantes.add(new Estudiante("Minion", 20, 158));

        System.out.println("ESTUDIANTES SIN ORDENAR.");
        imprimirArrayList(estudiantes);

        Collections.sort(estudiantes);
        System.out.println("\n-----------\n");

        System.out.println("ESTUDIANTES ORDENADOS.");
        imprimirArrayList(estudiantes);
    }

    public static void imprimirArrayList(ArrayList<Estudiante> estudiantes){
        for (Estudiante estudiante : estudiantes){
            System.out.println(estudiante.toString());
        }
    }
}

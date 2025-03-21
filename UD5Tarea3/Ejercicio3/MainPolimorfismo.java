package UD5Tarea3.Ejercicio3;

import java.util.ArrayList;

public class MainPolimorfismo {
    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();
        coches.add(new Diesel("Volkswagen Golf Variant 2.0 TDI", 4));
        coches.add(new Electrico("Tesla Model Y 2025", 0));
        coches.add(new Gasolina("Honda Civic", 4));

        for (Coche coche : coches){
            coche.arrancar();
            coche.acelerar();
            coche.frenar();
            System.out.println("---------");
        }
    }
}

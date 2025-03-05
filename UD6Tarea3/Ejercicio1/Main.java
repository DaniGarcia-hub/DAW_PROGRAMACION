package UD6Tarea3.Ejercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer, Ubicacion> ubicaciones = new HashMap<>();
    public static void main(String[] args) {
        ubicaciones.put(0, new Ubicacion(0, "Programación", "Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1, "Montaña", "Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2, "Playa", "Estás bañándote en la playa"));
        ubicaciones.put(3, new Ubicacion(3, "Edificio", "Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Puente", "Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Bosque", "Estás en un bosque."));

        // b.
        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("S", 4);
//        ubicaciones.get(1).addExit("Q", 0);

        ubicaciones.get(2).addExit("N", 5);
//        ubicaciones.get(2).addExit("Q", 0);

        ubicaciones.get(3).addExit("O", 1);
//        ubicaciones.get(3).addExit("Q", 0);

        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("O", 2);

        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("S", 1);

        // Ubicaciójn inicial.
        Ubicacion ubicacionActual = ubicaciones.get(1);
        boolean finalizarPrograma = false;

        while (!finalizarPrograma){
            System.out.println("UBICACIÓN ACTUAL:");
            System.out.println("· " + ubicacionActual.getLugar() + " | " + ubicacionActual.getDescripcion());
            ubicacionesPosibles(ubicacionActual);
            String opc = solicitarOPC();
            int existencia = revisarExistenccia(opc, ubicacionActual); // Contiene la clave si existe.
            if (existencia == -1){
                System.err.println("No puedes ir a ese lugar");
            } else {
                if (opc.equalsIgnoreCase("Q")){
                    System.out.println(ubicaciones.get(0).getDescripcion());
                    System.out.println("SALIENDO...");
                    finalizarPrograma = true;
                } else {
                    ubicacionActual = ubicaciones.get(existencia);
                }
            }
        }
    }

    public static String solicitarOPC(){
        Scanner sc = new Scanner(System.in);
        boolean ejecucionCorrecta = false;
        String entrada = "";
        do {
            try {
                System.out.println("Introduce la opción:");
                entrada = sc.nextLine().trim().toUpperCase();
                ejecucionCorrecta = true;
            } catch (NumberFormatException e){
                System.err.println("ERROR. Formato incorrecto. Se necesita tipo número.");
            }
        } while (!ejecucionCorrecta);
        return entrada;
    }

    public static void ubicacionesPosibles(Ubicacion ubicacionesPosibles){
        System.out.println("UBICACIONES POSIBLES:");
        for (Map.Entry<Integer, String> ubicacion : ubicacionesPosibles.exits.entrySet()){
            System.out.println("- " + ubicacion.getValue() + " | " + ubicaciones.get(ubicacion.getKey()).getLugar());
        }
    }

    public static int revisarExistenccia(String opc, Ubicacion ubicacionesPosibles){
        for (Map.Entry<Integer, String> ubicacion : ubicacionesPosibles.exits.entrySet()){
            if (ubicacion.getValue().equalsIgnoreCase(opc)){
                return ubicacion.getKey(); // Devuelvo la clave, para luego filtrar por ella y usarlao.
            }
        }
        return -1; // Devuelvo el valor -1, puesto que no existe...
    }
}
package UD6.UD6Tarea5.Ejercicio1;

import java.util.Scanner;
import java.util.Set;

public class Solicitudes {
    public static int solicitarOpc(){
        Scanner sc = new Scanner(System.in);
        boolean ejecucionCorrecta = false;
        int opc = -1;
        do {
            System.out.print("Introduce una opción: ");
            try {
                String entradaDato = sc.nextLine().trim();
                opc = Integer.parseInt(entradaDato);
                ejecucionCorrecta = true;
            } catch (NumberFormatException e){
                System.err.println("ERROR. Formato introducido incorrecto. Se solicita tipo: Número.");
            }
        } while (!ejecucionCorrecta);
        return opc;
    }

    public static String solicitarParada(Set<Parada> paradas){
        Scanner sc = new Scanner(System.in);
        boolean ejecucionCorrecta = false;
        String paradaInicial = "";
        do {
            System.out.print("Introduce una parada: ");
            paradaInicial = sc.nextLine().trim();
            if (Validaciones.validarParada(paradaInicial)){ // Si el formato es correcto...
                if (!Validaciones.validarExistenciaParada(paradaInicial, paradas)){ // Si no existe esa parada...
                    System.err.println("ERROR. No se encuentra la parada introducida. Prueba de nuevo.");
                } else { // En cambio, si existe...
                    ejecucionCorrecta = true; // Sacar del bucle...
                }
            }
        } while (!ejecucionCorrecta);
        return paradaInicial;
    }

    public static String solicitarLinea(Set<Linea> lineas){
        Scanner sc = new Scanner(System.in);
        boolean ejecucionCorrecta = false;
        String lineaInicial = "";
        do {
            System.out.print("Introduce una línea: ");
            lineaInicial = sc.nextLine().trim();
            if (Validaciones.validarLinea(lineaInicial)){
                if (Validaciones.validarExistenciaLinea(lineaInicial, lineas) == null){
                    System.err.println("No se encuentra la línea introducida. Prueba de nuevo.");
                } else {
                    ejecucionCorrecta = true;
                }
            }
        } while (!ejecucionCorrecta);
        return lineaInicial;
    }
}

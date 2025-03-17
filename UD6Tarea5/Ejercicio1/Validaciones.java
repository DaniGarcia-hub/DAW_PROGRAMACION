package UD6.UD6Tarea5.Ejercicio1;

import java.util.Set;

public class Validaciones {
    static final int LENGTH_PARADA_INICIAL_VALIDA = 3;
    public static boolean validarParada(String paradaUsuario){
        boolean ejecucionCorrecta = true;
        if (paradaUsuario.isEmpty()){
            System.err.println("ERROR. No se puede introducir una parada vacía.");
            ejecucionCorrecta = false;
        } else if (paradaUsuario.length() != LENGTH_PARADA_INICIAL_VALIDA) {
            System.err.println("ERROR. No se cumple el formato correcto al introducir la parada. Ejemplo: 347");
            ejecucionCorrecta = false;
        } else {
            for (char caract : paradaUsuario.toCharArray()){
                if (!Character.isDigit(caract)){
                    System.err.println("ERROR. Solo se puede introducir números al introducir la parada.");
                    ejecucionCorrecta = false;
                    break;
                }
            }
        }
        return ejecucionCorrecta;
    }

    public static boolean validarExistenciaParada(String paradaUsuario, Set<Parada> paradas){
        for (Parada parada : paradas){
            if (paradaUsuario.equalsIgnoreCase(parada.getNumero())){
                return true;
            }
        }
        return false;
    }

    public static boolean validarLinea(String linea){
        boolean ejecucionCorrecta = true;
        if (linea.isEmpty()){
            System.err.println("ERROR. No se puede introducir una parada vacía.");
            ejecucionCorrecta = false;
        }
        return ejecucionCorrecta;
    }

    public static Linea validarExistenciaLinea(String lineaUsuario, Set<Linea> lineas){
        for (Linea linea : lineas){
            if (lineaUsuario.equalsIgnoreCase(linea.getIdentificador())){
                return linea;
            }
        }
        return null;
    }

    public static boolean validarParadaEnLinea(Parada parada, String lineaUsuario){
        for (Linea lineaParada : parada.getLineas()){
            if (lineaUsuario.equalsIgnoreCase(lineaParada.getIdentificador())){
                return true;
            }
        }
        System.err.println("ERROR. En dicha parada, no pasa la línea introducida.");
        return false;
    }
}

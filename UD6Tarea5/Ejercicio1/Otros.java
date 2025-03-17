package UD6.UD6Tarea5.Ejercicio1;

import java.util.Collection;
import java.util.Map;

public class Otros {
    public static void menuPrincipal(){
        System.out.println("""
                Opciones programa:
                1· Mostrar paradas.
                2· Calcular tiempo del trayecto.
                3. Salir del programa.""");
    }

    public static void recorrerDatos(Collection<?> datos){
        for (Object dato : datos){
            System.out.println(dato);
        }
    }

    public static void recorrerDatos(Map<?,?> datos){
        for (Map.Entry<?,?> dato : datos.entrySet()){
            System.out.println(dato.getValue());
        }
    }
}

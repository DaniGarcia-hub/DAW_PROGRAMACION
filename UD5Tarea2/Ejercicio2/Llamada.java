package UD5Tarea2.Ejercicio2;

public class Llamada {
    private boolean llamadaMuteada;
    private boolean altavozPuesto;

    public Llamada(){
        this.llamadaMuteada = false;
        this.altavozPuesto = false;
    }

    public void alternarMuteo(){
        if (!llamadaMuteada){
            System.out.println("Llamada muteada. Ahora no te escuchan. (MUTEO ACTIVO)");
            llamadaMuteada = !llamadaMuteada;
        } else {
            System.out.println("Opción mutear desactivada. Ahora te pueden escuchar. (MUTEO DESACTIVADO)");
            llamadaMuteada = !llamadaMuteada;
        }
    }

    public void alternarAltavoz(){
        if (!altavozPuesto){
            System.out.println("ALTAVOZ ACTIVADO.");
            altavozPuesto = !altavozPuesto;
        } else {
            System.out.println("ALTAVOZ DESACTIVADO");
            altavozPuesto = !altavozPuesto;
        }
    }
}

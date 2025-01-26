package UD5Tarea2.Ejercicio1;

public class Habitacion {
    private String nombre;
    private Pared pared1, pared2, pared3, pared4;
    private Techo techo;
    private Cama cama;
    private Lampara lampara;

    public Habitacion(String nombre, Pared pared1, Pared pared2, Pared pared3, Pared pared4, Techo techo, Cama cama, Lampara lampara) {
        this.nombre = nombre;
        this.pared1 = pared1;
        this.pared2 = pared2;
        this.pared3 = pared3;
        this.pared4 = pared4;
        this.techo = techo;
        this.cama = cama;
        this.lampara = lampara;
    }

    public Lampara getLampara(){
        return lampara;
    }

    public void hacerLaCama(){
        System.out.println("Se está haciendo la cama...");
        cama.hacer();
    }
}

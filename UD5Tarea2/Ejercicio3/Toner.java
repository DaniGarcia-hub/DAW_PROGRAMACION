package UD5Tarea2.Ejercicio3;

public class Toner {
    private String nombre, marca;
    private int nivelToner;

    public Toner(String nombre, String marca, int nivelToner){
        this.nombre = nombre;
        this.marca = marca;
        this.nivelToner = nivelToner;
    }

    public int nivelToner(){
        return this.nivelToner;
    }

    public void actualizarCantidad(int cantidad){
        this.nivelToner = cantidad;
    }
}

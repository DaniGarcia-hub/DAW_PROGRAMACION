package UD6Tarea1.Ejercicio2;

import java.util.Comparator;

public class Cancion implements Comparable<Cancion> {
    private String titulo;
    private double duracion;

    public Cancion(String titulo, double duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo(){
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return titulo + ": " + duracion + "min.";
    }

    @Override
    public int compareTo(Cancion o) {
        int result = titulo.compareTo(o.getTitulo());
        if (result == 0){
            result = String.valueOf(duracion).compareTo(String.valueOf(o.getDuracion()));
        }
        return result;
    }
}

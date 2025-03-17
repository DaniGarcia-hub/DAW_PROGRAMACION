package UD6.UD6Tarea5.Ejercicio1;

import java.util.ArrayList;

public class Parada {
    private String numero, nombre, direccion;
    private int tiempoParada;
    private ArrayList<Linea> lineas;
    private Parada siguienteParada;

    public Parada(String numero, String nombre, String direccion, int tiempoParada){
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tiempoParada = tiempoParada;
        this.siguienteParada = null;
        this.lineas = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTiempoParada() {
        return tiempoParada;
    }

    public void setTiempoParada(int tiempoParada) {
        this.tiempoParada = tiempoParada;
    }

    public Parada getSiguienteParada() {
        return siguienteParada;
    }

    public void setSiguienteParada(Parada siguienteParada) {
        this.siguienteParada = siguienteParada;
    }

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    public void setSiguiente(Parada paradaSiguiente){
        this.siguienteParada = paradaSiguiente;
    }

    @Override
    public String toString() {
        return "Parada" +
                " | Número: " + numero +
                " | Direccion: " + direccion +
                " | Nombre: " + nombre +
                " | Siguiente Parada (sec): " + tiempoParada;
    }
}

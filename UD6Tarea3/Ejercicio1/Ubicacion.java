package UD6Tarea3.Ejercicio1;

import java.util.HashMap;

public class Ubicacion {
    protected int id;
    protected String lugar, descripcion;
    protected HashMap<Integer, String> exits;

    public Ubicacion(int id, String lugar, String descripcion){
        this.id = id;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.exits = new HashMap<>();
        this.exits.put(0, "Q"); // Todos los objetos Ubicacion tendrán la opción de salir.
    }

    public int getId() {
        return id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public HashMap<Integer, String> getExits() {
        return exits;
    }

    @Override
    public String toString() {
        return "Ubicacion" +
                " | ID: " + id +
                " | Descripcion: " + descripcion +
                " | Exits: " + exits.toString();
    }

    public void addExit(String direccion, int idUbicacion){
        this.exits.put(idUbicacion, direccion);
    }
}

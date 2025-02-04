package UD5Tarea4.Ejercicio5;

public class Bienes {
    protected String descripcion;
    protected double precio;

    public Bienes(String descripcion, double precio){
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

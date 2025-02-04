package UD5Tarea4.Ejercicio5;

public class Comida extends Bienes{
    protected double calorias;

    public Comida(String descripcion, double precio, double calorias){
        super(descripcion, precio);
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "calorias=" + calorias +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}

package UD5Tarea4.Ejercicio5;

public class Juguete extends Bienes implements Imponible{
    protected int edad;

    public Juguete(String descripcion, double precio, int edad) {
        super(descripcion, precio);
        this.edad = edad;
    }

    @Override
    public double calcularImpuestos(double precio) {
        return (int) (TASA_IMPUESTOS * precio);
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "edad=" + edad +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                "Impuestos: " + calcularImpuestos(precio) +
                '}';
    }
}

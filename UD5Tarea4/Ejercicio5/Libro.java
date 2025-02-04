package UD5Tarea4.Ejercicio5;

public class Libro extends Bienes implements Imponible{
    protected String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    @Override
    public double calcularImpuestos(double precio) {
        return (int) (TASA_IMPUESTOS * precio);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                "Impuestos: " + calcularImpuestos(precio) +
                '}';
    }
}

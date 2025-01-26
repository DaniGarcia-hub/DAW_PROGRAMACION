package UD5Tarea3.Ejercicio4;

public class Rectangulo extends Forma{
    protected double longitud, ancho;

    public Rectangulo(double longitud, double ancho){
        super("Rectangulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area(){
        return longitud*ancho;
    }
}

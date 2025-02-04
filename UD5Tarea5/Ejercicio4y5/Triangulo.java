package UD5Tarea5.Ejercicio4y5;

public class Triangulo extends Forma{
    protected double ancho, alto;

    public Triangulo(int numLados, double ancho, double alto){
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea(){
        return (ancho*alto)/2;
    }

    @Override
    public double getPerimeter(){
        return (3*ancho);
    }
}

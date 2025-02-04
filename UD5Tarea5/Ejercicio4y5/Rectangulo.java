package UD5Tarea5.Ejercicio4y5;

public class Rectangulo extends Forma implements Redimensionable{
    protected double ancho, alto;

    public Rectangulo(int numLados, double ancho, double alto){
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea(){
        return ancho*alto;
    }

    @Override
    public double getPerimeter(){
        return (ancho + alto) * 2;
    }

    @Override
    public void redimensionar(int x) {
        this.ancho *= x;
        this.alto *= x;
    }
}

package UD5Tarea5.Ejercicio6;

import UD5Tarea5.Ejercicio4y5.Redimensionable;

public class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo> {
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

    @Override
    public int compareTo(Rectangulo o) {
        return Double.compare(o.getArea() , getArea());
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", numLados=" + numLados +
                " / " + getArea() +
                '}';
    }
}

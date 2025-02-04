package UD5Tarea5.Ejercicio4y5;

public abstract class Forma {
    protected int numLados;

    public Forma(int numLados){
        this.numLados = numLados;
    }

    public int getNumLados(){
        return numLados;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

package UD5Tarea3.Ejercicio4;

public class Cilindro extends Forma{
    protected double radio, altura;

    public Cilindro(double radio, double altura){
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area(){
        return 2*Math.PI*radio*(radio+altura);
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "radio=" + radio +
                ", altura=" + altura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

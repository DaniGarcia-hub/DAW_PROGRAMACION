package Ej13;

public class Circulo {
    protected double radio;

    public Circulo(double radio){

        if (radio < 0){
            this.radio = 0;
        } else this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea(){
        return radio*radio*Math.PI;
    }
}

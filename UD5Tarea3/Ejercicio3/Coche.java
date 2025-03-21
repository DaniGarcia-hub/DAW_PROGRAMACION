package UD5Tarea3.Ejercicio3;

public class Coche {
    protected String modelo;
    protected int ruedas, cilindros;
    protected boolean motor;

    public Coche(String modelo, int cilindros){
        this.modelo = modelo;
        this.cilindros = cilindros;
        this.motor = true;
        this.ruedas = 4;
    }

    public String getModelo() {
        return modelo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public boolean isMotor() {
        return motor;
    }

    public void arrancar(){
        System.out.println("Arrancando...");
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }
}

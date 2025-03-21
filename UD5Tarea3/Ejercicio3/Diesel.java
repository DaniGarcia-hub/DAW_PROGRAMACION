package UD5Tarea3.Ejercicio3;

public class Diesel extends Coche{
    public Diesel(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar(){
        System.out.println("Arrancando el " + modelo +  " con diesel.");
    }

    @Override
    public void acelerar(){
        System.out.println(modelo + " Acelerando. Haciendo uso de diesel.");
    }

    @Override
    public void frenar(){
        System.out.println("El " + modelo + " está frenando, ya no se consume tanto diesel.");
    }
}

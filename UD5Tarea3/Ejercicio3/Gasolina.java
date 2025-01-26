package UD5Tarea3.Ejercicio3;

public class Gasolina extends Coche{
    public Gasolina(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar(){
        System.out.println("Arrancando el " + modelo +  " con gasolina. Recuerda meter la marcha.");
    }

    @Override
    public void acelerar(){
        System.out.println(modelo + " Acelerando. Haciendo uso de gasolina. No fuerces el coche.");
    }

    @Override
    public void frenar(){
        System.out.println("El " + modelo + " está frenando, ya no se consume tanta gasolina.");
    }
}

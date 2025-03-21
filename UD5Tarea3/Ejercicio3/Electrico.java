package UD5Tarea3.Ejercicio3;

public class Electrico extends Coche{
    private int nivelEnergia;
    public Electrico(String modelo, int cilindros) {
        super(modelo, cilindros);
        nivelEnergia = (int) (Math.random()*100);
    }

    @Override
    public void arrancar(){
        System.out.println("Arrancando el " + modelo +  ". Se está haciendo uso de la electricidad.");
    }

    @Override
    public void acelerar(){
        System.out.println(modelo + " Acelerando. Se está consumiendo energía/electricidad.");
    }

    @Override
    public void frenar(){
        System.out.println("El " + modelo + " está frenando, se consume mucha menos energía. Nivel energía: " + nivelEnergia);
    }
}

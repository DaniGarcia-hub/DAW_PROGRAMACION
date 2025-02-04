package UD5Tarea5.Ejercicio1;

public abstract class ClaseAbstracta {
    public ClaseAbstracta(){
        System.out.println("Este es un constructor de clase abstracta");
    }

    public abstract void abstract_method();

    public void noabstract_method(){
        System.out.println("Este es un método normal de la clase abstracta.");
    }
}

package UD5Tarea5.Ejercicio1;

public class SubClase extends ClaseAbstracta{
    public SubClase(){

    }

    @Override
    public void abstract_method(){
        System.out.println("Este es un método abstracto implementado en una clase no abstracta");
    }
}

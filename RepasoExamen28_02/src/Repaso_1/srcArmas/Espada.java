package Repaso_1.srcArmas;

public class Espada extends Arma{
    public Espada(String nombre, double dmg, int durabilidad, String atributoEspecial){
        super(nombre, dmg, durabilidad, atributoEspecial);
    }

    @Override
    public String toString() {
        return "Espada" +
                " | Nombre: " + nombre +
                " | Daño: " + dmg +
                " | Durabilidad: " + durabilidad +
                " | AtributoEspecial: " + atributoEspecial;
    }
}

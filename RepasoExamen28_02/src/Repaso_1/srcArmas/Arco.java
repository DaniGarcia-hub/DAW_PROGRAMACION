package Repaso_1.srcArmas;

public class Arco extends ArmasDistancia{
    public Arco(String nombre, double dmg, int durabilidad, String atributoEspecial, int cantidadMunicion, String tipoMunicion){
        super(nombre, dmg, durabilidad, atributoEspecial, cantidadMunicion, tipoMunicion);
    }

    @Override
    public String toString() {
        return "Arco" +
                " | Nombre: " + nombre +
                " | Daño: " + dmg +
                " | Durabilidad: " + durabilidad +
                " | AtributoEspecial: " + atributoEspecial +
                " | Tipo Munición: " + tipoMunicion +
                " | Cantidad Munición: " + cantidadMunicion;
    }
}

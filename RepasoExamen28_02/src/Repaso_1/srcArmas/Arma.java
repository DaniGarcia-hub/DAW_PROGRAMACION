package Repaso_1.srcArmas;

public abstract class Arma {
    protected String nombre, atributoEspecial;
    protected double dmg;
    protected int durabilidad;

    public Arma(String nombre, double dmg, int durabilidad, String atributoEspecial){
        this.nombre = nombre;
        this.dmg = dmg;
        this.durabilidad = durabilidad;
        this.atributoEspecial = atributoEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    @Override
    public String toString() {
        return "Arma:" +
                " | Nombre: " + nombre +
                " | Daño: " + dmg +
                " | Durabilidad: " + durabilidad +
                " | AtributoEspecial: " + atributoEspecial;
    }
}

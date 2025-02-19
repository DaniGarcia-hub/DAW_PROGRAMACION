package Repaso_1.srcArmas;

public abstract class Arma {
    private String nombre, atributoEspecial;
    private double dmg;
    private double durabilidad;

    public Arma(String nombre, double dmg, double durabilidad, String atributoEspecial){
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

    public double getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(double durabilidad) {
        this.durabilidad = durabilidad;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nombre='" + nombre + '\'' +
                ", atributoEspecial='" + atributoEspecial + '\'' +
                ", dmg=" + dmg +
                ", durabilidad=" + durabilidad +
                '}';
    }
}

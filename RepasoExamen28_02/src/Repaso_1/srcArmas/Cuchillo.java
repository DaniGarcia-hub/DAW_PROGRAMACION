package Repaso_1.srcArmas;

public class Cuchillo extends Arma{
    private boolean sangrado;
    public Cuchillo(String nombre, double dmg, int durabilidad, String atributoEspecial, boolean sangrado){
        super(nombre, dmg, durabilidad, atributoEspecial);
        this.sangrado = sangrado;
    }

    public boolean getSangrado() {
        return sangrado;
    }

    public void setSangrado(boolean sangrado) {
        this.sangrado = sangrado;
    }

    @Override
    public String toString() {
        return "Cuchillo" +
                " | Nombre: " + nombre +
                " | Daño: " + dmg +
                " | Durabilidad: " + durabilidad +
                " | AtributoEspecial: " + atributoEspecial+
                " | Sangrado: " + sangrado;
    }
}

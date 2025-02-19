package Repaso_1.srcArmas;

public class Cuchillo extends Arma{
    private double sangrado;
    public Cuchillo(String nombre, double dmg, double durabilidad, String atributoEspecial, double sangrado){
        super(nombre, dmg, durabilidad, atributoEspecial);
        this.sangrado = sangrado;
    }

    public double getSangrado() {
        return sangrado;
    }

    public void setSangrado(double sangrado) {
        this.sangrado = sangrado;
    }
}

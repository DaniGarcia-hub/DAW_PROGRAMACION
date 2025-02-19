package Repaso_1.srcArmas;

public abstract class ArmasDistancia extends Arma{
    private int cantidadMunicion;
    private String tipoMunicion;

    public ArmasDistancia(String nombre, double dmg, double durabilidad, String atributoEspecial, int cantidadMunicion, String tipoMunicion){
        super(nombre, dmg, durabilidad, atributoEspecial);
        this.cantidadMunicion = cantidadMunicion;
        this.tipoMunicion = tipoMunicion;
    }

    public int getCantidadMunicion() {
        return cantidadMunicion;
    }

    public void setCantidadMunicion(int cantidadMunicion) {
        this.cantidadMunicion = cantidadMunicion;
    }

    public String getTipoMunicion() {
        return tipoMunicion;
    }

    public void setTipoMunicion(String tipoMunicion) {
        this.tipoMunicion = tipoMunicion;
    }
}

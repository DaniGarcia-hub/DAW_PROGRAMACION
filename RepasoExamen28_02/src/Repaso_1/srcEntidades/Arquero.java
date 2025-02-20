package Repaso_1.srcEntidades;

import Repaso_1.srcArmas.Arma;

public class Arquero extends Persona{
    private double precision;

    public Arquero(String nombre, int nivel, double HP, double precision, Arma arma){
        super(nombre, nivel, HP, arma);
        this.precision = precision;
    }

    @Override
    public double atacar(){
        if (arma.getDurabilidad() == 0){
            return 0; // SI no tiene durabilidad, no puede quitar daño.
        }
        arma.setDurabilidad(arma.getDurabilidad()-1);
        return arma.getDmg() + precision;
    }

    @Override
    public String toString() {
        return "Arquero" +
                " | Nombre: " + nombre +
                " | Nivel: " + nivel +
                " | HP: " + HP +
                " | Precision: " + precision+
                " | Arma: " + arma.getNombre();
    }
}

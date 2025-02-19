package Repaso_1.srcEntidades;

import Repaso_1.srcArmas.Arma;

public class Mago extends Persona{
    protected double mana;

    public Mago(String nombre, int nivel, double HP, double mana, Arma arma){
        super(nombre, nivel, HP, arma);
        this.mana = mana;
    }

    @Override
    public void atacar(){

    }

    @Override
    public String toString() {
        return "Mago{" +
                "mana=" + mana +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                ", arma=" + arma.getNombre() +
                '}';
    }
}

package Repaso_1.srcEntidades;

import Repaso_1.srcArmas.Arma;

public class Asesino extends Persona{
    private double sigilo;

    public Asesino(String nombre, int nivel, double HP, double sigilo, Arma arma){
        super(nombre, nivel, HP, arma);
        this.sigilo = sigilo;
    }

    @Override
    public void atacar(){

    }

    @Override
    public String toString() {
        return "Asesino{" +
                "sigilo=" + sigilo +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                ", arma=" + arma.getNombre() +
                '}';
    }
}

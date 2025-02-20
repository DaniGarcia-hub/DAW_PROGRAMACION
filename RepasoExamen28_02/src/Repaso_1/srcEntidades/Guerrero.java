package Repaso_1.srcEntidades;

import Repaso_1.srcArmas.Arma;

public class Guerrero extends Persona{
    protected double fuerza;

    public Guerrero(String nombre, int nivel, double HP, double fuerza, Arma arma){
        super(nombre, nivel, HP, arma);
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(){

    }

    @Override
    public String toString() {
        return "Guerrero" +
                " | Nombre: " + nombre +
                " | Nivel: " + nivel +
                " | HP: " + HP +
                " | Fuerza: " + fuerza +
                " | Arma: " + arma.getNombre();
    }
}

package Repaso_1.srcEntidades;

import Repaso_1.srcArmas.Arma;
import Repaso_1.Interfaces.Ataque;

import java.util.Random;

public abstract class Persona implements Ataque {
    protected String nombre;
    protected int nivel;
    protected double HP;
    protected Arma arma;

    public Persona(String nombre, int nivel, double HP, Arma arma){
        this.nombre = nombre;
        this.nivel = nivel;
        this.HP = HP;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                ", arma=" + arma.getNombre() +
                '}';
    }

    Random random = new Random();
}

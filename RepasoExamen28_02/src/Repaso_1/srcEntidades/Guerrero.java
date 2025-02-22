package Repaso_1.srcEntidades;

import Repaso_1.srcArmas.Arma;

import java.util.Random;

public class Guerrero extends Persona{
    protected double fuerza;

    public Guerrero(String nombre, int nivel, double HP, double fuerza, Arma arma){
        super(nombre, nivel, HP, arma);
        this.fuerza = fuerza;
    }

    @Override
    public double atacar(){
        if (arma.getDurabilidad() == 0){
            return 0; // SI no tiene durabilidad, no puede quitar daño.
        }
        arma.setDurabilidad(arma.getDurabilidad()-1);
        int dmgAdicionalAleatorio = random.nextInt(16);
        return arma.getDmg() + fuerza + dmgAdicionalAleatorio;
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

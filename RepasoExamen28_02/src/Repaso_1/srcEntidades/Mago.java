package Repaso_1.srcEntidades;

import Repaso_1.srcArmas.Arma;

public class Mago extends Persona{
    protected double mana;

    public Mago(String nombre, int nivel, double HP, double mana, Arma arma){
        super(nombre, nivel, HP, arma);
        this.mana = mana;
    }

    @Override
    public double atacar(){
        if (arma.getDurabilidad() == 0){
            return 0; // SI no tiene durabilidad, no puede quitar daño.
        }
        arma.setDurabilidad(arma.getDurabilidad()-1);
        return arma.getDmg() + mana;
    }

    @Override
    public String toString() {
        return "Mago" +
                " | Nombre: " + nombre +
                " | Nivel: " + nivel +
                " | HP: " + HP +
                " | Mana: " + mana +
                " | Arma: " + arma.getNombre();
    }
}

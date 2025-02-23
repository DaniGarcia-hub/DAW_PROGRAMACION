package Repaso_1.srcEntidades;

import Repaso_1.srcArmas.Arma;


public class Mago extends Persona{
    protected double mana;

    public Mago(String nombre, int nivel, double HP, double mana){
        super(nombre, nivel, HP);
        this.mana = mana;
    }

    @Override
    public double atacar(Arma arma){
        if (arma.getDurabilidad() == 0){
            return 0; // SI no tiene durabilidad, no puede quitar daño.
        }
        arma.setDurabilidad(arma.getDurabilidad()-1);
        int dmgAdicionalAleatorio = random.nextInt(16);
        return arma.getDmg() + mana + dmgAdicionalAleatorio;
    }

    @Override
    public String toString() {
        return "Mago" +
                " | Nombre: " + nombre +
                " | Nivel: " + nivel +
                " | HP: " + HP +
                " | Mana: " + mana;
//                " | Arma: " + arma.getNombre();
    }
}

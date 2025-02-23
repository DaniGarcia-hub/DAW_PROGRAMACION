package Repaso_1.srcEntidades;

import Repaso_1.srcArmas.Arma;

public class Asesino extends Persona{
    private double sigilo;

    public Asesino(String nombre, int nivel, double HP, double sigilo){
        super(nombre, nivel, HP);
        this.sigilo = sigilo;
    }

    @Override
    public double atacar(Arma arma){
        if (arma.getDurabilidad() == 0){
            return 0; // SI no tiene durabilidad, no puede quitar daño.
        }
        arma.setDurabilidad(arma.getDurabilidad()-1);
        int dmgAdicionalAleatorio = random.nextInt(16);
        return arma.getDmg() + sigilo + dmgAdicionalAleatorio;
    }

    @Override
    public String toString() {
        return "Asesino" +
                " | Nombre: " + nombre +
                " | Nivel: " + nivel +
                " | HP: " + HP +
                " | Sigilo: " + sigilo;
//                " | Arma: " + arma.getNombre();
    }
}

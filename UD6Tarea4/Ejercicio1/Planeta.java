package UD6Tarea4.Ejercicio1;

public class Planeta extends CuerpoCeleste{
    public Planeta(String nombre, double periodoOrbitral){
        super(nombre, periodoOrbitral, TipoCuerpoCeleste.PLANETA);
    }

    @Override
    public boolean addSatelite(CuerpoCeleste cuerpoCeleste){
        if (cuerpoCeleste.getTipoCuerpo().equals(TipoCuerpoCeleste.LUNA)){
            this.getSatelites().add(cuerpoCeleste);
            return true;
        } else {
            return false;
        }
    }
}

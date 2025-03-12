package UD6Tarea4.Ejercicio1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    public enum TipoCuerpoCeleste{
        ESTRELLA, PLANETA, PLANETA_ENANO, LUNA, COMETA, ASTEROIDE
    }

    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo){
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        this.satelites = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return satelites;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public boolean addSatelite(CuerpoCeleste cuerpoCeleste){
        if (!satelites.contains(cuerpoCeleste)){
            satelites.add(cuerpoCeleste);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Objects.equals(nombre, that.nombre) && tipoCuerpo == that.tipoCuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipoCuerpo);
    }

    @Override
    public String toString() {
        return tipoCuerpo +
                " | Nombre: " + nombre +
                " | PeriodoOrbital: " + periodoOrbital;
    }

    public void recorrerSatelites(){
        System.out.println("SATÉLITES DE " + this.nombre + ":");
        for (CuerpoCeleste satelite : this.satelites){
            System.out.println(satelite);
        }
    }
}

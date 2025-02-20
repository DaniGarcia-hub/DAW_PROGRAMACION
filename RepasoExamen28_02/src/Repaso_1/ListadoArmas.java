package Repaso_1;

import Repaso_1.srcArmas.Arma;
import Repaso_1.srcArmas.Cuchillo;

import java.util.ArrayList;

public class ListadoArmas {
    private int numListado;
    private String nombreListado;
    protected ArrayList<Arma> armas;

    public ListadoArmas(int numListado, String nombreListado){
        this.numListado = numListado;
        this.nombreListado = nombreListado;
        this.armas = new ArrayList<>();
        registrarNuevaArma(new Cuchillo("Cuchillo metal roto", 5, 100, "Ninguno", false));
    }

    public int getNumListado() {
        return numListado;
    }

    public String getNombreListado() {
        return nombreListado;
    }

    public void setNombreListado(String nombreListado) {
        this.nombreListado = nombreListado;
    }

    public ArrayList<Arma> getArmas(){
        return armas;
    }

    public boolean registrarNuevaArma(Arma arma){
        return armas.add(arma);
    }

    public boolean borrarArma(Arma arma){
        return armas.remove(arma);
    }

    public void actualizarArma(Arma armaAntigua, Arma armaNueva){
        armas.set(armas.indexOf(armaAntigua), armaNueva);
    }

    public void mostrarArmasRegistradas(){
        System.out.println("LISTADO DE ARMAS (" + nombreListado + "):");
        for (int i = 0; i < armas.size(); i++){
            System.out.println((i+1) + " | " + armas.get(i));
        }
    }
}

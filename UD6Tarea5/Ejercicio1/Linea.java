package UD6.UD6Tarea5.Ejercicio1;

import java.util.ArrayList;

public class Linea {
    private String identificador;
    private ListaParadas listaParadas;
    private ArrayList<Parada> paradas;

    public Linea(String identificador){
        this.identificador = identificador;
        listaParadas = new ListaParadas();
    }

    public void activarParadas(){
        this.paradas = listaParadas.transformarParadasArrayList();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ListaParadas getListaParadas() {
        return listaParadas;
    }

    public ArrayList<Parada> getParadas(){
        return this.paradas;
    }

    @Override
    public String toString() {
        return "Linea" +
                " | Identificador: " + identificador;
    }
}

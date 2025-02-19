package Repaso_1;

import Repaso_1.srcEntidades.Persona;

import java.util.ArrayList;

public class ListadoHeroes {
    private int numListado;
    private String nombreListado;
    protected ArrayList<Persona> personas;

    public ListadoHeroes(int numListado, String nombreListado){
        this.numListado = numListado;
        this.nombreListado = nombreListado;
        this.personas = new ArrayList<>();
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

    public boolean registrarNuevoHeroe(Persona heroe){
        return personas.add(heroe);
    }

    public boolean borrarHeroe(Persona heroe){
        return personas.remove(heroe);
    }

    public void actualizarHeroe(Persona heroeAntiguo, Persona heroeNuevo){
        personas.set(personas.indexOf(heroeAntiguo), heroeNuevo);
    }

    public void mostrarHeroesRegistrados(){
        System.out.println("LISTADO DE HEROES (" + nombreListado + "):");
        for (int i = 0; i < personas.size(); i++){
            System.out.println((i+1) + " | " + personas.get(i));
        }
    }
}

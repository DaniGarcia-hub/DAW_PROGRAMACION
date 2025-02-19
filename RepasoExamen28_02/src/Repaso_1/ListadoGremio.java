package Repaso_1;

import Repaso_1.srcEntidades.Persona;

import java.util.ArrayList;

public class ListadoGremio {
    protected int numGremio;
    protected String nombreGremio;
    protected ArrayList<Persona> personasGremio;

    public ListadoGremio(int numGremio, String nombreGremio){
        this.numGremio = numGremio;
        this.nombreGremio = nombreGremio;
        this.personasGremio = new ArrayList<>();
    }

    public int getNumGremio(){
        return numGremio;
    }

    public String getNombreGremio() {
        return nombreGremio;
    }

    public void setNombreGremio(String nombreGremio) {
        this.nombreGremio = nombreGremio;
    }

    public void mostrarHeroesGremio(){
        System.out.println("LISTADO HEROES GREMIO (" + nombreGremio + "):");
        for (int i = 0; i < personasGremio.size(); i++){
            System.out.println((i+1) + " | " + personasGremio.get(i));
        }
    }

    public boolean nuevoHeroeGremio(Persona heroe){
        return personasGremio.add(heroe);
    }

    public boolean borrarHeroeGremio(Persona heroe){
        return personasGremio.remove(heroe);
    }

    @Override
    public String toString() {
        return "ListadoGremio{" +
                "numGremio=" + numGremio +
                ", nombreGremio='" + nombreGremio + '\'' +
                '}';
    }
}

package UD6Tarea1.Ejercicio2;

import UD6Tarea1.Ejercicio1.Contacto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Album {
    private String nombre, artista;
    private ArrayList<Cancion> canciones;

    public Album(String nombreAlbum, String artista){
        this.nombre = nombreAlbum;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | " +
                "Artista: " + artista;
    }

    private Cancion findSong(String tituloCancion){
        for (Cancion cancion : canciones){
            if (cancion.getTitulo().equals(tituloCancion)){
                return cancion;
            }
        }
        return null;
    }

    public boolean addSong(String tituloCancion, double duracion){
        Cancion cancionEncontrada = findSong(tituloCancion);
        if (cancionEncontrada != null){
            System.err.println("La canción ya se encuentra en el album. No se puede introducir canciones con el mismo título.");
            return false;
        } else {
            canciones.add(new Cancion(tituloCancion, duracion));
            return true;
        }
    }

    public boolean addToPlayList(int numPista, LinkedList<Cancion> listaReproduccion){
        if(numPista > 0 && numPista <= canciones.size()){
            listaReproduccion.add(canciones.get(numPista-1));
            Collections.sort(listaReproduccion);
            return true;
        } else {
            System.err.println("La canción no existe en el álbum.");
            return false;
        }
    }

    public boolean addToPlayList(String tituloCancion, LinkedList<Cancion> listaReproduccion){
        Cancion resultadoBusqueda = findSong(tituloCancion);

        if(resultadoBusqueda == null){
            System.err.println("La canción no existe en el álbum.");
            return false;
        } else {
            listaReproduccion.add(resultadoBusqueda);
            Collections.sort(listaReproduccion);
            return true;
        }
    }

    public void recorrerCanciones(){
        for (int i = 0; i < canciones.size(); i++){
            System.out.println((i+1) + " | " + canciones.get(i).toString());
        }
    }
}

package UD6Tarea1.Ejercicio2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albumes = new ArrayList<>();
        albumes.add(new Album("Sakura", "Saiko"));
        albumes.add(new Album("Buenas Noches", "Quevedo"));
        albumes.get(0).addSong("3 caídas", 3.55);
        albumes.get(0).addSong("Luna", 2.58);
        albumes.get(0).addSong("Como suenan las estrellas", 3.25);
        albumes.get(0).addSong("Amaneció", 3.40);
        albumes.get(1).addSong("Buenas Noches", 3.28);
        albumes.get(1).addSong("Chapiadora.com", 3.25);
        albumes.get(1).addSong("Kassandra", 3.50);
        albumes.get(1).addSong("Amaneció", 3.40);

        LinkedList<Cancion> listaReproduccion = new LinkedList<>();
        albumes.get(0).addToPlayList(3, listaReproduccion);
        albumes.get(1).addToPlayList("Buenas Noches", listaReproduccion);
        albumes.get(1).addToPlayList("Chapiadora.com", listaReproduccion);
        albumes.get(0).addToPlayList("3 caídas", listaReproduccion);
        albumes.get(1).addToPlayList("Amaneció", listaReproduccion);

        play(listaReproduccion, albumes);
    }

    public static void recorrerPlayList(LinkedList<Cancion> listaReproduccion){
        ListIterator<Cancion> it = listaReproduccion.listIterator();
        int numCancion = 1;
        while (it.hasNext()){
            System.out.println(numCancion + ". " + it.next());
            numCancion++;
        }
    }

    public static void play(LinkedList<Cancion> listaReproduccion, ArrayList<Album> albumes){
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        boolean haciaDelante = true;
        ListIterator<Cancion> it = listaReproduccion.listIterator();
        if (listaReproduccion.isEmpty()){
            System.out.println("La lista de reproducción no contiene canciones.");
            continuar = false;
        } else{
            System.out.println("Reproduciendo: " + it.next());
            mostrarMenu();
        }
        while (continuar){
            try{
                System.out.println("Escoge opción:");
                int opc = sc.nextInt();
                switch (opc){
                    case 0:
                        continuar = false;
                        break;
                    case 1:
                        if (!haciaDelante){
                            if (it.hasNext()){
                                it.next();
                                haciaDelante = true;
                            }
                        }
                        if(it.hasNext()){
                            System.out.println("Reproduciendo: " + it.next());
                        } else {
                            System.out.println("Fin de la lista de reproducción. No se puede reproducir más canciones.");
                        }
                        break;
                    case 2:
                        if (haciaDelante){
                            if (it.hasPrevious()){
                                it.previous();
                                haciaDelante = false;
                            }
                        }
                        if (it.hasPrevious()){
                            System.out.println("Reproduciendo: " + it.previous());
                        } else {
                            System.out.println("Llegado al incio de la lista. No hay más canciones anteriores a la actual.");
                        }
                        break;
                    case 3:
                        if (!haciaDelante){
                            if (it.hasNext()){
                                System.out.println("Reproduciendo: " + it.next());
                                it.previous();
                            } else {
                                System.out.println("Reproduciendo: " + it.previous());
                            }
                        } else {
                            if (it.hasPrevious()){
                                System.out.println("Reproduciendo: " + it.previous());
                                it.next();
                            } else {
                                System.out.println("Reproduciendo: " + it.next());
                            }
                        }
                        break;
                    case 4:
                        recorrerPlayList(listaReproduccion);
                        break;
                    case 5:
                        try {
                            if(!listaReproduccion.isEmpty()){
                                it.remove();
                            } else {
                                System.err.println("La lista de reproducción no cuenta con canciones que puedan ser eliminadas.");
                            }
                            if(it.hasNext()){
                                System.out.println("Reproduciendo: " +it.next());
                                if(!haciaDelante){
                                    haciaDelante = true;
                                }
                            } else {
                                System.out.println("Reproduciendo: " + it.previous());
                                if(haciaDelante){
                                    haciaDelante = false;
                                }
                            }
                        } catch (NoSuchElementException _){};
                        break;
                    case 6:
                        System.out.println("Listado de albumes:");
                        mostrarAlbumes(albumes);
                        System.out.println("----------------------");
                        boolean ejecucionCorrecta = false;
                        while (!ejecucionCorrecta){
                            try {
                                opcMenuAlbumes();
                                opc = sc.nextInt();
                                switch (opc){
                                    case 1:
                                        boolean listadoCancCorrecto = false;
                                        while (!listadoCancCorrecto){
                                            try {
                                                System.out.println("Listado de albumes:");
                                                mostrarAlbumes(albumes);
                                                System.out.println("----------------------");
                                                System.out.println("99. Salir.");
                                                System.out.println("Escoge un album. (Ejemplo: 1):");
                                                opc = sc.nextInt();

                                                if (opc >= 0 && opc < albumes.size() || opc == 99){
                                                    if (opc != 99) {
                                                        System.out.println("Listado de canciones:");
                                                        albumes.get(opc).recorrerCanciones();
                                                    }
                                                    listadoCancCorrecto = true;
                                                    ejecucionCorrecta = true;
                                                } else {
                                                    System.err.println("Opción inválida.");
                                                }
                                            } catch (InputMismatchException e){
                                                System.err.println("Formato incorrecto.");
                                                sc.nextLine();
                                            }
                                        }
                                        break;
                                    case 2:
                                        ejecucionCorrecta = true;
                                        break;
                                    default:
                                        System.err.println("Opción incorrecta.");
                                }
                            } catch (InputMismatchException e){
                                System.err.println("Formato incorrecto.");
                                sc.nextLine();
                            }
                        }
                        break;
                    case 7:
                        mostrarMenu();
                        break;
                    default:
                        System.err.println("Opción incorrecta.");
                }
            } catch (InputMismatchException e){
                System.err.println("Formato incorrecto.");
                sc.nextLine();
            }
        }

        System.out.println("Saliendo del programa...");
    }

    public static void mostrarMenu(){
        System.out.println("""
                0. Salir de la lista de reproducción.
                1. Reproducir siguiente canción de la lista.
                2. Reproducir la canción previa de la lista.
                3. Repetir la canción actual.
                4. Imprimir la lista de canciones en la playlist.
                5. Eliminar canción actual de la playlist.
                6. Mostrar listado de albumes.
                7. Volver a imprimor el menú.""");
    }

    public static void mostrarAlbumes(ArrayList<Album> albumes){
        for (int i = 0;  i < albumes.size(); i++){
            System.out.println((i) + " | " + albumes.get(i).toString());
        }
    }

    public static void opcMenuAlbumes(){
        System.out.println("""
                1. Listado de canciones por álbum.
                2. Salir.""");
    }
}

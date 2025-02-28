// DANIEL JOSÉ GARCÍA QUIRANT - 1ºJ DAW

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean salirPrograma = false;
        ArrayList<Escritor> escritores = new ArrayList<>();

        Escritor escritor1 = new Escritor("Julio Verne");
        Escritor escritor2 = new Escritor("Javier Castillo");

        escritores.add(escritor1);
        escritores.add(escritor2);
        Libro libro1 = new Libro(12, "De la tierra a la luna", 15.5, 1212, 176,  new Autor("Julio Verne", "jverne@gmail.com"));
        Libro libro2 = new Libro(21, "Miguel Strogoff", 18.9, 1234, 345, new Autor("Julio Verne", "jverne@gmail.com"));
        Libro libro3 = new Libro(23, "El juego del alma", 20, 3333, 234, new Autor("Javier Castillo", "jcastillo@gmail.com"));
        Libro libro4 = new Libro(54, "Cinco semanas en globo", 12.5, 1223, 243, new Autor("Julio Verne", "jverne@gmail.com"));
        escritores.get(0).AddLibro(libro1);
        escritores.get(0).AddLibro(libro2);
        escritores.get(0).AddLibro(libro4);
        escritores.get(1).AddLibro(libro3);

        while (!salirPrograma){
            menuPrincipal();
            switch (solicitarOPC()){
                case 0:
                    System.out.println("SALIENDO DEL PROGRAMA...");
                    salirPrograma = true;
                    break;
                case 1:
                    System.out.println("CREACIÓN DE UN ESCRITOR NUEVO:");
                    escritores.add(new Escritor(Solicitudes.solicitarNombreEscritor()));
                    break;
                case 2:
                    System.out.println("LISTADO DE ESCRITORES:");
                    listadoEscritores(escritores);
                    int opc = solicitarOPC();
                    if (opc >= 1 && opc <= escritores.size()){
                        boolean salirEjecucion = false;
                        Escritor escritor = escritores.get((opc-1)); // Se obtiene los datos del escritor....
                        do {
                            mostrarMenu();
                            switch (solicitarOPC()){
                                case 0:
                                    System.out.println("SALIENDO...");
                                    salirEjecucion = true;
                                    break;
                                case 1:
                                    String autor = Solicitudes.solicitarAutor();
                                    if (Validaciones.validarCoincidenciaAutor(autor, escritor.getNombre())){ // Si coincide...
                                        String email = Solicitudes.solicitarEmail(); // Por si en X día el escritor tiene un email, y otro día otro email registrado.
                                        int numRef = Solicitudes.solicitarNumRef();
                                        if (Validaciones.validarNoExistenciaNumref(numRef, escritor.getLibrosAutor())){ // Si no existe....
                                            String nombre = Solicitudes.solicitarNombreLibro();
                                            double precio = Solicitudes.solicitarPrecio();
                                            int isbn = Solicitudes.solicitarISBN();
                                            if (Validaciones.validarNoExistenciaISBN(isbn, escritor.getLibrosAutor())){ // Si no existe....
                                                int numPag = Solicitudes.solicitarNumPag();
                                                escritor.AddLibro(new Libro(numRef, nombre, precio, isbn, numPag, new Autor(escritor.getNombre(), email)));
                                                System.out.println("CREADO EXISTOSAMENTE.");
                                            }
                                        } else {
                                            System.out.println("NO CREADO EXISTOSAMENTE.");
                                        }
                                    } else {
                                        System.out.println("NO CREADO EXISTOSAMENTE.");
                                    }
                                    break;
                                case 2:
                                    int isbn = Solicitudes.solicitarISBN();
                                    escritor.RemLibro(isbn);
                                    break;
                                case 3:
                                    isbn = Solicitudes.solicitarISBN();
                                    Libro resultBusq = escritor.BuscarLibro(isbn);
                                    if (resultBusq == null){
                                        System.err.println("ERROR. Libro no encontrado.");
                                    } else {
                                        System.out.println(resultBusq);
                                    }
                                    break;
                                case 4:
                                    String nombre = Solicitudes.solicitarNombreLibro();
                                    resultBusq = escritor.BuscarLibro(nombre);
                                    if (resultBusq == null){
                                        System.err.println("ERROR. Libro no encontrado.");
                                    } else {
                                        System.out.println(resultBusq);
                                    }
                                    break;
                                case 5:
                                    escritor.libroMasEconomico();
                                    break;
                                case 6:
                                    System.out.println("INFORMACIÓN ESCRITOR:");
                                    System.out.println(escritor);
                                    System.out.println("----------------------------------------------------------------------");
                                    escritor.recorrerListadoLibros();
                                    break;
                                default:
                                    System.err.println("ERROR. Opción incorrecta.");
                            }
                        } while (!salirEjecucion);
                    } else {
                        System.err.println("ERROR. El escritor no existe.");
                    }
                    break;
                default:
                    System.err.println("ERROR. Opción incorrecta.");
            }
        }
    }

    public static void menuPrincipal(){
        System.out.println("""
                0. Salir.
                1. Registrar un nuevo escritor.
                2. Escoger un escritor.""");
    }

    public static void mostrarMenu(){
        System.out.println("""
                0. Salir
                1. Agregar libro.
                2. Eliminar libro.
                3. Buscar libro por ISBN.
                4. Buscar libro por nombre de Artículo.
                5. Libro más económico.
                6. Mostrar colección.""");
    }

    public static int solicitarOPC(){
        Scanner sc = new Scanner(System.in);
        boolean ejecucionCorrecta = false;
        int opc = -1;
        do {
            try {
                System.out.println("Seleccione una opción:");
                String entrada = sc.nextLine().trim();
                opc =  Integer.parseInt(entrada);
                ejecucionCorrecta = true;
            } catch (NumberFormatException e){
                System.err.println("ERROR. Formato incorrecto. Tipo de dato solicitado: Número.");
            }
        } while (!ejecucionCorrecta);
        return opc;
    }

    public static void listadoEscritores(ArrayList<Escritor> escritores){
        int i = 0;
        for (Escritor escritor : escritores){
            System.out.println((i+1) + " | " + escritor.getNombre());
            i++;
        }
    }
}
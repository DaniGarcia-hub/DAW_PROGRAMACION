package UD5Tarea4.Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Juguete> juguetes = new ArrayList<>();
        ArrayList<Comida> comidas = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();

        boolean salirMenu = false;

        while (!salirMenu){
            switch (mostrarMenu()){
                case 1:
                    boolean salirCrearObjetos = false;

                    while (!salirCrearObjetos){
                        sc.nextLine();

                        switch (objetoCrear()){
                            case 1:
                                comidas.add(crearComida());
                                break;
                            case 2:
                                juguetes.add(crearJuguete());
                                break;
                            case 3:
                                libros.add(crearLibro());
                                break;
                            case 4:
                                System.out.println("Saliendo...");
                                salirCrearObjetos = true;
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("IMPUESTOS JUGUETES.");
                    impuestosJuguetes(juguetes);
                    System.out.println("\nIMPUESTOS LIBROS.");
                    impuestosLibros(libros);
                    System.out.println("\nIMPUESTOS COMIDAS.");
                    System.out.println("¡No tienen impuesto!\n");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    salirMenu = true;
                    break;
                default:
                    System.err.println("Opción inválida.");
            }
        }
    }

    public static int mostrarMenu(){
        System.out.println("""
                Ejercicio 4.
                
                1. Introducir un nuevo objeto.
                2. Calcular impuestos de todos.
                3. Salir del programa.""");

        return sc.nextInt();
    }

    public static int objetoCrear(){
        System.out.println("""
                ¿Que objeto quieres crear?:
                
                1. Comida (No impuestos).
                2. Juguete.
                3. Libro.
                4. Dejar de crear objetos.""");

        return sc.nextInt();
    }

    public static void impuestosJuguetes(ArrayList<Juguete> juguetes){
        for (Juguete juguete : juguetes){
            System.out.println("Impuesto " + juguete.getDescripcion() + " es " + juguete.calcularImpuestos(juguete.getPrecio()));
        }
    }

    public static void impuestosLibros(ArrayList<Libro> libros){
        for (Libro libro : libros){
            System.out.println("Impuesto " + libro.getDescripcion() + " es " + libro.calcularImpuestos(libro.getPrecio()));
        }
    }

    public static Juguete crearJuguete(){
        System.out.println("Introduce la descripción del juguete:");
        String desc = sc.next();
        sc.nextLine();

        System.out.println("Introduce el precio:");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.println("Introduce una edad aceptable para el uso del juguete:");
        int edad = sc.nextInt();

        return new Juguete(desc, precio, edad);
    }

    public static Comida crearComida(){
        System.out.println("Introduce la descripción de la comida:");
        String desc = sc.next();
        sc.nextLine();

        System.out.println("Introduce el precio:");
        double precio = sc.nextDouble();

        System.out.println("Introduce cuantas calorias tiene:");
        double calorias = sc.nextDouble();

        return new Comida(desc, precio, calorias);
    }

    public static Libro crearLibro(){
        System.out.println("Introduce la descripción del libro:");
        String desc = sc.next();
        sc.nextLine();

        System.out.println("Introduce el precio:");
        double precio = sc.nextDouble();

        System.out.println("Introduce el autor:");
        String autor = sc.nextLine();

        return new Libro(desc, precio, autor);
    }
}

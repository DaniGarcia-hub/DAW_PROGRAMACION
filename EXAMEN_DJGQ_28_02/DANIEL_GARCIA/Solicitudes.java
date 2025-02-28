// DANIEL JOSÉ GARCÍA QUIRANT - 1ºJ DAW

import java.util.Scanner;

public class Solicitudes {
    public static String solicitarNombreEscritor(){
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        do {
            System.out.println("Introduce el nombre del escritor:");
            nombre = sc.nextLine();
        } while (!Validaciones.validarNombre(nombre));
        return nombre;
    }

    public static String solicitarEmail(){
        Scanner sc = new Scanner(System.in);
        String email = "";
        do {
            System.out.println("Introduce el email:");
            email = sc.nextLine();
        } while (!Validaciones.validarEmail(email));
        return email;
    }

    public static int solicitarNumRef(){
        Scanner sc = new Scanner(System.in);
        int numref = -1;
        do {
            try {
                System.out.println("Introduce el número de referencia:");
                String entrada = sc.nextLine().trim();
                numref = Integer.parseInt(entrada);
            } catch (NumberFormatException e){
                System.err.println("ERROR. Formato incorrecto. Tipo de dato solicitado: Número.");
            }
        } while (!Validaciones.validarNumRef(numref));
        return numref;
    }

    public static String solicitarNombreLibro(){
        Scanner sc = new Scanner(System.in);
        String nombreLibro = "";
        do {
            System.out.println("Introduce el nombre del libro:");
            nombreLibro = sc.nextLine();
        } while (!Validaciones.validarNombre(nombreLibro));
        return nombreLibro;
    }

    public static double solicitarPrecio(){
        Scanner sc = new Scanner(System.in);
        double precio = -1;
        do {
            try {
                System.out.println("Introduce el precio:");
                String entrada = sc.nextLine().trim();
                precio = Double.parseDouble(entrada);
            } catch (NumberFormatException e){
                System.err.println("ERROR. Formato incorrecto. Tipo de dato solicitado: Número.");
            }
        } while (!Validaciones.validarPrecio(precio));
        return precio;
    }

    public static int solicitarISBN(){
        Scanner sc = new Scanner(System.in);
        int ISBN = -1;
        do {
            try{
                System.out.println("Introduce el ISBN:");
                String entrada = sc.nextLine().trim();
                ISBN = Integer.parseInt(entrada);
            } catch (NumberFormatException e){
                System.err.println("ERROR. Formato incorrecto. Tipo de dato solicitado: Número.");
            }
        } while (!Validaciones.validarISBN(ISBN));
        return ISBN;
    }

    public static int solicitarNumPag(){
        Scanner sc = new Scanner(System.in);
        int numPag = -1;
        do {
            try{
                System.out.println("Introduce el número de páginas:");
                String entrada = sc.nextLine().trim();
                numPag = Integer.parseInt(entrada);
            } catch (NumberFormatException e){
                System.err.println("ERROR. Formato incorrecto. Tipo de dato solicitado: Número.");
            }
        } while (!Validaciones.validarNumPag(numPag));
        return numPag;
    }

    public static String solicitarAutor(){
        Scanner sc = new Scanner(System.in);
        String autor = "";
        do {
            System.out.println("Introduce el nombre del autor:");
            autor = sc.nextLine();
        } while (!Validaciones.validarNombre(autor));
        return autor;
    }
}

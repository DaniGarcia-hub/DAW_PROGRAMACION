// DANIEL JOSÉ GARCÍA QUIRANT - 1ºJ DAW

import java.util.ArrayList;

public class Validaciones {
    private static final int longitudNumRef = 999;
    private static final int longitudISBN = 9999;

    public static boolean validarNombre(String nombre){
        boolean resultado = true;
        for (int i = 0; i < nombre.length(); i++){
            if (!Character.isLetter(nombre.charAt(i))){
                if (!Character.isSpaceChar(nombre.charAt(i))){
                    System.err.println("ERROR. Solo se permiten letras en el nombre.");
                    resultado = false;
                    break;
                }
            }
        }
        return resultado;
    }

    public static boolean validarEmail(String email){
        boolean resultado = true;
        for (int i = 0;i < email.length(); i++){
            if (Character.isSpaceChar(email.charAt(i))){
                System.err.println("ERROR. No se permiten espacios.");
                resultado = false;
                break;
            }
        }
        return resultado;
    }

    public static boolean validarNumRef(int numRef){
        boolean resultado = true;
        if (numRef < 0){
            System.err.println("ERROR. No se permite un número de referencia negativo.");
            resultado = false;
        } else if (numRef > longitudNumRef) {
            System.err.println("ERROR. La mayor cantidad de dígitos permitida es de 3 carácteres.");
            resultado = false;
        }
        return resultado;
    }

    public static boolean validarPrecio(double precio){
        boolean resultado = true;
        if (precio < 0){
            System.err.println("ERROR. No se permite un precio con un valor negativo.");
            resultado = false;
        }
        return resultado;
    }

    public static boolean validarISBN(int ISBN){
        boolean resultado = true;
        if (ISBN < 1000){
            System.err.println("ERROR. El ISBN no puede contener menos de 4 carácteres.");
            resultado =  false;
        } else if (ISBN > longitudISBN) {
            System.err.println("ERROR. El ISBN no puede contener más de 4 carácteres.");
            resultado =  false;
        }
        return resultado;
    }

    public static boolean validarNumPag(int numpag){
        if (numpag < 1){
            System.err.println("ERROR. Debe de contener al menos 1 página.");
            return false;
        }
        return true;
    }

    public static boolean validarNoExistenciaISBN(int ISBN, ArrayList<Libro> libros){
        for (Libro libro : libros){
            if (libro.getIsbn() == ISBN){
                System.err.println("ERROR. ISBN ya registrado. No se puede repetir ISBN.");
                return false;
            }
        }
        return true;
    }

    public static boolean validarNoExistenciaNumref(int numRef, ArrayList<Libro> libros){
        for (Libro libro : libros){
            if (libro.getNumref() == numRef){
                System.err.println("ERROR. Número de referencia ya registrado. No se puede repetir número de referencia.");
                return false;
            }
        }
        return true;
    }

    public static boolean validarCoincidenciaAutor(String autor, String nombreEscritor){
        if (!autor.equalsIgnoreCase(nombreEscritor)){
            System.err.println("ERROR. Este libro no pertenece a la colección de este escritor.");
            return false;
        }
        return true;
    }
}

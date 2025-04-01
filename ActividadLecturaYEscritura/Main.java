package ActividadLecturaYEscritura;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File archivo = importarFichero("C:\\Users\\bytro\\Downloads\\jugadores.txt");
        if (archivo == null){
            System.err.println("ERROR. Archivo no encontrado.");
        } else {
            try {
                FileReader archivoLectura = new FileReader(archivo);
                BufferedReader bufferedReader = new BufferedReader(archivoLectura);
                String cadena = bufferedReader.readLine();
                ArrayList<String> contenido = new ArrayList<>();
                while (cadena != null){
                    if (Character.isDigit(cadena.charAt(0))){
                        String[] contenidoDesmontado = desmontarContenido(cadena);
                        if (estaAlojado(contenidoDesmontado)){
                            String content = "   " + contenidoDesmontado[0] + " -- " + contenidoDesmontado[2];
                            contenido.add(content);
                            System.out.println(content);
                        }
                    }
                    cadena = bufferedReader.readLine();
                }
                bufferedReader.close();
                if(exportarDatos(contenido)){
                    System.out.println("\nSISTEMA DE ARCHIVOS: DATOS EXPORTADOS CORRECTAMENTE.");
                }
            } catch (FileNotFoundException e){
                System.err.println("ERROR. Archivo no encontrado.");
            } catch (IOException e) {
                System.err.println("ERROR. No se ha podido leer el fichero.");
            }
        }
    }

    public static File importarFichero(String path){
        File archivo = new File(path);
        if (!archivo.exists()){
            return null;
        }
        return archivo;
    }

    public static String[] desmontarContenido(String frase){
        return frase.split(";");
    }

    public static boolean estaAlojado(String[] contenido){
        boolean contieneH = false;
        for (int i = 0; i < contenido[7].length(); i++){
            if (contenido[7].toUpperCase().charAt(i) == 'H'){
                contieneH = true;
                break;
            }
        }
        return contieneH;
    }

    public static boolean exportarDatos(ArrayList<String> contenido){
        try {
            FileWriter archivo = new FileWriter("C:\\Users\\bytro\\Downloads\\personasAlojadas.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(archivo);
            bufferedWriter.write("Lista de jugadores alojados en Hotel Melià");
            bufferedWriter.write("\n\nRanking        Nombre");
            bufferedWriter.write("\n---------------------------------------\n");
            for (String contenidoExportar : contenido){
                bufferedWriter.write(contenidoExportar + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e){
            System.err.println("ERROR. No se ha podido registrar los datos.");
            return false;
        }
        return true;
    }
}

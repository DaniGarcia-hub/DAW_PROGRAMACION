package UD5Tarea2.Ejercicio2;

public class Archivo {
    protected String nombreArchivo, formato;

    public Archivo(String nombreArchivo, String formato){
        this.nombreArchivo = nombreArchivo;
        this.formato = formato;
    }

    public String obtenerNombre() {
        return nombreArchivo;
    }

    public void cambiarNombre(String nombre) {
        this.nombreArchivo = nombre;
    }

    public String obtenerFormato() {
        return formato;
    }

    public void cambiarFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Archivo{" +
                "nombreArchivo='" + nombreArchivo + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}

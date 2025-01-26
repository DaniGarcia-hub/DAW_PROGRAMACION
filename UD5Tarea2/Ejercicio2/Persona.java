package UD5Tarea2.Ejercicio2;

public class Persona {
    String nombre, numTelefono;
    int edad;

    public Persona(String nombre, String numTelefono, int edad){
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.edad = edad;
    }

    public String infoTelefono(){
        return numTelefono;
    }

    public void actualizarTelefono(String nuevoTelefono){
        this.numTelefono = nuevoTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String datosPersona() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}

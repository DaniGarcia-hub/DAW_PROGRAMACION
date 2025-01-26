package UD5Tarea2.Ejercicio2;

import java.util.Arrays;

public class Whatsapp {
    private boolean estado;
    private Foto foto;
    private Video video;
    private Llamada llamada;
    private Logs log;

    public Whatsapp(Foto foto, Video video) {
        this.foto = foto;
        this.video = video;
        this.estado = false;
    }

    public void activarAPP(){
        System.out.println("Abriendo Whatsapp");
        estado = !estado;
        this.log = new Logs("whatsapplog_23012025", "23/01/2025");
    }

    public boolean estadoAPP(){
        return estado;
    }

    public void empezarLlamada(Persona persona1, Persona persona2){
        System.out.println("Llamando a " + persona2.getNombre() + ", con número de teléfono: " + persona2.infoTelefono());
        this.llamada = new Llamada();
    }

    public Foto getFoto() {
        return foto;
    }

    public Video getVideo() {
        return video;
    }

    public Llamada llamada(){
        return llamada;
    }

    public Logs log(){
        return log;
    }

    public void mostrarRegistroArchivos(){
        System.out.println("Información Log:\n" + "Nombre del fichero: " + log.infoNombre() + "\nFecha del fichero: " + log.infoFecha());
        System.out.println(Arrays.deepToString(log.infoRegistroFotos()));
    }
}

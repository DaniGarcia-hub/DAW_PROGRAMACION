package UD5Tarea2.Ejercicio2;

public class Logs {
    private String nombreLog, fechaLog;
    private Foto[] fotos;
    private Video[] videos;
    private Llamada[] llamadas;

    private int contFotos;
    private int contVideos;
    private int contLlamadas;

    public Logs(String nombreLog, String fechaLog){
        this.nombreLog = nombreLog;
        this.fechaLog = fechaLog;
        this.fotos = new Foto[5];
        this.videos = new Video[5];
        this.contFotos = 0;
        this.contVideos = 0;
        this.contLlamadas = 0;
    }

    public void registrarFoto(Foto foto){
        if (contFotos < fotos.length){
            this.fotos[contFotos] = foto;
            contFotos++;
        } else {
            System.err.println("FOTOS. Tamaño del log lleno. No se ha podido registrar la foto.");
        }
    }

    public void registrarVideo(Video video){
        if (contVideos < videos.length){
            this.videos[contVideos] = video;
            contVideos++;
        } else {
            System.err.println("VIDEOS. Tamaño del log lleno. No se ha podido registrar el video.");
        }
    }

    public void registrarLlamada(Llamada llamada){
        if (contLlamadas < llamadas.length){
            this.llamadas[contLlamadas] = llamada;
        } else {
            System.err.println("LLAMADAS. Tamaño del log lleno. No se ha podido registrar la llamada.");
        }
    }

    public void renombrarLog(String nuevoNombre){
        this.nombreLog = nuevoNombre;
    }

    public String infoNombre(){
        return nombreLog;
    }

    public String infoFecha(){
        return fechaLog;
    }

    public Foto[] infoRegistroFotos(){
        return fotos;
    }

    public Video[] infoRegistroVideos(){
        return videos;
    }

    public Llamada[] infoRegistroLlamadas(){
        return llamadas;
    }
}

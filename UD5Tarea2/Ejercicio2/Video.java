package UD5Tarea2.Ejercicio2;

public class Video extends Archivo {
    private int duracion, calidadVideo;
    private boolean estadoGrabacion;

    public Video(String nombreArchivo, String formato, int duracion, int calidadVideo) {
        super(nombreArchivo, formato);
        this.duracion = duracion;
        this.calidadVideo = calidadVideo;
        this.estadoGrabacion = false;
    }

    public int infoDuracion() {
        return duracion;
    }

    public void recortarVideo(int nuevaDuracion) {
        if (duracion < nuevaDuracion){
            System.out.println("No se puede recortar un video, y tener una duración mayor a la original.");
        } else this.duracion = nuevaDuracion;
    }

    public int getCalidadVideo() {
        return calidadVideo;
    }

    public void establecerCalidad(int calidadVideo) {
        this.calidadVideo = calidadVideo;
    }

    public void grabar(){
        if (!estadoGrabacion){
            System.out.println("Empezando a grabar...");
            estadoGrabacion = !estadoGrabacion;
        } else {
            System.out.println("Parando la grabación.");
            System.out.println("Datos video: " + toString());
            estadoGrabacion = !estadoGrabacion;
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "\nduracion=" + duracion +
                ", \ncalidadVideo=" + calidadVideo +
                ", \nestadoGrabacion=" + estadoGrabacion +
                ", \nnombreArchivo='" + nombreArchivo + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}

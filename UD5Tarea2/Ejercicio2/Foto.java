package UD5Tarea2.Ejercicio2;

public class Foto extends Archivo {
    private int tamanoX, tamanoY;

    public Foto(String nombreArchivo, String formato, int tamanoX, int tamanoY){
        super(nombreArchivo, formato);
        this.tamanoX = tamanoX;
        this.tamanoY = tamanoY;
    }

    public void cambiarTamano(int tamanoX, int tamanoY) {
        this.tamanoX = tamanoX;
        this.tamanoY = tamanoY;
    }

    public int getTamanoX() {
        return tamanoX;
    }

    public int getTamanoY() {
        return tamanoY;
    }

    public void hacerFoto(){
        System.out.println("Haciendo foto...\n¡Se ha hecho una foto!");
        System.out.println("Datos fotos: \n" + toString());
    }

    @Override
    public String toString() {
        return "Foto{" +
                "\ntamanoX=" + tamanoX +
                ", \ntamanoY=" + tamanoY +
                ", \nnombreArchivo='" + nombreArchivo + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}

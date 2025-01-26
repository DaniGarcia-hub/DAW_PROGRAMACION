package UD5Tarea2.Ejercicio1;

public class Cama {
    private String estilo;
    private String almohadas;
    private int altura, sabanas, colcha;

    public Cama(String estilo, String almohadas, int altura, int sabanas, int colcha){
        this.estilo = estilo;
        this.almohadas = almohadas;
        this.altura = altura;
        this.sabanas = sabanas;
        this.colcha = colcha;
    }

    public void hacer(){
        System.out.println("Se ha hecho la cama");
    }

    public String getEstilo() {
        return estilo;
    }

    public String getAlmohadas() {
        return almohadas;
    }

    public int getAltura() {
        return altura;
    }

    public int getSabanas() {
        return sabanas;
    }

    public int getColcha() {
        return colcha;
    }
}

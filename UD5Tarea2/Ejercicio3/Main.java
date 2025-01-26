package UD5Tarea2.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Toner toner1 = new Toner("AWK234", "Nike", 18);
        Toner toner2 = new Toner("Patata", "Chorizo", 15);

        Impresora sinDobleCara = new Impresora(toner1, 2, false);
        Impresora dobleCara = new Impresora(toner2, 3, true);

        System.out.println("Nivel de toner 1: " + toner1.nivelToner());
        System.out.println("Nivel de toner 2: " + toner2.nivelToner());

        sinDobleCara.imprimirPaginas(6);
        System.out.println("Registro cantidad impresiones: " + sinDobleCara.getNumPaginas());

        dobleCara.imprimirPaginas(2);
        System.out.println("Registro cantidad impresiones: " + dobleCara.getNumPaginas());

        System.out.println();

        dobleCara.imprimirPaginas(3);
        System.out.println("Registro cantidad impresiones: " + dobleCara.getNumPaginas());

        System.out.println();
        System.out.println("Cantidad tóner: " + sinDobleCara.anadirToner(90));
        System.out.println("Cantidad tóner: " + dobleCara.anadirToner(-75));
    }
}

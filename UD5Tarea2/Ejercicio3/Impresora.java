package UD5Tarea2.Ejercicio3;

public class Impresora {
    private int numPaginas;
    private boolean esDobleCara;
    private Toner toner;

    public Impresora(Toner toner, int numPaginas, boolean esDobleCara){
        this.toner = toner;
        this.numPaginas = numPaginas;
        this.esDobleCara = esDobleCara;
    }

    public int anadirToner(int cantidadToner){
        if (cantidadToner < 0 || cantidadToner > 100){
            System.err.println("ERROR. Introduce una cantidad de tóner válida (0-100).");
            return -1;
        } else if ((this.toner.nivelToner() + cantidadToner) > 100) {
            this.toner.actualizarCantidad(100);
            return this.toner.nivelToner();
        } else {
            this.toner.actualizarCantidad(this.toner.nivelToner() + cantidadToner);
            return this.toner.nivelToner();
        }
    }

    public void imprimirPaginas(int cantidadImprimir){
        if (this.esDobleCara && cantidadImprimir%2!=0){
            int calculo = ((cantidadImprimir/2)+1);
            infoPaginasImprimir(calculo);
            actualizarNumPaginas(calculo);
        } else if (this.esDobleCara && cantidadImprimir%2==0) {
            int calculo = cantidadImprimir/2;
            infoPaginasImprimir(calculo);
            actualizarNumPaginas(calculo);
        } else {
            infoPaginasImprimir(cantidadImprimir);
            actualizarNumPaginas(cantidadImprimir);
        }
    }

    private void infoPaginasImprimir(int cantidad){
        System.out.println("Páginas a imprimir: " + cantidad);
    }

    private void actualizarNumPaginas(int cantidad){
        this.numPaginas = this.numPaginas + cantidad;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
}

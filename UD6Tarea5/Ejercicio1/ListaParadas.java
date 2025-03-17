package UD6.UD6Tarea5.Ejercicio1;

// Fuente:
// https://programacionfacilestructuradedatos.blogspot.com/p/listas-circulares-en-java.html

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaParadas {
    private Parada primeraParada;
    private Parada ultimaParada;

    public void ListaParada(){
        this.primeraParada = null;
        this.ultimaParada = null;
    }

    public void agregarNuevaParada(String numero, String nombre, String direccion, int tiempoParada){
        Parada nuevaParada = new Parada(numero, nombre, direccion, tiempoParada);
        if (primeraParada == null){
            primeraParada = nuevaParada;
            ultimaParada = nuevaParada;
            ultimaParada.setSiguienteParada(primeraParada);
        } else {
            ultimaParada.setSiguienteParada(nuevaParada);
            nuevaParada.setSiguienteParada(primeraParada);
            ultimaParada = nuevaParada;
        }
    }

    public void listarParadas(){
        Parada paradaTemp = primeraParada;
        do {
            System.out.println(paradaTemp);
            paradaTemp = paradaTemp.getSiguienteParada();
        } while (!paradaTemp.getNumero().equals(primeraParada.getNumero()));
    }

    public ArrayList<Parada> transformarParadasArrayList(){
        ArrayList<Parada> paradas = new ArrayList<>();
        Parada paradaTemp = primeraParada;
        do {
            paradas.add(paradaTemp);
            paradaTemp = paradaTemp.getSiguienteParada();
        } while (!paradaTemp.getNumero().equals(primeraParada.getNumero()));
        return paradas;
    }

    public void ejecutarCalculo(Parada paradaInicial, Parada paradaDestino, Linea lineaEscogida){
        int contTiempo = 0;
        Map<Integer, String> desglose = new HashMap<>();
        if (paradaInicial.getLineas().contains(lineaEscogida) && paradaDestino.getLineas().contains(lineaEscogida)){
            Parada paradaAnt = null;
            Parada paradaTemp = lineaEscogida.getListaParadas().getPrimeraParada();
            while (!paradaTemp.getNumero().equals(paradaInicial.getNumero())){
                paradaTemp = paradaTemp.getSiguienteParada();
            }
            paradaAnt = paradaTemp;
//            contTiempo += paradaTemp.getTiempoParada();
            int contador = 0;
            do {
                contador++;
                paradaTemp = paradaTemp.getSiguienteParada();
                desglose.put(contador, lineaEscogida.getIdentificador() + " desde " + paradaAnt.getNumero() + " hasta " + paradaTemp.getNumero() + " - " + paradaTemp.getTiempoParada());
                contTiempo += paradaTemp.getTiempoParada();
                paradaAnt = paradaTemp;
            } while (!paradaTemp.getNumero().equals(paradaDestino.getNumero()));

            System.out.println("Duración trayecto: " + contTiempo);
            for (int i = 1; i <= desglose.size(); i++){
                System.out.println(desglose.get(i));
            }
        } else {
            System.err.println("ERROR. La línea desde la que partes, no pasa por la línea de la parada destino.");
        }
    }

    public Parada getPrimeraParada() {
        return primeraParada;
    }

    public Parada getUltimaParada() {
        return ultimaParada;
    }
}
